package javaTests.tests;

import javaTests.steps.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.BaseAction;
import utils.BaseTest;
import utils.Listener.Listener;
import utils.data.Strings;

@Listeners(Listener.class)
public class CreateNewHouseWifiTest extends BaseTest {
    private SpinnerSteps spinner;
    private HouseSteps house;
    private BaseAction baseAction;
    private FooterSteps footer;
    private AddDeviceSteps addDevice;
    private DeviceListSteps deviceList;

    @BeforeClass
    public void beforeClass() {
        spinner = new SpinnerSteps(driver());
        house = new HouseSteps(driver());
        baseAction = new BaseAction(driver());
        footer = new FooterSteps(driver());
        addDevice = new AddDeviceSteps(driver());
        deviceList = new DeviceListSteps(driver());
    }

    @Test
    public void createNewHouseWifi() throws InterruptedException {

        System.out.println("Create new house for WIFI");
        spinner.clickSpinner();
        //spinner.checkCreateNewHouseText();
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
        house.inputNewHouseName(Strings.HOUSE_NAME_WIFI);
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
        baseAction.pressBack();
        spinner.clickSpinner();
        spinner.checkHouseListWiFi();
        baseAction.pressBack();

    }
}