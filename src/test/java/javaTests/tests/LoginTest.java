package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.steps.LoginSteps;
import utils.BaseTest;
import utils.Listener.Listener;

@Listeners(Listener.class)
public class LoginTest extends BaseTest {
    private LoginSteps login;
    // private WebDriverWait wait = new WebDriverWait(driver(), 10);

    @BeforeClass
    public void beforeClass() {
        login = new LoginSteps(driver());
    }

    @Test
    public void Login() {
        System.out.println("Start Login Test");
        login.clickStartUsingBtn();
        login.authorizeBtnIsNotEnable();
        login.checkSubLoginText();
        login.checkLoginTitleText();
        login.insertCorrectLogin("9606456230");
        login.clickNextBtn();
        login.insertCorrectPassword("jktu123");
        login.clickNextBtn();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageView")));
    }
}
//    boolean isEnabled = login.enableAuthorizeButton();
//
//        if (isEnabled) {
//                System.out.println("Кнопка доступна");
//                } else {
//                System.out.println("Кнопка не доступна");
//                }