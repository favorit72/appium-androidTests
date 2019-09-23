package javaTests.tests;

import javaTests.steps.AddDeviceSteps;
import javaTests.steps.DeviceListSteps;
import javaTests.steps.HouseSteps;
import javaTests.steps.SpinnerSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.BaseAction;
import utils.BaseTest;
import utils.Listener.Listener;
import utils.data.Strings;


@Listeners(Listener.class)
public class CreateNewHouseCCTest extends BaseTest {
    private SpinnerSteps spinner;
    private HouseSteps house;
    private BaseAction baseAction;
    private AddDeviceSteps addDevice;
    private DeviceListSteps deviceList;

    @BeforeClass
    public void beforeClass() {
        spinner = new SpinnerSteps(driver());
        house = new HouseSteps(driver());
        baseAction = new BaseAction(driver());
        addDevice = new AddDeviceSteps(driver());
        deviceList = new DeviceListSteps(driver());
    }

    @Test
    public void createNewHouseTest() throws InterruptedException {

        System.out.println("Create new house for CC");
        spinner.clickSpinner();
        spinner.checkEnterByInviteText();
        spinner.clickCreateNewHouseBtn();
        house.checkCreateNewHouseTitle();
        house.checkNewHouseNameDescriptionText();
        house.checkCreateHouseBtnText();
        house.checkEnterByInviteBtnText();
        house.clickHelpBtn();
        Thread.sleep(2000);
        baseAction.pressBack();
        house.clickCreateHouseBtn();
        house.checkErrorEmptyNameNewHouseText();
        house.checkErrorEmptyNameNewHouseBtnText();
        house.clickOkBtnError();
        house.clickEnterByInviteBtn();
        baseAction.pressBack();
        house.inputNewHouseName(Strings.HOUSE_NAME_CC);
        baseAction.hideKeyBoard();
        house.clickCreateHouseBtn();
        house.checkCreateNewHouseTitle();
        house.checkGotoAddDevicesBtnText();
        house.checkContinueBtnText();
        house.checkCongratulationMessageText();
        house.checkDescriptionText();
        house.clickHelpBtn();
        Thread.sleep(2000);
        baseAction.pressBack();
        house.clickGoToAddDevicesBtn();
        addDevice.checkAddDeviceGroupEmptyHouse();
        baseAction.pressBack();
        spinner.checkCurrentHouseCC();
        deviceList.checkNotAvailableDevicesText();
        spinner.clickSpinner();
        spinner.checkHouseListCC();

    }
}
