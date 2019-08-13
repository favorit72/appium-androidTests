package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.steps.LoginSteps;
import utils.BaseTest;
import utils.Listener.Listener;
import utils.data.Strings;


@Listeners(Listener.class)
public class LoginTest extends BaseTest {
    private LoginSteps login;

    @BeforeClass
    public void beforeClass() {
        login = new LoginSteps(driver());
    }

    @Test
    public void Login() {
        System.out.println("Start Login Test");
        login.checkDemoBtnText();
        login.clickStartUsingBtn();
        login.checkPhonePrefixText();
        login.checkLoginTitleText();
        login.checkSubLoginText();
        login.authorizeBtnIsNotEnable();
        login.insertCorrectPhone(Strings.CORRECT_LOGIN);
        login.authorizeBtnIsEnable();
        login.clickNextBtn();
        login.checkForgotThePasswordBtnText();
        login.authorizeBtnIsNotEnable();
        login.checkPasswordTextTitle();
        login.insertCorrectPassword(Strings.CORRECT_PASSWORD);
        login.authorizeBtnIsEnable();
        login.clickNextBtn();
        //TODO сделать проверку в концке теста
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageView")));
    }
}