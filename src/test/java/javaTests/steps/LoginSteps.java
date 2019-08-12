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

//    public void x() {
//        loginPage.waitForElementToClick(loginPage.startUsing);
//    }

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
    @Step("Вводим правильный логин")
    public void insertCorrectLogin(String number) {
        loginPage.phoneField.sendKeys(number);
    }

    @Step("Вводим неправильный логин")
    public void insertInCorrectLogin(String number) {
        loginPage.phoneField.sendKeys(number);
    }


    @Step("Вводим правильный пароль")
    public void insertCorrectPassword(String password) {
        loginPage.passwordField.sendKeys(password);
    }

    @Step("Вводим неправильный пароль")
    public void insertInCorrectPassword(String password) {
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
     * проверки кнопок на доступность
     */
    @Step("Кнопка далее недоступна")
    public void authorizeBtnIsNotEnable() {
        boolean visibility = loginPage.nextButton.isEnabled();
        Assert.assertFalse(visibility);
    }

    @Step("Кнопка далее доступна")
    public void authorizeBtnIsEnable() {
        boolean visibility = loginPage.nextButton.isEnabled();
        Assert.assertTrue(visibility);
    }

    /**
     * проверки текстов
     */
    @Step("Проверяем заголовок экрана логин")
    public void checkLoginTitleText() {
        String loginTitleText = loginPage.loginTitle.getText();
        Assert.assertEquals(loginTitleText, "Введите номер телефона");
    }

    @Step("Проверяем текст ошибки неправильного смс кода в снекбаре")
    public void checkWrongSmsCodeSnackBarText() {
        String textIncorrectSmsCode = loginPage.snackbar.getText();
        Assert.assertEquals(textIncorrectSmsCode, "Неверный код подтверждения");
    }

    @Step("Проверяем текст кнопки забыли пароль")
    public void checkForgotThePasswordBtnText() {
        String forgotTextBtn = loginPage.forgotThePassword.getText();
        Assert.assertEquals(forgotTextBtn, "Забыли пароль?");
    }

    @Step("Проверяем текст заголовока экрана введите смс-код")
    public void checkSmsCodeTitleText() {
        String textTitleSmsCode = loginPage.smsCodeTitle.getText();
        Assert.assertEquals(textTitleSmsCode, "Введите код из смс");
    }

    //В тексте использованы разные пробелы
    @Step("Проверяем подпись поля ввода смс")
    public void checkSubSmsCodeText() {
        String subTextSmsCode = loginPage.subTextSmsCode.getText()
                .replaceAll(" ", "")
                .replaceAll(" ", "");
        Assert.assertEquals(subTextSmsCode, "Мы отправили сообщение с кодом подтверждения на номер +7 ( 960 ) 645 62 30"
                .replaceAll(" ", "")
                .replaceAll(" ", ""));
    }

    @Step("Проверяем заголовок экрана нового пароля")
    public void checkNewPasswordTitleText() {
        String textTitleNewPassword = loginPage.insertPasswordTitle.getText();
        Assert.assertEquals(textTitleNewPassword, "Придумайте пароль");
    }

    @Step("Проверяем подпись к полю ввода телефона")
    public void checkSubLoginText() {
        String subTextLogin = loginPage.subTextLogin.getText();
        Assert.assertEquals(subTextLogin, "для регистрации или входа");
    }

    @Step("Ошибка неверный пароль в снекбаре")
    public void checkSnackbarTextError() {
        String textErrorSnackbar = loginPage.snackbar.getText();
        Assert.assertEquals(textErrorSnackbar, "Неверный пароль");
    }

    @Step("Проверяем заголовок при вводе пароля")
    public void checkPasswordTextTitle() {
        String textTitlePasswordLogin = loginPage.insertPasswordTitle.getText();
        Assert.assertEquals(textTitlePasswordLogin, "Введите пароль");
    }

    /**
     * прочие действия
     */
    @Step("Дергаем смс-код")
    public String getSmsCode() {
        String smsCode = loginPage.smsTextCode.getText();
        return smsCode.replaceAll("\\D", "");
    }
}

