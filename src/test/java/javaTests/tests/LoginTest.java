package javaTests.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javaTests.steps.LoginSteps;

public class LoginTest extends BaseTest {

    @Test()

    public void Login() {
        System.out.println("Start Login Test");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        LoginSteps login = new LoginSteps(driver);

        login.clickStartUsing();
        login.insertCorrectPhoneNumber("9606456230");
        login.clickNextButton();
        login.insertCorrectPassword("jktu123");
        login.clickNextButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageView")));
    }
}
//    boolean isEnabled = login.enableAuthorizeButton();
//
//        if (isEnabled) {
//                System.out.println("Кнопка доступна");
//                } else {
//                System.out.println("Кнопка не доступна");
//                }