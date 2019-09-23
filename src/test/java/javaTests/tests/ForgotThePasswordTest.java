package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.pageObjects.MenuOptionsPage;
import javaTests.steps.LoginSteps;
import utils.BaseAction;
import utils.BaseTest;
import utils.Listener.Listener;
import utils.data.Strings;

@Listeners(Listener.class)
public class ForgotThePasswordTest extends BaseTest {
    private LoginSteps login;
    private MenuOptionsPage menu;
    private BaseAction baseAction;

    @BeforeClass
    public void beforeClass() {
        login = new LoginSteps(driver());
        menu = new MenuOptionsPage(driver());
        baseAction = new BaseAction(driver());
    }

    @Test
    public void ForgotThePassword() throws InterruptedException {

        System.out.println("Start forgot the password Test");
        login.checkStartScreen();
        login.clickStartUsingBtn();
        login.checkInputLoginScreen();
        login.authorizeBtnIsNotEnable();
        login.inputCorrectPhone(Strings.CORRECT_LOGIN);
        login.clickNextBtn();
        login.checkInputPasswordScreen();
        login.clickForgotThePasswordBtn();
        login.checkForgotThePasswordScreen();
        //wait for sms
        Thread.sleep(8000);
        baseAction.openNotification();
        String smsCode = login.getSmsCode();
        baseAction.pressBack();
        login.inputSmsCode(Strings.NOT_FULL_SMSCODE);
        login.authorizeBtnIsNotEnable();
        login.inputSmsCode(Strings.INCORRECT_SMSCODE);
        login.checkWrongSmsCodeSnackBarText();
        login.inputSmsCode(smsCode);
        login.checkCreateNewPasswordScreen();
        login.authorizeBtnIsNotEnable();
        login.inputNewPassword(Strings.CORRECT_PASSWORD);
        login.clickNextBtn();
        menu.waitForElementIsDisplayed(menu.optionsBtn);

    }
}