package javaTests.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.DemoPage;

public class DemoSteps {

    private final DemoPage demoPage;

    public DemoSteps(AndroidDriver androidDriver) {
        demoPage = new DemoPage(androidDriver);
    }

    @Step("Нажимаем демо-режим")
    public void clickDemoButton() {
        demoPage.waitForElementToClick(demoPage.demoModeBtn).click();
    }
}
