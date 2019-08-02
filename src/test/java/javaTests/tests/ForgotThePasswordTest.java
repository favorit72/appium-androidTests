package javaTests.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import javaTests.steps.LoginSteps;

public class ForgotThePasswordTest extends BaseTest {

    @Test
    public void ForgotThePassword() throws InterruptedException {
        System.out.println("Start forgot the password Test");
        LoginSteps login = new LoginSteps(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        login.clickStartUsing();
        login.insertCorrectPhoneNumber("9606456230");
        login.clickNextButton();
        login.clickForgotThePassword();
        Thread.sleep(8000);
        driver.openNotifications();
        String smsCode = login.getSmsCode();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        login.insertSmsCode("1111");
        Thread.sleep(3000);
        Assert.assertEquals(login.errSmsField(), "Неверный код подтверждения");
        login.insertSmsCode(smsCode);
        login.clickNextButton();
        login.insertNewPassword("jktu123");
        login.clickNextButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageView")));
    }
}
