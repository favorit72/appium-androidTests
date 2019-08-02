package javaTests.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javaTests.steps.LoginSteps;

public class IncorrectPasswordTest extends BaseTest {

    @Test()

    public void IncorrectPassword() {
        System.out.println("Start Login Test");
        LoginSteps login = new LoginSteps(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        login.clickStartUsing();
        login.insertCorrectPhoneNumber("9999");
        assert !login.enableAuthorizeButton();
        login.clearPhoneField();
        login.insertCorrectPhoneNumber("9606456230");
        login.clickNextButton();
        login.insertCorrectPassword("123");
        assert !login.enableAuthorizeButton();
        login.clearPasswordField();
        login.insertCorrectPassword("jktu123");
        login.clickNextButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageView")));
    }
}
