package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.steps.AddDeviceSteps;
import javaTests.steps.DeviceListSteps;
import javaTests.steps.HouseSteps;
import javaTests.steps.SpinnerSteps;
import utils.BaseTest;
import utils.Listener.Listener;
import utils.data.Strings;


@Listeners(Listener.class)
public class CreateNewHouseCCTest extends BaseTest {
    private SpinnerSteps spinner;
    private HouseSteps house;
    private AddDeviceSteps addDevice;
    private DeviceListSteps deviceList;

    @BeforeClass
    public void beforeClass() {
        spinner = new SpinnerSteps(driver());
        house = new HouseSteps(driver());
        addDevice = new AddDeviceSteps(driver());
        deviceList = new DeviceListSteps(driver());
    }

    @Test
    public void createNewHouseTest() throws InterruptedException {

        System.out.println("Create new house for CC");
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
        house.inputNewHouseName(Strings.HOUSE_NAME_CC);
        baseAction.hideKeyBoard();
        house.clickCreateHouseBtn();
        house.checkCompleteCreateNewHouseScreen();
        house.clickHelpBtn();
        Thread.sleep(1000);
        baseAction.pressBackBtn();
        house.clickGoToAddDevicesBtn();
        addDevice.checkAddDeviceGroupEmptyHouse();
        baseAction.pressBackBtn();
        spinner.checkCurrentHouseCC();
        deviceList.checkNotAvailableDevicesText();
        spinner.clickSpinner();
        spinner.checkHouseListCC();

    }
}
