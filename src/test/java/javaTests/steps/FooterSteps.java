package javaTests.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.FooterPage;

public class FooterSteps {
    private final FooterPage footerPage;

    public FooterSteps(AndroidDriver androidDriver) {
        footerPage = new FooterPage(androidDriver);
    }

    @Step("Нажимаем на вкладку список устройств")
    public void clickDeviceList() {
        footerPage.waitForElementToClick(footerPage.deviceList).click();
    }

    @Step("Нажимаем на вкладку сценарии")
    public void clickScenarios() {
        footerPage.waitForElementToClick(footerPage.scenarioList).click();
    }

    @Step("Нажимаем на вкладку событий")
    public void clickEvents() {
        footerPage.waitForElementToClick(footerPage.eventCounter).click();
    }

    @Step("Нажимаем на вкладку статистики")
    public void clickStatistics() {
        footerPage.waitForElementToClick(footerPage.scenarioList).click();
    }

    @Step("Нажимаем на вкладку камер")
    public void clickCameras() {
        footerPage.waitForElementToClick(footerPage.cameraList).click();
    }

    @Step("Счетчик событий")
    public void eventCounter() {
        footerPage.waitForElementIsDisplayed(footerPage.eventCounter);
    }

}
