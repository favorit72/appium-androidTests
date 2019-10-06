package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.LoginPage;
import utils.BaseAction;

public class LoginSteps {

    private final LoginPage loginPage;
    private BaseAction baseAction;

    public LoginSteps(AndroidDriver androidDriver) {
        loginPage = new LoginPage(androidDriver);
        baseAction = new BaseAction(androidDriver);
    }

    @Step("Проверяем стартовый экран")
    public void checkStartScreen() {
        checkDemoBtnText();
        startUsingBtnIsEnable();
        checkStartUsingBtnText();
    }

    @Step("Проверяем экран ввода логина учетной записи")
    public void checkInputLoginScreen() {
        checkLoginSubTitle();
        checkPhonePrefixText();
        checkLoginDescription();
        checkNextBtnText();
        checkBackBtn();
    }

    @Step("Проверяем экран ввода пароля учетной записи")
    public void checkInputPasswordScreen() {
        checkPasswordSubTitle();
        checkForgotThePasswordBtnText();
        checkAuthoriseBtnText();
        checkBackBtn();
    }

    @Step("Проверяем экран восстановления пароля учетной записи")
    public void checkForgotThePasswordScreen() {
        checkSmsCodeSubTitle();
        checkSmsCodeDescription();
        checkBackBtn();
    }

    @Step("Проверяем экан создание нового пароля")
    public void checkCreateNewPasswordScreen() {
        checkNewPasswordSubTitle();
        checkAuthoriseBtnText();
        checkBackBtn();
    }

    //Click:
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

    //Actions with field:
    @Step("Вводим правильный логин")
    public void inputCorrectPhone(String number) {
        loginPage.waitForElementIsDisplayed(loginPage.phoneField).sendKeys(number);
    }

    @Step("Вводим неправильный логин")
    public void inputInCorrectPhone(String number) {
        loginPage.waitForElementIsDisplayed(loginPage.phoneField).sendKeys(number);
    }

    @Step("Очищаем поле логина")
    public void clearPhoneField() {
        baseAction.clearField();
    }

    @Step("Вводим правильный пароль")
    public void inputCorrectPassword(String password) {
        loginPage.waitForElementIsDisplayed(loginPage.passwordField).sendKeys(password);
    }

    @Step("Вводим неправильный пароль")
    public void inputInCorrectPassword(String password) {
        loginPage.waitForElementIsDisplayed(loginPage.passwordField).sendKeys(password);
    }

    @Step("Очищаем поле пароля")
    public void clearPasswordField() {
        loginPage.waitForElementIsDisplayed(loginPage.passwordField).clear();
    }

    @Step("Вводим новый пароль")
    public void inputNewPassword(String password) {
        loginPage.waitForElementIsDisplayed(loginPage.passwordField).sendKeys(password);
    }

    @Step("Очищаем поле смс-код")
    private void clearSmsCodeField() {
        loginPage.waitForElementIsDisplayed(loginPage.smsCodeField).clear();
    }

    @Step("Вводим смс-код")
    public void inputSmsCode(String smsCode) throws InterruptedException {
        clearSmsCodeField();
        loginPage.waitForElementIsDisplayed(loginPage.smsCodeField).sendKeys(smsCode);
        Thread.sleep(1000);
    }

    //Check enable of button:
    @Step("Кнопка далее недоступна")
    public void authorizeBtnIsNotEnable() {
        boolean enable = loginPage.waitForElementIsDisplayed(loginPage.nextButton).isEnabled();
        Assert.assertFalse(enable);
    }

    @Step("Кнопка назад присутствует")
    private void checkBackBtn() {
        loginPage.waitForElementIsDisplayed(loginPage.backBtn).isEnabled();
        loginPage.backBtn.isDisplayed();
    }

    @Step("Кнопка далее доступна")
    public void authorizeBtnIsEnable() {
        boolean enable = loginPage.waitForElementIsDisplayed(loginPage.nextButton).isEnabled();
        Assert.assertTrue(enable);
    }

    @Step("Кнопка 'начать пользовать' доступна")
    public void startUsingBtnIsEnable() {
        boolean enable = loginPage.waitForElementIsDisplayed(loginPage.startUsingBtn).isEnabled();
        Assert.assertTrue(enable);
    }

    //Check text:
    @Step("Текст кнопки 'Начать пользоваться' присутствует")
    private void checkStartUsingBtnText() {
        String text = loginPage.waitForElementIsDisplayed(loginPage.startUsingBtn).getText();
        Assert.assertEquals(text, "Начать пользоваться");
    }

    @Step("Текст кнопки 'далее' присутствует")
    private void checkNextBtnText() {
        String text = loginPage.waitForElementIsDisplayed(loginPage.nextButton).getText();
        boolean s = text.equalsIgnoreCase("Далее");
        Assert.assertTrue(s);
    }

