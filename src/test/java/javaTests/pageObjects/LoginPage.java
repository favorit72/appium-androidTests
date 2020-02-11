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
    @AndroidFindBy(id = "com.XXX.client:id/signIn")
    public MobileElement startUsingBtn;
    @AndroidFindBy(id = "com.XXX.client:id/authorizeButton")
    public MobileElement nextButton;
    @AndroidFindBy(id = "com.XXX.client:id/tvForgottenPassword")
    public MobileElement forgotThePasswordBtn;
    @AndroidFindBy(xpath = "//*[@content-desc='Перейти вверх']")
    public MobileElement backBtn;

    //Field:
    @AndroidFindBy(id = "com.XXX.client:id/etPhone")
    public MobileElement phoneField;
    @AndroidFindBy(id = "com.XXX.client:id/etPassword")
    public MobileElement passwordField;
    @AndroidFindBy(id = "com.XXX.client:id/etCode")
    public MobileElement smsCodeField;

    //Text:
    @AndroidFindBy(id = "com.XXX.client:id/tvPhoneTitle")
    public MobileElement subTitle;
    @AndroidFindBy(id = "com.XXX.client:id/phoneSubtext")
    public MobileElement loginDescription;
    @AndroidFindBy(id = "android:id/text")
    public MobileElement smsTextCode;
    @AndroidFindBy(id = "com.XXX.client:id/snackbar_text")
    public MobileElement snackbar;
    @AndroidFindBy(id = "com.XXX.client:id/checkCodeDesc")
    public MobileElement smsCodeSubTitle;
    @AndroidFindBy(id = "com.XXX.client:id/codeSubtext")
    public MobileElement subTextSmsCode;
    @AndroidFindBy(id = "com.XXX.client:id/tvPasswordTitle")
    public MobileElement createNewPasswordSubTitle;
    @AndroidFindBy(id = "com.XXX.client:id/countryCode")
    public MobileElement phonePrefix;
    @AndroidFindBy(id = "com.XXX.client:id/btn_demo")
    public MobileElement demoMode;
    @AndroidFindBy(id = "com.XXX.client:id/privacyPolicy")
    public MobileElement privacyPolicy;

    //other elements:
    @AndroidFindBy(id = "com.XXX.client:id/progress")
    public MobileElement progressLoader;
}