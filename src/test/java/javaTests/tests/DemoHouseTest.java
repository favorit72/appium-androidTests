package javaTests.tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.steps.DemoSteps;
import javaTests.steps.FooterSteps;
import javaTests.steps.LoginSteps;
import javaTests.steps.SecuritySteps;
import utils.BaseTest;
import utils.RetryAnalyzerCount;
import utils.listener.Listener;

@Listeners(Listener.class)
public class DemoHouseTest extends BaseTest {

    private SecuritySteps security;
    private LoginSteps login;
    private FooterSteps footer;
    private DemoSteps demo;

    @BeforeClass
    public void beforeClass() {
        login = new LoginSteps(driver());
        demo = new DemoSteps(driver());
        footer = new FooterSteps(driver());
        security = new SecuritySteps(driver());
    }

    @Test(retryAnalyzer = RetryAnalyzerCount.class)
    public void demoHouse() throws InterruptedException {

        System.out.println("Start Demo Test");
        baseAction.restartApp();
        login.checkDemoBtnText();
        login.startUsingBtnIsEnable();
        demo.clickDemoButton();
        demo.checkDemoHouseNameText();
        demo.checkCloseDemoBtnText();
        //Аппиум не видит измения текста статуса охраны
        security.checkSecurityStatusOff();
        security.securityModeOn();
        footer.clickScenarios();
        footer.clickEvents();
        footer.clickStatistics();
        footer.clickCameras();
        footer.clickDeviceList();
        footer.clickDeviceList();
        //TODO зачаток демо теста

    }
}