package javaTests.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.DemoPage;

public class DemoSteps {

    private final DemoPage demo;

    public DemoSteps(AndroidDriver androidDriver) {
        demo = new DemoPage(androidDriver);
    }

    @Step("Нажимаем демо-режим")
    public void clickDemoButton() {
        demo.waitForElementToClick(demo.demoMode).click();
    }
}
