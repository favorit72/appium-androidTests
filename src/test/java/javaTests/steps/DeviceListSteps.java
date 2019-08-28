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

    @Step("Ставим дом на охрану")
    public void securityModeOn() {
        String securityStatus;
        securityStatus = deviceListPage.waitForElementToClick(deviceListPage.securityStatus).getText();
        if ("Дом снят с охраны".equals(securityStatus)) {
            deviceListPage.waitForElementToClick(deviceListPage.securityModeBtn).click();
        }
    }

    @Step("Состояние охраны дома")
    public void checkSecurityModeText() {
        String securityStatus;
        securityStatus = deviceListPage.waitForElementToClick(deviceListPage.securityStatus).getText();
        Assert.assertEquals(securityStatus, "Дом снят с охраны");
    }
}