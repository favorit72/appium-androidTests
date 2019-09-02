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
        login.checkDemoBtnText();
        login.startUsingBtnIsEnable();
        login.clickStartUsingBtn();
        login.checkPhonePrefixText();
        login.checkLoginTitleText();
        login.checkSubLoginText();
        login.authorizeBtnIsNotEnable();
        login.insertCorrectPhone(Strings.CORRECT_LOGIN);
        login.clickNextBtn();
        login.checkForgotThePasswordBtnText();
        login.clickForgotThePasswordBtn();
        login.checkSubSmsCodeText();
        Thread.sleep(8000);
        baseAction.openNotification();
        String smsCode = login.getSmsCode();
        baseAction.pressBack();
        login.checkSmsCodeTitleText();
        login.insertSmsCode(Strings.NOT_FULL_SMSCODE);
        login.authorizeBtnIsNotEnable();
        login.insertSmsCode(Strings.INCORRECT_SMSCODE);
        login.checkWrongSmsCodeSnackBarText();
        login.clearSmsCodeField();
        login.insertSmsCode(smsCode);
        login.checkNewPasswordTitleText();
        login.authorizeBtnIsNotEnable();
        login.insertNewPassword(Strings.CORRECT_PASSWORD);
        login.clickNextBtn();
        menu.waitForElementIsDisplayed(menu.optionsBtn);
    }
}