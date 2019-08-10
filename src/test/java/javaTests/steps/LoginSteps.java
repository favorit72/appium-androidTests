package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.LoginPage;

public class LoginSteps {

    private final LoginPage loginPage;

    public LoginSteps(AndroidDriver androidDriver) {
        loginPage = new LoginPage(androidDriver);
    }

    /**
     * клики
     */
    @Step("Нажимаем начать пользоваться")
    public void clickStartUsingBtn() {
        loginPage.startUsing.click();
    }

    @Step("Нажимаем кнопку далее")
    public void clickNextBtn() {
        loginPage.nextButton.click();
    }

    @Step("Нажимаем забыли пароль")
    public void clickForgotThePasswordBtn() {
        loginPage.forgotThePassword.click();
    }

    /**
     * действия над полями
     */
    @Step("Вводим корректный логин")
    public void insertCorrectPhoneNumber(String number) {
        loginPage.phoneField.sendKeys(number);
    }

    @Step("Вводим корректный пароль")
    public void insertCorrectPassword(String password) {
        loginPage.passwordField.sendKeys(password);
    }

    @Step("Очищаем поле логина")
    public void clearPhoneField() {
        loginPage.phoneField.clear();
    }

    @Step("Очищаем поле пароля")
    public void clearPasswordField() {
        loginPage.passwordField.clear();
    }

    @Step("Очищаем поле смс-код")
    public void clearSmsCodeField() {
        loginPage.smsCodeField.clear();
    }

    @Step("Вводим смс-код")
    public void insertSmsCode(String smsCode) {
        loginPage.smsCodeField.sendKeys(smsCode);
    }

    @Step("Вводим новый пароль")
    public void insertNewPassword(String password) {
        loginPage.passwordField.sendKeys(password);
    }

    /**
     * проверки
     */
    @Step("Проверяем заголовок экрана логин")
    public void checkTextLoginTitle() {
        String loginTitleText = loginPage.loginTitle.getText();
        Assert.assertEquals(loginTitleText, "Введите номер телефона");
    }

    @Step("Кнопка  недоступна")
    public boolean enableAuthorizeBtn() {
        boolean enable = loginPage.nextButton.isEnabled();
        Assert.assertTrue(enable);
        return enable;
    }

    @Step("Проверяем текст ошибки неправильного смс кода в снекбаре")
    public void checkTextIncorrectSmsCode() {
        String textIncorrectSmsCode = loginPage.smsCodeTitle.getText();
        Assert.assertEquals(textIncorrectSmsCode, "Неверный код подтверждения");
    }

    @Step("Проверяем текст кнопки забыли пароль")
    public void checkTextForgotThePasswordBtn() {
        String forgotTextBtn = loginPage.forgotThePassword.getText();
        Assert.assertEquals(forgotTextBtn, "Забыли пароль?");
    }

    @Step("Проверяем текст заголовока экрана введите смс-код")
    public void checkTextSmsCodeTitle() {
        String textTitleSmsCode = loginPage.smsCodeTitle.getText();
        Assert.assertEquals(textTitleSmsCode, "Введите код из смс");
    }

    //В тексте использованы разные пробелы
    @Step("Проверяем подпись поля ввода смс")
    public void checkSubTextSmsCode() {
        String subTextSmsCode = loginPage.subTextSmsCode.getText()
                .replaceAll(" ", "")
                .replaceAll(" ", "");
        Assert.assertEquals(subTextSmsCode, "Мы отправили сообщение с кодом подтверждения на номер +7 ( 960 ) 645 62 30"
                .replaceAll(" ", "")
                .replaceAll(" ", ""));
    }

    @Step("Проверяем заголовок экрана нового пароля")
    public void checkTextNewPasswordTitle() {
        String textTitleNewPassword = loginPage.newPasswordTitle.getText();
        Assert.assertEquals(textTitleNewPassword, "Придумайте пароль");
    }

    /**
     * прочие действия
     */
    @Step("Дергаем смс-код")
    public String getSmsCode() {
        String smsCode = loginPage.smsTextCode.getText();
//        smsCode = smsCode.replaceAll("\\D", "");
//        smsCode = "sms:" + smsCode;
        return smsCode.replaceAll("\\D", "");
    }
}

