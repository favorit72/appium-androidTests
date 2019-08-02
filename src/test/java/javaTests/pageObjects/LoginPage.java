package javaTests.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

    public LoginPage(AppiumDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.rubetek.client:id/signIn")
    public MobileElement startUsing;
    @AndroidFindBy(id = "com.rubetek.client:id/etPhone")
    public MobileElement phoneField;
    @AndroidFindBy(id = "com.rubetek.client:id/authorizeButton")
    public MobileElement nextButton;
    @AndroidFindBy(id = "com.rubetek.client:id/etPassword")
    public MobileElement passwordField;
    @AndroidFindBy(id = "com.rubetek.client:id/tvForgottenPassword")
    public MobileElement forgotThePassword;
    @AndroidFindBy(id = "com.rubetek.client:id/etCode")
    public MobileElement smsCodeField;
    @AndroidFindBy(id = "com.rubetek.client:id/etPassword")
    public MobileElement newPassword;
    @AndroidFindBy(id = "com.rubetek.client:id/codeSubtext")
    public MobileElement subTextError;
    @AndroidFindBy(id = "android:id/text")
    public MobileElement smsText;

}

