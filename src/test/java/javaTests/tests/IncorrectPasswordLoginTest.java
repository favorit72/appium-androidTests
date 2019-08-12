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
    // private WebDriverWait wait = new WebDriverWait(driver(), 10);

    @BeforeClass
    public void beforeClass() {
        login = new LoginSteps(driver());
    }

    @Test
    public void IncorrectPasswordLogin() {
        System.out.println("Start Incorrect login/password Test");
        login.clickStartUsingBtn();
        login.checkLoginTitleText();
        login.checkSubLoginText();
        login.authorizeBtnIsNotEnable();
        login.insertInCorrectPhone(Strings.INCORRECT_LOGIN);
        login.authorizeBtnIsNotEnable();
        login.clearPhoneField();
        login.insertCorrectPhone(Strings.CORRECT_LOGIN);
        login.authorizeBtnIsEnable();
        login.clickNextBtn();
        login.authorizeBtnIsNotEnable();
        login.insertInCorrectPassword(Strings.NOT_FULL_PASSWORD);
        login.checkPasswordTextTitle();
        login.checkForgotThePasswordBtnText();
        login.authorizeBtnIsNotEnable();
        login.clearPasswordField();
        login.insertInCorrectPassword(Strings.INCORRECT_FULL_PASSWORD);
        login.authorizeBtnIsEnable();
        login.clickNextBtn();
        login.checkSnackbarTextError();
        login.authorizeBtnIsEnable();

        //TODO : сделать в конце теста проверку на появление элемента
        //login.clickNextBtn();
//      wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageView")));
    }
}
