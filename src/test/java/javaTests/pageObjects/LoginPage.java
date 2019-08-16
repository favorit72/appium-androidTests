package javaTests.pageObjects;


import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

//все локаторы при авторизации
public class LoginPage extends DriverWait {
    public LoginPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //КНОПКИ:
    //Начать пользоваться
    @AndroidFindBy(id = "com.rubetek.client:id/signIn")
    public MobileElement startUsingBtn;

    //Кнопка далее
    @AndroidFindBy(id = "com.rubetek.client:id/authorizeButton")
    public MobileElement nextButton;

    //Забыли пароль
    @AndroidFindBy(id = "com.rubetek.client:id/tvForgottenPassword")
    public MobileElement forgotThePasswordBtn;

    //ПОЛЯ:
    //Поле ввода телефона
    @AndroidFindBy(id = "com.rubetek.client:id/etPhone")
    public MobileElement phoneField;

    //Поле ввода пароля
    @AndroidFindBy(id = "com.rubetek.client:id/etPassword")
    public MobileElement passwordField;

    //Поле ввода смс-кода
    @AndroidFindBy(id = "com.rubetek.client:id/etCode")
    public MobileElement smsCodeField;

    //ТЕКСТЫ НА ЭКРАНЕ:
    //заголовок экрана логин
    @AndroidFindBy(id = "com.rubetek.client:id/tvPhoneTitle")
    public MobileElement loginTitle;

    //подпись поля логин
    @AndroidFindBy(id = "com.rubetek.client:id/phoneSubtext")
    public MobileElement subTextLogin;

    //смс-код в шторке
    @AndroidFindBy(id = "android:id/text")
    public MobileElement smsTextCode;

    //снекбар
    @AndroidFindBy(id = "com.rubetek.client:id/snackbar_text")
    public MobileElement snackbar;

    //заголовок экрана ввода смс-кода
    @AndroidFindBy(id = "com.rubetek.client:id/checkCodeDesc")
    public MobileElement smsCodeTitle;

    //подпись поля ввода смс кода
    @AndroidFindBy(id = "com.rubetek.client:id/codeSubtext")
    public MobileElement subTextSmsCode;

    //заголовок экрана ввода пароля
    @AndroidFindBy(id = "com.rubetek.client:id/tvPasswordTitle")
    public MobileElement insertPasswordTitle;

    //префикс
    @AndroidFindBy(id = "com.rubetek.client:id/countryCode")
    public MobileElement phonePrefix;

    //кнопка демо
    @AndroidFindBy(id = "com.rubetek.client:id/btn_demo")
    public MobileElement demoMode;
}

