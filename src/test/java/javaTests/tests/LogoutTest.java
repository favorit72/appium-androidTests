package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.steps.AppSettingsSteps;
import javaTests.steps.LoginSteps;
import javaTests.steps.MenuSteps;
import javaTests.steps.UserAccountSteps;
import utils.BaseTest;
import utils.Listener.Listener;


@Listeners(Listener.class)
public class LogoutTest extends BaseTest {
    private MenuSteps menu;
    private LoginSteps login;
    private AppSettingsSteps appSettings;
    private UserAccountSteps userAccount;

    @BeforeClass
    public void beforeClass() {
        menu = new MenuSteps(driver());
        login = new LoginSteps(driver());
        appSettings = new AppSettingsSteps(driver());
        userAccount = new UserAccountSteps(driver());
    }

    @Test
    public void Logout() {
        System.out.println("Start Logout Test");
        menu.clickOptionsBtn();
        menu.checkAppSettingsText();
        menu.checkHouseSettingsText();
        menu.clickAppSettingsBtn();
        appSettings.checkAccountText();
        appSettings.clickUserAccount();
        userAccount.clickLogOutBtn();
        userAccount.clickConfirmLogout();
    }
}
