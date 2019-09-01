package javaTests.tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.steps.DemoSteps;
import javaTests.steps.FooterSteps;
import javaTests.steps.HouseSteps;
import javaTests.steps.LoginSteps;
import javaTests.steps.SecuritySteps;
import utils.BaseTest;
import utils.Listener.Listener;

@Listeners(Listener.class)
public class DemoHouseTest extends BaseTest {

    private SecuritySteps security;
    private LoginSteps login;
    private FooterSteps footer;
    private DemoSteps demo;
    private HouseSteps house;

    @BeforeClass
    public void beforeClass() {
        house = new HouseSteps(driver());
        login = new LoginSteps(driver());
        demo = new DemoSteps(driver());
        footer = new FooterSteps(driver());
        security = new SecuritySteps(driver());
    }

    @Test
    public void demoHouse() {
        System.out.println("Start Demo Test");
        login.checkDemoBtnText();
        login.startUsingBtnIsEnable();
        demo.clickDemoButton();
        house.checkDemoHouseName();
        demo.checkCloseDemoBtnText();
        security.checkSecurityStatusOff();
        security.securityModeOn();
        //security.checkSecurityStatusOn();
        security.securityModeOff();
        //security.checkSecurityStatusOff();
        footer.clickScenarios();
        footer.clickEvents();
        footer.clickStatistics();
        footer.clickCameras();
        footer.clickDeviceList();
        footer.clickDeviceList();
        //TODO  разобраться с отображением статуса охраны дома после постановки на охрану
    }
}