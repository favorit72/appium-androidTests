package javaTests.pageObjects;


import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends DriverWait {
    public LoginPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    /**
     * Кнопки
     */
    @AndroidFindBy(id = "com.rubetek.client:id/signIn")
    public MobileElement startUsing;
    @AndroidFindBy(id = "com.rubetek.client:id/authorizeButton")
    public MobileElement nextButton;
    @AndroidFindBy(id = "com.rubetek.client:id/tvForgottenPassword")
    public MobileElement forgotThePassword;

    /**
     * поля
     */
    @AndroidFindBy(id = "com.rubetek.client:id/etPhone")
    public MobileElement phoneField;
    @AndroidFindBy(id = "com.rubetek.client:id/etPassword")
    public MobileElement passwordField;
    @AndroidFindBy(id = "com.rubetek.client:id/etCode")
    public MobileElement smsCodeField;

    /**
     * тексты на экране
     */
    @AndroidFindBy(id = "com.rubetek.client:id/tvPhoneTitle")
    public MobileElement loginTitle;
    @AndroidFindBy(id = "com.rubetek.client:id/phoneSubtext")
    public MobileElement subTextLogin;
    @AndroidFindBy(id = "android:id/text")
    public MobileElement smsTextCode;
    @AndroidFindBy(id = "com.rubetek.client:id/snackbar_text")
    public MobileElement snackbar;
    @AndroidFindBy(id = "com.rubetek.client:id/checkCodeDesc")
    public MobileElement smsCodeTitle;
    @AndroidFindBy(id = "com.rubetek.client:id/codeSubtext")
    public MobileElement subTextSmsCode;
    @AndroidFindBy(id = "com.rubetek.client:id/tvPasswordTitle")
    public MobileElement insertPasswordTitle;
}

