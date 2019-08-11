package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import javaTests.steps.LoginSteps;
import utils.BaseTest;
import utils.Listener.Listener;

@Listeners(Listener.class)
public class ForgotThePasswordTest extends BaseTest {
    private LoginSteps login;

    @BeforeClass
    public void beforeClass() {
        login = new LoginSteps(driver());
    }

    @Test
    public void ForgotThePassword() throws InterruptedException {
        System.out.println("Start forgot the password Test");
        login.clickStartUsingBtn();
        login.insertCorrectLogin("9606456230");
        login.clickNextBtn();
        login.checkForgotThePasswordBtnText();
        login.clickForgotThePasswordBtn();
        login.checkSubSmsCodeText();
        Thread.sleep(8000);
        driver().openNotifications();
        String smsCode = login.getSmsCode();
        driver().pressKey(new KeyEvent(AndroidKey.BACK));
        login.checkSmsCodeTitleText();
        login.insertSmsCode("1111");
        login.checkIncorrectSmsCodeText();
        login.clearSmsCodeField();
        login.insertSmsCode(smsCode);
        login.clickNextBtn();
        login.checkNewPasswordTitleText();
        login.insertNewPassword("jktu1234");
        login.clickNextBtn();
    }
}