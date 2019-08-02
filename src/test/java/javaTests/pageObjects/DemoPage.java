package javaTests.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;

public class DemoPage {

    @AndroidFindBy(id = "com.rubetek.client:id/btn_demo")
    public MobileElement demoMode;

    @Step("Нажимаем на кнопку Демо-режим")
    public void clickDemoButton() {
        demoMode.click();
    }

    public DemoPage(AppiumDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

}
