package javaTests.steps;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

import io.qameta.allure.Step;
import javaTests.pageObjects.LoginPage;

public class LoginSteps {

    private final LoginPage loginPage;

    public LoginSteps(AppiumDriver<WebElement> driver) {
        loginPage = new LoginPage(driver);
    }

    @Step("нажимаем начать пользоваться")
    public void clickStartUsing() {
        loginPage.startUsing.click();
    }

    @Step("вводим корректный логин")
    public void insertCorrectPhoneNumber(String number) {
        loginPage.phoneField.sendKeys(number);
    }

    @Step("нажимаем кнопку далее")
    public void clickNextButton() {
        loginPage.nextButton.click();
    }

    @Step("вводим корректный пароль")
    public void insertCorrectPassword(String password) {
        loginPage.passwordField.sendKeys(password);
    }

    @Step("кнопка доступна")
    public boolean enableAuthorizeButton() {
        return loginPage.nextButton.isEnabled();
    }

    public void clearPhoneField() {
        loginPage.phoneField.clear();
    }

    public void clearPasswordField() {
        loginPage.passwordField.clear();
    }

    public void clickForgotThePassword() {
        loginPage.forgotThePassword.click();
    }

    @Step("вводим смс-код")
    public void insertSmsCode(String code) {
        loginPage.smsCodeField.sendKeys(code);
    }

    @Step("вводим новый пароль")
    public void insertNewPassword(String password) {
        loginPage.newPassword.sendKeys(password);
    }

    @Step("Проверяем текст ошибки неправильного смс кода")
    public String errSmsField() {
        return loginPage.subTextError.getText();
    }

    @Step("Дергаем смс-код")
    public String getSmsCode() {
        String smsCode = loginPage.smsText.getText();
//        smsCode = smsCode.replaceAll("\\D", "");
//        smsCode = "sms:" + smsCode;
        return smsCode.replaceAll("\\D", "");
    }
}

