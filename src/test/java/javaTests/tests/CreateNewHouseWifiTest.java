package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.steps.AddDeviceSteps;
import javaTests.steps.DeviceListSteps;
import javaTests.steps.FooterSteps;
import javaTests.steps.HouseSteps;
import javaTests.steps.SpinnerSteps;
import utils.BaseTest;
import utils.data.Strings;
import utils.listener.Listener;

@Listeners(Listener.class)
public class CreateNewHouseWifiTest extends BaseTest {
    private SpinnerSteps spinner;
    private HouseSteps house;
    private FooterSteps footer;
    private AddDeviceSteps addDevice;
    private DeviceListSteps deviceList;

    @BeforeClass
    public void beforeClass() {
        spinner = new SpinnerSteps(driver());
        house = new HouseSteps(driver());
        footer = new FooterSteps(driver());
        addDevice = new AddDeviceSteps(driver());
        deviceList = new DeviceListSteps(driver());
    }

    @Test
    public void createNewHouseWifi() throws InterruptedException {

        System.out.println("Create new house for WIFI");
        spinner.clickSpinner();
        spinner.checkEnterByInviteText();
        spinner.clickCreateNewHouseBtn();
        house.checkCreateNewHouseScreen();
        house.clickHelpBtn();
        Thread.sleep(1000);
        baseAction.pressBackBtn();
        house.clickCreateHouseBtn();
        house.checkCreateNewHouseWithEmptyNameAlert();
        house.clickOkBtnError();
        house.clickEnterByInviteBtn();
        baseAction.pressBackHW();
        house.inputNewHouseName(Strings.HOUSE_NAME_WIFI);
        baseAction.hideKeyBoard();
        house.clickCreateHouseBtn();
        house.checkCompleteCreateNewHouseScreen();
        house.clickHelpBtn();
        Thread.sleep(1000);
        baseAction.pressBackBtn();
        house.clickContinueBtn();
        spinner.checkCurrentHouseWiFi();
        deviceList.checkNotAvailableDevicesText();
        footer.clickDeviceList();
        footer.clickEvents();
        footer.clickScenarios();
        footer.clickCameras();
        footer.clickDeviceList();
        spinner.checkCurrentHouseWiFi();
        addDevice.clickAddDeviceBtn();
        addDevice.checkAddDeviceGroupEmptyHouse();
        baseAction.pressBackBtn();
        spinner.clickSpinner();
        spinner.checkHouseListWiFi();
        baseAction.pressBackHW();


    }
}