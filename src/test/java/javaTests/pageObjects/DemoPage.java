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

    @Step("asd")
    public void clickDemoButton() {
        demoMode.click();
//        System.out.println("Start Demo Test");
//        System.out.println("Start Demo Test");
//        System.out.println("Start Demo Test");
    }

    public DemoPage(AppiumDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

}
