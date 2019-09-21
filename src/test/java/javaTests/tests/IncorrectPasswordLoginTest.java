package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.steps.LoginSteps;
import utils.BaseTest;
import utils.Listener.Listener;
import utils.data.Strings;


@Listeners(Listener.class)
public class IncorrectPasswordLoginTest extends BaseTest {
    private LoginSteps login;

    @BeforeClass
    public void beforeClass() {
        login = new LoginSteps(driver());
    }

    @Test
    public void IncorrectPasswordLogin() {

        System.out.println("Start Incorrect login/password Test");
        login.checkStartScreen();
        login.clickStartUsingBtn();
        login.checkInputLoginScreen();
        login.authorizeBtnIsNotEnable();
        login.inputCorrectPhone(Strings.INCORRECT_LOGIN);
        login.authorizeBtnIsNotEnable();
        login.clearPhoneField();
        login.inputCorrectPhone(Strings.CORRECT_LOGIN);
        login.authorizeBtnIsEnable();
        login.clickNextBtn();
        login.authorizeBtnIsNotEnable();
        login.inputCorrectPassword(Strings.NOT_FULL_PASSWORD);
        login.authorizeBtnIsNotEnable();
        login.clearPasswordField();
        login.inputInCorrectPassword(Strings.INCORRECT_FULL_PASSWORD);
        login.authorizeBtnIsEnable();
        login.clickNextBtn();
        login.checkSnackbarTextError();
        login.authorizeBtnIsEnable();

    }
}
