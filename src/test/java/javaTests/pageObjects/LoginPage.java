package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends DriverWait {
    public LoginPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //Button:
    @AndroidFindBy(id = "com.rubetek.client:id/signIn")
    public MobileElement startUsingBtn;
    @AndroidFindBy(id = "com.rubetek.client:id/authorizeButton")
    public MobileElement nextButton;
    @AndroidFindBy(id = "com.rubetek.client:id/tvForgottenPassword")
    public MobileElement forgotThePasswordBtn;
    @AndroidFindBy(xpath = "//*[@content-desc='Перейти вверх']")
    public MobileElement backBtn;

    //Field:
    @AndroidFindBy(id = "com.rubetek.client:id/etPhone")
    public MobileElement phoneField;
    @AndroidFindBy(id = "com.rubetek.client:id/etPassword")
    public MobileElement passwordField;
    @AndroidFindBy(id = "com.rubetek.client:id/etCode")
    public MobileElement smsCodeField;

    //Text:
    @AndroidFindBy(id = "com.rubetek.client:id/tvPhoneTitle")
    public MobileElement subTitle;
    @AndroidFindBy(id = "com.rubetek.client:id/phoneSubtext")
    public MobileElement loginDescription;
    @AndroidFindBy(id = "android:id/text")
    public MobileElement smsTextCode;
    @AndroidFindBy(id = "com.rubetek.client:id/snackbar_text")
    public MobileElement snackbar;
    @AndroidFindBy(id = "com.rubetek.client:id/checkCodeDesc")
    public MobileElement smsCodeSubTitle;
    @AndroidFindBy(id = "com.rubetek.client:id/codeSubtext")
    public MobileElement subTextSmsCode;
    @AndroidFindBy(id = "com.rubetek.client:id/tvPasswordTitle")
    public MobileElement createNewPasswordSubTitle;
    @AndroidFindBy(id = "com.rubetek.client:id/countryCode")
    public MobileElement phonePrefix;
    @AndroidFindBy(id = "com.rubetek.client:id/btn_demo")
    public MobileElement demoMode;
    @AndroidFindBy(id = "com.rubetek.client:id/privacyPolicy")
    public MobileElement privacyPolicy;

    //other elements:
    @AndroidFindBy(id = "com.rubetek.client:id/progress")
    public MobileElement progressLoader;
}