package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.steps.DemoSteps;
import javaTests.steps.DeviceListSteps;
import javaTests.steps.FooterSteps;
import javaTests.steps.LoginSteps;
import utils.BaseTest;
import utils.Listener.Listener;

@Listeners(Listener.class)
public class DemoHouseTest extends BaseTest {

    private DemoSteps demo;
    private LoginSteps login;
    private FooterSteps footer;
    private DeviceListSteps deviceList;

    @BeforeClass
    public void beforeClass() {
        demo = new DemoSteps(driver());
        login = new LoginSteps(driver());
        deviceList = new DeviceListSteps(driver());
        footer = new FooterSteps(driver());

    }

    @Test
    public void demoHouse() {
        System.out.println("Start Demo Test");
        login.checkDemoBtnText();
        login.startUsingBtnIsEnable();
        demo.clickDemoButton();
        demo.checkDemoHouseName();
        deviceList.checkSecurityModeText();
        deviceList.clickSecurityModeBtn();



    }
}