    @Step("Текст кнопки 'Войти' присутствует")
    private void checkAuthoriseBtnText() {
        String text = loginPage.waitForElementIsDisplayed(loginPage.nextButton).getText();
        boolean s = text.equalsIgnoreCase("Войти");
        Assert.assertTrue(s);
    }

    @Step("Текст 'Введите номер телефона' в заголовке присутствует")
    private void checkLoginSubTitle() {
        String loginTitle = loginPage.waitForElementIsDisplayed(loginPage.subTitle).getText();
        Assert.assertEquals(loginTitle, "Введите номер телефона");
    }

    @Step("Политика конфиденциальности присутствует")
    public void checkPrivacyPolicy() {
        String text = loginPage.waitForElementIsDisplayed(loginPage.privacyPolicy).getText();
        Assert.assertEquals(text, "Подтверждая номер телефона вы соглашаетесь с «Политикой конфиденциальности» и «Условиями использования»");
    }

    @Step("Ошибка 'Неверный код подтверждения' в снекбаре присутствует")
    public void checkWrongSmsCodeSnackBarText() {
        String textIncorrectSmsCode = loginPage.waitForElementIsDisplayed(loginPage.snackbar).getText();
        Assert.assertEquals(textIncorrectSmsCode, "Неверный код подтверждения");
    }

    @Step("Текст кнопки 'Забыли пароль' присутствует")
    private void checkForgotThePasswordBtnText() {
        String forgotTextBtn = loginPage.waitForElementIsDisplayed(loginPage.forgotThePasswordBtn).getText();
        Assert.assertEquals(forgotTextBtn, "Забыли пароль?");
    }

    @Step("Текст 'Введите код из смс' присутствует в заголовке")
    private void checkSmsCodeSubTitle() {
        String textTitleSmsCode = loginPage.waitForElementIsDisplayed(loginPage.smsCodeSubTitle).getText();
        Assert.assertEquals(textTitleSmsCode, "Введите код из смс");
    }

    //В тексте использованы разные пробелы
    @Step("Проверяем подпись поля ввода смс")
    private void checkSmsCodeDescription() {
        String subTextSmsCode = loginPage.waitForElementIsDisplayed(loginPage.subTextSmsCode).getText()
                .replaceAll(" ", "")
                .replaceAll(" ", "");
        Assert.assertEquals(subTextSmsCode, "Мы отправили сообщение с кодом подтверждения на номер +7 ( 960 ) 645 62 30"
                .replaceAll(" ", "")
                .replaceAll(" ", ""));
    }

    @Step("Текст 'Придумайте пароль' в заголовок присутвует")
    private void checkNewPasswordSubTitle() {
        String textTitleNewPassword = loginPage.waitForElementIsDisplayed(loginPage.createNewPasswordSubTitle).getText();
        Assert.assertEquals(textTitleNewPassword, "Придумайте пароль");
    }

    @Step("Текст 'для регистрации или входа' в подписи присутствует")
    private void checkLoginDescription() {
        String subTextLogin = loginPage.waitForElementIsDisplayed(loginPage.loginDescription).getText();
        Assert.assertEquals(subTextLogin, "для регистрации или входа");
    }

    @Step("Текст 'Неверный пароль' присутствует в снекбаре")
    public void checkSnackbarTextError() {
        String textErrorSnackbar = loginPage.waitForElementIsDisplayed(loginPage.snackbar).getText();
        Assert.assertEquals(textErrorSnackbar, "Неверный пароль");
    }

    @Step("Текст 'Введите пароль' присутствует в заголовке")
    private void checkPasswordSubTitle() {
        String textTitlePasswordLogin = loginPage.waitForElementIsDisplayed(loginPage.createNewPasswordSubTitle).getText();
        Assert.assertEquals(textTitlePasswordLogin, "Введите пароль");
    }

    @Step("Префикс '+7' присутствует")
    private void checkPhonePrefixText() {
        String textPhonePrefix = loginPage.waitForElementIsDisplayed(loginPage.phonePrefix).getText();
        Assert.assertEquals(textPhonePrefix, "+7");
    }

    @Step("Текст кнопки 'Демо режим' присутствует ")
    public void checkDemoBtnText() {
        String textDemoBtn = loginPage.waitForElementIsDisplayed(loginPage.demoMode).getText();
        Assert.assertEquals(textDemoBtn, "Демо режим");
    }

    //Other action:
    @Step("Дергаем смс-код")
    public String getSmsCode() {
        String smsCode, smsCodeText;
        smsCodeText = loginPage.waitForElementIsDisplayed(loginPage.smsTextCode).getText();
        smsCode = smsCodeText.substring(smsCodeText.length() - 4);
        return smsCode;
    }

    @Step("Лодер присутствует")
    public void progressLoaderIsPresent() {
        loginPage.waitForElementIsDisplayed(loginPage.progressLoader).isDisplayed();
    }
}