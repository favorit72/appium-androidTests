package javaTests.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.DeviceListPage;
import org.testng.Assert;

public class DeviceListSteps {

    private final DeviceListPage deviceListPage;
    private final RoomSteps room;

    public DeviceListSteps(AndroidDriver androidDriver) {
        deviceListPage = new DeviceListPage(androidDriver);
        room = new RoomSteps(androidDriver);
    }

    @Step("Текст 'устройств пока нет' присутствует в пустом доме")
    public void checkNotAvailableDevicesText() {
        String text = deviceListPage.waitForElementIsDisplayed(deviceListPage.notAvailableDevices).getText();
        Assert.assertEquals(text, "Устройств пока нет");
    }

    @Step("Разворачиваем комнату Wifi")
    private void rollWifiRoom() {
        deviceListPage.waitForElementIsDisplayed(deviceListPage.roomWifiRoom).click();
    }

    @Step("Розетка отображается в списке устройств")
    public boolean checkWifiSocketInDeviceList() {
        try {
            return deviceListPage.waitForElementIsDisplayed(deviceListPage.wifiSocketName).isDisplayed();
        } catch (Exception e) {
            rollWifiRoom();
            deviceListPage.waitForElementIsDisplayed(deviceListPage.wifiSocketName).isDisplayed();
            return false;
        }
    }
}