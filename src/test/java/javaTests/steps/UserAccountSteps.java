package javaTests.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.UserAccountPage;


public class UserAccountSteps {
    private final UserAccountPage accountPage;

    public UserAccountSteps(AndroidDriver androidDriver) {
        accountPage = new UserAccountPage(androidDriver);
    }


    @Step("Нажимаем кнопку выйти")
    public void clickLogOutBtn() {
        accountPage.waitForElementToClick(accountPage.logOutBtn).click();
    }

    @Step("Подтверждаем выход из учетки")
    public void clickConfirmLogout() {
        accountPage.waitForElementToClick(accountPage.confirmLogoutBth).click();
    }

    @Step("Нажимаем сброс пароля")
    public void clickResetPassword() {
        accountPage.waitForElementToClick(accountPage.resetPasswordBth).click();
    }
}