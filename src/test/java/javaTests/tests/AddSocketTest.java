package javaTests.tests;

import javaTests.pageObjects.FooterPage;
import javaTests.steps.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.BaseAction;
import utils.BaseTest;
import utils.Listener.Listener;
import utils.data.Strings;

@Listeners(Listener.class)
public class AddSocketTest extends BaseTest {

    private AddDeviceSteps addDevice;
    private HouseSteps house;
    private SpinnerSteps spinner;
    private DeviceListSteps deviceList;
    private MenuSteps menu;
    private BaseAction baseAction;
    private AddDeviceSmartConfigSteps smartConfig;
    private SmartConfigCommonScreenSteps smartConfigCommonScreen;
    private RoomSteps room;
    private FooterPage footer;

    @BeforeClass
    public void beforeClass() {
        addDevice = new AddDeviceSteps(driver());
        house = new HouseSteps(driver());
        spinner = new SpinnerSteps(driver());
        deviceList = new DeviceListSteps(driver());
        menu = new MenuSteps(driver());
        baseAction = new BaseAction(driver());
        smartConfigCommonScreen = new SmartConfigCommonScreenSteps(driver());
        smartConfig = new AddDeviceSmartConfigSteps(driver());
        room = new RoomSteps(driver());
        footer = new FooterPage(driver());
    }

    @Test()
    public void addWifiSocket() throws InterruptedException {

        System.out.println("Start test add socket");
        house.chooseWifiHouse();
        spinner.checkCurrentHouseWiFi();
        deviceList.checkNotAvailableDevicesText();
        menu.clickOptionsBtn();
        menu.checkMenuElements();
        baseAction.pressBack();
        addDevice.clickAddDeviceBtn();
        addDevice.checkAddDeviceGroupEmptyHouse();
        addDevice.clickAddWifiSocket();
        smartConfigCommonScreen.checkSmartConfigScreen();
        smartConfigCommonScreen.inputPasswordSmartConfig(Strings.WIFI_PASSWORD);
        smartConfigCommonScreen.clickNextBtn();
        smartConfig.checkViewBtnIsNotEnable();
        smartConfig.clickHelpBtn();
        baseAction.pressBack();
        smartConfig.checkPrepareSocketSmartConfigScreen();
        //long wait for user click view button
        smartConfig.smartConfigIsStarted();
        smartConfig.checkScreenDuringSmartConfigSocket();
        //long wait for complete of smartConfig
        smartConfig.checkScreenAfterSmartConfig();
        smartConfig.clickNextBtnAfterSmartConfig();
        room.checkChooseRoomScreen();
        room.clickCreateNewRoomBtn();
        room.checkCreateNewRoomWindow();
        room.clickCancelCreateNewRoom();
        room.checkChooseRoomScreen();
        room.clickCreateNewRoomBtn();
        room.checkCreateNewRoomWindow();
        room.inputNewRoomNameField(Strings.NAME_ROOM_WIFI);
        room.clickConfirmCreateNewRoom();
        room.chooseRoomWifi();
        deviceList.checkWifiSocketInDeviceList();
        footer.waitForElementIsDisplayed(footer.deviceList);

    }
}