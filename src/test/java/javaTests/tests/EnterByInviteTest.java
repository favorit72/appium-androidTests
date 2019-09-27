package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.steps.FooterSteps;
import javaTests.steps.HouseSteps;
import javaTests.steps.SpinnerSteps;
import utils.BaseTest;
import utils.Listener.Listener;

@Listeners(Listener.class)
public class EnterByInviteTest extends BaseTest {
    private SpinnerSteps spinner;
    private HouseSteps house;
    private FooterSteps footer;

    @BeforeClass
    public void beforeClass() {
        spinner = new SpinnerSteps(driver());
        house = new HouseSteps(driver());
        footer = new FooterSteps(driver());
    }

    @Test()
    public void EnterByInvite() throws InterruptedException {

        spinner.clickSpinner();
        spinner.clickEnterByInviteBtn();
        System.out.println("::: WAIT FOR USER SCAN QR :::");
        house.checkSuccessfulEnterByInviteScreen();
        house.clickGoToUseHouseAfterInvite();
        //TODO вернуть проверку, когда поправят раскрытие комнат
        //deviceList.checkWifiSocketInDeviceList();
        footer.clickScenarios();
        footer.clickEvents();
        footer.clickStatistics();
        footer.clickCameras();
        spinner.clickSpinner();
        spinner.clickDeleteGuestWifiHouse();
        house.checkExitGuestHouseAlert();
        house.clickDeleteHouseAlertOkBtn();
        spinner.clickSpinner();
        spinner.clickCreateNewHouseBtn();
        house.checkCreateNewHouseScreen();
        house.clickEnterByInviteBtn();
        System.out.println("::: WAIT FOR USER SCAN QR AGAIN :::");
        house.checkSuccessfulEnterByInviteScreen();
        house.clickGoToUseHouseAfterInvite();
        footer.clickDeviceList();
        footer.clickScenarios();
        footer.clickEvents();
        footer.clickStatistics();
        footer.clickCameras();

    }
}