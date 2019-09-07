package javaTests.steps;

import javaTests.pageObjects.SpinnerPage;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.DemoPage;

public class DemoSteps {

    private final DemoPage demoPage;
    private final SpinnerPage spinnerPage;

    public DemoSteps(AndroidDriver androidDriver) {
        demoPage = new DemoPage(androidDriver);
        spinnerPage = new SpinnerPage(androidDriver);
    }

    //CLICKS:
    @Step("Нажимаем демо-режим")
    public void clickDemoButton() {
        demoPage.waitForElementToClick(demoPage.demoModeBtn).click();
    }

    @Step("Закрываем демо-дом")
    public void closeDemoHouseBtn() {
        demoPage.waitForElementToClick(demoPage.closeDemoHouseBtn).click();
    }

    //CHECK TEXT:
    @Step("Текст 'Демо' присутствует на кнопке закрытия")
    public void checkCloseDemoBtnText() {
        String closeDemoBtnText;
        closeDemoBtnText = demoPage.waitForElementToClick(demoPage.closeDemoHouseBtn).getText();
        Assert.assertEquals(closeDemoBtnText, "Демо");
    }

    @Step("Название демо-дома 'Мой дом'")
    public void checkDemoHouseNameText() {
        String houseNameText;
        houseNameText = demoPage.waitForElementToClick(demoPage.demoHouseName).getText();
        Assert.assertEquals(houseNameText, "Мой дом");
    }
}
