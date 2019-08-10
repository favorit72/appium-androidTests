package javaTests.steps;


import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.DemoPage;

public class DemoSteps {

    private final DemoPage demoPage;

    public DemoSteps(AppiumDriver<WebElement> driver) {
        demoPage = new DemoPage(driver);
    }

    @Step("Нажимаем демо-режим")
    public void clickDemoButton() {
        demoPage.demoMode.click();
    }
}
