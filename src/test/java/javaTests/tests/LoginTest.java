package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.pageObjects.MenuOptionsPage;
import javaTests.steps.LoginSteps;
import utils.BaseTest;
import utils.Listener.Listener;
import utils.data.Strings;


@Listeners(Listener.class)
public class LoginTest extends BaseTest {
    private LoginSteps login;
    private MenuOptionsPage menu;

    @BeforeClass
    public void beforeClass() {
        login = new LoginSteps(driver());
        menu = new MenuOptionsPage(driver());
    }

    @Test
    public void Login() {

        System.out.println("Start Login Test");
        login.checkStartScreen();
        login.clickStartUsingBtn();
        login.checkInputLoginScreen();
        login.authorizeBtnIsNotEnable();
        login.inputCorrectPhone(Strings.CORRECT_LOGIN);
        login.checkPrivacyPolicy();
        login.authorizeBtnIsEnable();
        login.clickNextBtn();
        login.checkInputPasswordScreen();
        login.authorizeBtnIsNotEnable();
        login.inputCorrectPassword(Strings.CORRECT_PASSWORD);
        login.authorizeBtnIsEnable();
        login.clickNextBtn();
        login.progressLoaderIsPresent();
        menu.waitForElementIsDisplayed(menu.optionsBtn);

    }
}