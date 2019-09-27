package javaTests.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.FooterPage;
import org.testng.Assert;

public class FooterSteps {
    private final FooterPage footerPage;

    public FooterSteps(AndroidDriver androidDriver) {
        footerPage = new FooterPage(androidDriver);
    }

    //Click:
    @Step("Нажимаем на вкладку список устройств")
    public void clickDeviceList() throws InterruptedException {
        footerPage.waitForElementToClick(footerPage.deviceList).click();
        Thread.sleep(1000);
        String text = footerPage.deviceListInsetSubText.getText();
        Assert.assertEquals(text, "Устройства");
    }

    @Step("Нажимаем на вкладку сценарии")
    public void clickScenarios() throws InterruptedException {
        footerPage.waitForElementToClick(footerPage.scenarioList).click();
        Thread.sleep(1000);
        String text = footerPage.scenarioInsetSubText.getText();
        Assert.assertEquals(text, "Сценарии");
    }

    @Step("Нажимаем на вкладку событий")
    public void clickEvents() throws InterruptedException {
        footerPage.waitForElementToClick(footerPage.eventsList).click();
        Thread.sleep(1000);
        String text = footerPage.eventInsetSubText.getText();
        Assert.assertEquals(text, "События");
    }

    @Step("Нажимаем на вкладку статистики")
    public void clickStatistics() throws InterruptedException {
        footerPage.waitForElementToClick(footerPage.statisticList).click();
        Thread.sleep(1000);
        String text = footerPage.statisticInsetSubText.getText();
        Assert.assertEquals(text, "Статистика");
    }

    @Step("Нажимаем на вкладку камер")
    public void clickCameras() throws InterruptedException {
        footerPage.waitForElementToClick(footerPage.cameraList).click();
        Thread.sleep(1000);
        String text = footerPage.cameraInsetSubText.getText();
        Assert.assertEquals(text, "Камеры");
    }

    @Step("Счетчик событий")
    public void eventCounter() {
        footerPage.waitForElementIsDisplayed(footerPage.eventCounter);
    }

}
