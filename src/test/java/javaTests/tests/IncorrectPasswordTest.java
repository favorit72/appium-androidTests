//package javaTests.tests;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//import javaTests.steps.LoginSteps;
//import utils.BaseTest;
//
//public class IncorrectPasswordTest extends BaseTest {
//
//    @Test()
//
//    public void IncorrectPassword() {
//        System.out.println("Start Login Test");
//        LoginSteps login = new LoginSteps(driver);
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//
//        login.clickStartUsingBtn();
//        assert !login.enableAuthorizeBtn();
//        login.insertCorrectPhoneNumber("9999");
//        assert !login.enableAuthorizeBtn();
//        login.clearPhoneField();
//        login.insertCorrectPhoneNumber("9606456230");
//        login.clickNextBtn();
//        login.insertCorrectPassword("123");
//        assert !login.enableAuthorizeBtn();
//        login.clearPasswordField();
//        login.insertCorrectPassword("jktu123");
//        login.clickNextBtn();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageView")));
//    }
//}
