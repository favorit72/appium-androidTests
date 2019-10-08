package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.pageObjects.LoginPage;
import javaTests.steps.AppSettingsSteps;
import javaTests.steps.MenuSteps;
import javaTests.steps.UserAccountSteps;
import utils.BaseTest;
import utils.RetryAnalyzerCount;
import utils.listener.Listener;


@Listeners(Listener.class)
public class LogoutTest extends BaseTest {
    private MenuSteps menu;
    private LoginPage login;
    private AppSettingsSteps appSettings;
    private UserAccountSteps userAccount;

    @BeforeClass
    public void beforeClass() {
        menu = new MenuSteps(driver());
        login = new LoginPage(driver());
        appSettings = new AppSettingsSteps(driver());
        userAccount = new UserAccountSteps(driver());
    }

    @Test(retryAnalyzer = RetryAnalyzerCount.class)
    public void Logout() {

        System.out.println("Start Logout Test");
        baseAction.restartApp();
        menu.clickOptionsBtn();
        menu.checkMenuElements();
        menu.clickAppSettingsBtn();
        appSettings.checkAppSettingsScreen();
        appSettings.clickUserAccount();
        userAccount.checkUserAccountScreen();
        userAccount.clickLogOutBtn();
        userAccount.checkLogoutAlert();
        userAccount.clickCancelLogout();
        baseAction.restartApp();
        appSettings.clickUserAccount();
        userAccount.clickLogOutBtn();
        userAccount.checkLogoutAlert();
        userAccount.clickConfirmLogout();
        login.waitForElementIsDisplayed(login.demoMode);

    }
}
