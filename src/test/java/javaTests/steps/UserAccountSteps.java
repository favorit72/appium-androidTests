package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.UserAccountPage;

//учетная запись
public class UserAccountSteps {
    private final UserAccountPage accountPage;

    public UserAccountSteps(AndroidDriver androidDriver) {
        accountPage = new UserAccountPage(androidDriver);
    }

    //КЛИКИ:
    @Step("Нажимаем кнопку выйти")
    public void clickLogOutBtn() {
        accountPage.waitForElementToClick(accountPage.logOutBtn).click();
    }

    @Step("Подтверждаем выход из учетки")
    public void clickConfirmLogout() {
        accountPage.waitForElementToClick(accountPage.confirmLogoutBth).click();
    }

    @Step("Отменяем выход из учетки")
    public void clickCancelLogout() {
        accountPage.waitForElementToClick(accountPage.cancelLogoutBtn).click();
    }

    @Step("Нажимаем сброс пароля")
    public void clickResetPassword() {
        accountPage.waitForElementToClick(accountPage.resetPasswordBth).click();
    }

    //ПРОВЕРКИ ТЕКСТОВ:
    @Step("Текст 'учетная запись' в заголовке присутствует")
    public void checkAppSettingsTitleText() {
        String textTitle = accountPage.waitForElementIsDisplayed(accountPage.userAccountTitle).getText();
        Assert.assertEquals(textTitle, "Учетная запись");
    }

    @Step("Текст кнопки 'сменить пароль' присутствует")
    public void checkResetPasswordBtnText() {
        String resetPasswordBtnText = accountPage.waitForElementIsDisplayed(accountPage.resetPasswordBth).getText();
        Assert.assertEquals(resetPasswordBtnText, "Сменить пароль");
    }

    @Step("Текст кнопки 'выйти' присутствует")
    public void checkLogoutBtnText() {
        String logoutBtnText = accountPage.waitForElementIsDisplayed(accountPage.logOutBtn).getText();
        Assert.assertEquals(logoutBtnText, "Выйти");
    }

    @Step("Текст кнопки 'да' присутствует при потдверждении выхода")
    public void checkConfirmLogoutBtnText() {
        String confirmBtnText = accountPage.waitForElementIsDisplayed(accountPage.confirmLogoutBth).getText();
        Assert.assertEquals(confirmBtnText, "Да");
    }

    @Step("Текст кнопки 'нет' присутствует при отмене выхода")
    public void checkCancelLogoutBtnText() {
        String cancelBtnText = accountPage.waitForElementIsDisplayed(accountPage.cancelLogoutBtn).getText();
        Assert.assertEquals(cancelBtnText, "Нет");
    }

    @Step("Текст заголовка 'Выйти' присутствует в аллерте выхода с учетки")
    public void checkAlertLogoutTitleText() {
        String alertLogoutTextTitle = accountPage.waitForElementIsDisplayed(accountPage.alertLogoutTitle).getText();
        Assert.assertEquals(alertLogoutTextTitle, "Выйти");
    }

    @Step("Текст сообщения присутствует в аллерте выхода с учетки")
    public void checkMessageAlertText() {
        String alertLogoutTextTitle = accountPage.waitForElementIsDisplayed(accountPage.messageAlertLogout).getText();
        Assert.assertEquals(alertLogoutTextTitle, "После выхода из учетной записи все ваши дома станут недоступны. ");
    }
}