package javaTests.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.UserAccountPage;


public class UserAccountSteps {
    private final UserAccountPage account;

    public UserAccountSteps(AndroidDriver androidDriver) {
        account = new UserAccountPage(androidDriver);


        @Step("Нажимаем кнопку выйти")
        public void clickLogOutBtn () {
            account.waitForElementDisplayedFlexibleTime(account.);
        }

        @Step("Подтверждаем выход из учетки")
        public void clickConfirmLogout () {
            confirmLogout.click();
        }

        @Step("Нажимаем сброс пароля")
        public void clickResetPassword () {
            resetPassword.click();
        }
    }