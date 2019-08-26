package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.steps.DemoSteps;
import javaTests.steps.FooterSteps;
import javaTests.steps.LoginSteps;
import utils.BaseTest;
import utils.Listener.Listener;

@Listeners(Listener.class)
public class DemoHouseTest extends BaseTest {

    private DemoSteps demo;
    private LoginSteps login;
    private FooterSteps footer;

    @BeforeClass
    public void beforeClass() {
        demo = new DemoSteps(driver());
        login = new LoginSteps(driver());
        footer = new FooterSteps(driver());

    }

    @Test
    public void ForgotThePassword() {
        System.out.println("Start Demo Test");
        login.checkDemoBtnText();
        login.authorizeBtnIsEnable();
        demo.clickDemoButton();


    }
}