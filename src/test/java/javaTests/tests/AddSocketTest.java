package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.pageObjects.FooterPage;
import javaTests.steps.AddDeviceSteps;
import javaTests.steps.DeviceListSteps;
import javaTests.steps.HouseSteps;
import javaTests.steps.MenuSteps;
import javaTests.steps.RoomSteps;
import javaTests.steps.SmartConfigScreenSteps;
import javaTests.steps.SmartConfigWifiSocketSteps;
import javaTests.steps.SpinnerSteps;
import utils.BaseAction;
import utils.BaseTest;
import utils.Listener.Listener;
import utils.RetryAnalyzerCount;
import utils.data.Strings;

@Listeners(Listener.class)
public class AddSocketTest extends BaseTest {

    private AddDeviceSteps addDevice;
    private HouseSteps house;
    private SpinnerSteps spinner;
    private DeviceListSteps deviceList;
    private MenuSteps menu;
    private BaseAction baseAction;
    private SmartConfigWifiSocketSteps smartConfigSocket;
    private SmartConfigScreenSteps smartConfigScreen;
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
        smartConfigScreen = new SmartConfigScreenSteps(driver());
        smartConfigSocket = new SmartConfigWifiSocketSteps(driver());
        room = new RoomSteps(driver());
        footer = new FooterPage(driver());
    }

    @Test(retryAnalyzer = RetryAnalyzerCount.class)
    public void addSocketTest() throws InterruptedException {

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
        smartConfigScreen.checkSmartConfigScreen();
        smartConfigScreen.inputPasswordSmartConfig(Strings.WIFI_PASSWORD);
        addDevice.clickNextBtn();
        addDevice.checkViewBtnIsNotEnable();
        addDevice.clickHelpBtn();
        baseAction.pressBack();
        smartConfigSocket.checkPrepareSocketSmartConfigScreen();
        //long wait for user click view button
        addDevice.smartConfigIsStarted();
        smartConfigSocket.checkScreenDuringSmartConfigSocket();
        //long wait for complete of smartConfig
        smartConfigSocket.checkDefaultNameSocketAfterSmartConfig();
        smartConfigScreen.checkScreenAfterSmartConfig();
        smartConfigScreen.clickNextBtnAfterSmartConfig();
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
        footer.waitForElementIsDisplayed(footer.deviceList);

    }
}