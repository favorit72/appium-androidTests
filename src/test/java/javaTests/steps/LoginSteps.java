package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.LoginPage;

//Все действия с экранами логина
public class LoginSteps {

    private final LoginPage loginPage;

    public LoginSteps(AndroidDriver androidDriver) {
        loginPage = new LoginPage(androidDriver);
    }

    //КЛИКИ:
    @Step("Нажимаем начать пользоваться")
    public void clickStartUsingBtn() {
        loginPage.waitForElementToClick(loginPage.startUsingBtn).click();
    }

    @Step("Нажимаем кнопку далее")
    public void clickNextBtn() {
        loginPage.waitForElementToClick(loginPage.nextButton).click();
    }

    @Step("Нажимаем забыли пароль")
    public void clickForgotThePasswordBtn() {
        loginPage.waitForElementToClick(loginPage.forgotThePasswordBtn).click();
    }

    //ДЕЙСТВИЯ НАД ПОЛЯМИ:
    @Step("Вводим правильный логин")
    public void insertCorrectPhone(String number) {
        loginPage.waitForElementIsDisplayed(loginPage.phoneField).sendKeys(number);
    }

    @Step("Вводим неправильный логин")
    public void insertInCorrectPhone(String number) {
        loginPage.waitForElementIsDisplayed(loginPage.phoneField).sendKeys(number);
    }

    @Step("Очищаем поле логина")
    public void clearPhoneField() {
        loginPage.waitForElementIsDisplayed(loginPage.phoneField).clear();
    }


    @Step("Вводим правильный пароль")
    public void insertCorrectPassword(String password) {
        loginPage.waitForElementIsDisplayed(loginPage.passwordField).sendKeys(password);
    }

    @Step("Вводим неправильный пароль")
    public void insertInCorrectPassword(String password) {
        loginPage.waitForElementIsDisplayed(loginPage.passwordField).sendKeys(password);
    }


    @Step("Очищаем поле пароля")
    public void clearPasswordField() {
        loginPage.waitForElementIsDisplayed(loginPage.passwordField).clear();
    }


    @Step("Вводим новый пароль")
    public void insertNewPassword(String password) {
        loginPage.waitForElementIsDisplayed(loginPage.passwordField).sendKeys(password);
    }

    @Step("Очищаем поле смс-код")
    public void clearSmsCodeField() {
        loginPage.waitForElementIsDisplayed(loginPage.smsCodeField).clear();
    }

    @Step("Вводим смс-код")
    public void insertSmsCode(String smsCode) {
        loginPage.waitForElementIsDisplayed(loginPage.smsCodeField).sendKeys(smsCode);
    }

    //ПРОВЕРКИ КНОПОК НА ДОСТУПНОСТЬ:
    @Step("Кнопка далее недоступна")
    public void authorizeBtnIsNotEnable() {
        boolean visibility = loginPage.waitForElementIsDisplayed(loginPage.nextButton).isEnabled();
        Assert.assertFalse(visibility);
    }

    @Step("Кнопка далее доступна")
    public void authorizeBtnIsEnable() {
        boolean visibility = loginPage.waitForElementIsDisplayed(loginPage.nextButton).isEnabled();
        Assert.assertTrue(visibility);
    }

    @Step("Кнопка 'начать пользовать' доступна")
    public void startUsingBtnIsEnable() {
        boolean visibility = loginPage.waitForElementIsDisplayed(loginPage.startUsingBtn).isEnabled();
        Assert.assertTrue(visibility);
    }

    //ПРОВЕРКИ ТЕКСТОВ:
    @Step("Текст 'Введите номер телефона' в заголовке присутствует")
    public void checkLoginTitleText() {
        String loginTitleText = loginPage.waitForElementIsDisplayed(loginPage.loginTitle).getText();
        Assert.assertEquals(loginTitleText, "Введите номер телефона");
    }

    @Step("Ошибка 'Неверный код подтверждения' в снекбаре присутствует")
    public void checkWrongSmsCodeSnackBarText() {
        String textIncorrectSmsCode = loginPage.waitForElementIsDisplayed(loginPage.snackbar).getText();
        Assert.assertEquals(textIncorrectSmsCode, "Неверный код подтверждения");
    }

    @Step("Текст кнопки 'Забыли пароль' присутствует")
    public void checkForgotThePasswordBtnText() {
        String forgotTextBtn = loginPage.waitForElementIsDisplayed(loginPage.forgotThePasswordBtn).getText();
        Assert.assertEquals(forgotTextBtn, "Забыли пароль?");
    }

    @Step("Текст 'Введите код из смс' присутствует в заголовке")
    public void checkSmsCodeTitleText() {
        String textTitleSmsCode = loginPage.waitForElementIsDisplayed(loginPage.smsCodeTitle).getText();
        Assert.assertEquals(textTitleSmsCode, "Введите код из смс");
    }

    //В тексте использованы разные пробелы
    @Step("Проверяем подпись поля ввода смс")
    public void checkSubSmsCodeText() {
        String subTextSmsCode = loginPage.waitForElementIsDisplayed(loginPage.subTextSmsCode).getText()
                .replaceAll(" ", "")
                .replaceAll(" ", "");
        Assert.assertEquals(subTextSmsCode, "Мы отправили сообщение с кодом подтверждения на номер +7 ( 960 ) 645 62 30"
                .replaceAll(" ", "")
                .replaceAll(" ", ""));
    }

    @Step("Текст 'Придумайте пароль' в заголовок присутвует")
    public void checkNewPasswordTitleText() {
        String textTitleNewPassword = loginPage.waitForElementIsDisplayed(loginPage.insertPasswordTitle).getText();
        Assert.assertEquals(textTitleNewPassword, "Придумайте пароль");
    }

    @Step("Текст 'для регистрации или входа' в подписи присутствует")
    public void checkSubLoginText() {
        String subTextLogin = loginPage.waitForElementIsDisplayed(loginPage.subTextLogin).getText();
        Assert.assertEquals(subTextLogin, "для регистрации или входа");
    }

    @Step("Текст 'Неверный пароль' присутствует в снекбаре")
    public void checkSnackbarTextError() {
        String textErrorSnackbar = loginPage.waitForElementIsDisplayed(loginPage.snackbar).getText();
        Assert.assertEquals(textErrorSnackbar, "Неверный пароль");
    }

    @Step("Текст 'Введите пароль' присутствует в заголовке")
    public void checkPasswordTextTitle() {
        String textTitlePasswordLogin = loginPage.waitForElementIsDisplayed(loginPage.insertPasswordTitle).getText();
        Assert.assertEquals(textTitlePasswordLogin, "Введите пароль");
    }

    @Step("Префикс '+7' присутствует")
    public void checkPhonePrefixText() {
        String textPhonePrefix = loginPage.waitForElementIsDisplayed(loginPage.phonePrefix).getText();
        Assert.assertEquals(textPhonePrefix, "+7");
    }

    @Step("Текст кнопки 'Демо режим' присутствует ")
    public void checkDemoBtnText() {
        String textDemoBtn = loginPage.waitForElementIsDisplayed(loginPage.demoMode).getText();
        Assert.assertEquals(textDemoBtn, "Демо режим");
    }

    //ПРОЧИЕ ДЕЙСТВИЯ:
    @Step("Дергаем смс-код")
    public String getSmsCode() {
        String smsCode = loginPage.waitForElementIsDisplayed(loginPage.smsTextCode).getText();
        return smsCode.replaceAll("\\D", "");
    }
}

