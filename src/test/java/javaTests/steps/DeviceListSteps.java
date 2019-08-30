package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.DeviceListPage;

public class DeviceListSteps {

    private final DeviceListPage deviceListPage;

    public DeviceListSteps(AndroidDriver androidDriver) {
        deviceListPage = new DeviceListPage(androidDriver);
    }

    //CLICK:
    @Step("Ставим дом на охрану")
    public void securityModeOn() {
        String securityStatus = deviceListPage.waitForElementIsDisplayed(deviceListPage.securityStatus).getText();
        if ("Дом снят с охраны".equals(securityStatus)) {
            deviceListPage.waitForElementToClick(deviceListPage.securityModeBtn).click();
        }
    }

    @Step("Снимаем дом с охраны")
    public void securityModeOff() {
        String securityStatus = deviceListPage.waitForElementIsDisplayed(deviceListPage.securityStatus).getText();
        if ("Дом поставлен на охрану".equals(securityStatus)) {
            deviceListPage.waitForElementToClick(deviceListPage.securityModeBtn).click();
        }
    }

    //CHECK TEXT:
    @Step("Дом не на охране")
    public void checkSecurityStatusOff() {
        String securityStatus = deviceListPage.waitForElementIsDisplayed(deviceListPage.securityStatus).getText();
        Assert.assertEquals(securityStatus, "Дом снят с охраны");
    }

    @Step("Дом на охране")
    public void checkSecurityStatusOn() {
        String securityStatus = deviceListPage.waitForElementIsDisplayed(deviceListPage.securityStatus).getText();
        Assert.assertEquals(securityStatus, "Дом поставлен на охрану");
    }
}