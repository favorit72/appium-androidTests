package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.steps.LoginSteps;
import utils.BaseTest;
import utils.Listener.Listener;

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
        System.out.println("Start Login Test");
        login.clickStartUsingBtn();
        login.enableAuthorizeBtn();
        login.insertCorrectPhoneNumber("9999");
        login.enableAuthorizeBtn();
        login.clearPhoneField();
        login.insertCorrectPhoneNumber("9606456230");
        login.clickNextBtn();
        login.insertCorrectPassword("123");
        login.enableAuthorizeBtn();
        login.clearPasswordField();
        login.insertCorrectPassword("jktu123");
        login.clickNextBtn();
//      wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageView")));
    }
}
