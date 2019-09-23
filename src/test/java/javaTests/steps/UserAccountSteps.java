package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.UserAccountPage;

public class UserAccountSteps {
    private final UserAccountPage accountPage;

    public UserAccountSteps(AndroidDriver androidDriver) {
        accountPage = new UserAccountPage(androidDriver);
    }

    @Step("Проверяем экран настроек учетной записи")
    public void checkUserAccountScreen() {
        checkUserAccountTitle();
        checkResetPasswordBtnText();
        checkLogoutBtnText();
        checkBackBtn();
    }

    @Step("Проверяем диалоговое окно выхода из учетной записи")
    public void checkLogoutAlert() {
        checkAlertLogoutTitleText();
        checkMessageAlertText();
        checkConfirmLogoutBtnText();
        checkCancelLogoutBtnText();
    }

    //Click:
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

    //Check text:
    @Step("Текст 'учетная запись' в заголовке присутствует")
    private void checkUserAccountTitle() {
        String textTitle = accountPage.waitForElementIsDisplayed(accountPage.userAccountTitle).getText();
        Assert.assertEquals(textTitle, "Учетная запись");
    }

    @Step("Текст кнопки 'сменить пароль' присутствует")
    private void checkResetPasswordBtnText() {
        String resetPasswordBtnText = accountPage.waitForElementIsDisplayed(accountPage.resetPasswordBth).getText();
        Assert.assertEquals(resetPasswordBtnText, "Сменить пароль");
    }

    @Step("Текст кнопки 'выйти' присутствует")
    private void checkLogoutBtnText() {
        String logoutBtnText = accountPage.waitForElementIsDisplayed(accountPage.logOutBtn).getText();
        Assert.assertEquals(logoutBtnText, "Выйти");
    }

    @Step("Текст кнопки 'да' присутствует при потдверждении выхода")
    private void checkConfirmLogoutBtnText() {
        String confirmBtnText = accountPage.waitForElementIsDisplayed(accountPage.confirmLogoutBth).getText();
        Assert.assertEquals(confirmBtnText, "Да");
    }

    @Step("Текст кнопки 'нет' присутствует при отмене выхода")
    private void checkCancelLogoutBtnText() {
        String cancelBtnText = accountPage.waitForElementIsDisplayed(accountPage.cancelLogoutBtn).getText();
        Assert.assertEquals(cancelBtnText, "Нет");
    }

    @Step("Текст заголовка 'Выйти' присутствует в аллерте выхода с учетки")
    private void checkAlertLogoutTitleText() {
        String alertLogoutTextTitle = accountPage.waitForElementIsDisplayed(accountPage.alertLogoutTitle).getText();
        Assert.assertEquals(alertLogoutTextTitle, "Выйти");
    }

    @Step("Текст сообщения присутствует в аллерте выхода с учетки")
    private void checkMessageAlertText() {
        String alertLogoutTextTitle = accountPage.waitForElementIsDisplayed(accountPage.messageAlertLogout).getText();
        Assert.assertEquals(alertLogoutTextTitle, "После выхода из учетной записи все ваши дома станут недоступны. ");
    }

    @Step("Кнопка назад присутствует")
    private void checkBackBtn() {
        accountPage.waitForElementIsDisplayed(accountPage.backBtn).isEnabled();
        accountPage.backBtn.isDisplayed();
    }
}