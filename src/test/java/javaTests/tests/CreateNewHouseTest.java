package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.steps.FooterSteps;
import javaTests.steps.HouseSteps;
import javaTests.steps.SpinnerSteps;
import utils.BaseAction;
import utils.BaseTest;
import utils.Listener.Listener;
import utils.data.Strings;

@Listeners(Listener.class)
public class CreateNewHouseTest extends BaseTest {
    private SpinnerSteps spinner;
    private HouseSteps house;
    private BaseAction baseAction;
    private FooterSteps footer;

    @BeforeClass
    public void beforeClass() {
        spinner = new SpinnerSteps(driver());
        house = new HouseSteps(driver());
        baseAction = new BaseAction(driver());
        footer = new FooterSteps(driver());
    }

    @Test
    public void createNewHouseTest() throws InterruptedException {

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
        house.insertNameNewHouse(Strings.HOUSE_NAME_WIFI);
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
        house.checkNotAvailableDevicesText();
        footer.clickDeviceList();
        footer.clickEvents();
        footer.clickScenarios();
        footer.clickCameras();
        footer.clickDeviceList();
        spinner.checkCurrentHouseWiFi();

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
        house.insertNameNewHouse(Strings.HOUSE_NAME_CC);
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
        spinner.checkCurrentHouseCC();
        house.checkNotAvailableDevicesText();
        spinner.clickSpinner();
        spinner.checkHouseListWiFi();
        spinner.chechHouseListCC();

    }
}