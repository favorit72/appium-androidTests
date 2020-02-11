package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javaTests.steps.HouseSettingsSteps;
import javaTests.steps.HouseSteps;
import javaTests.steps.InviteSteps;
import javaTests.steps.MenuSteps;
import utils.BaseTest;
import utils.RetryAnalyzerCount;

public class CreateInviteTest extends BaseTest {
    private HouseSteps house;
    private MenuSteps menu;
    private HouseSettingsSteps houseSettings;
    private InviteSteps inviteScreen;

    @BeforeClass
    public void beforeClass() {
        house = new HouseSteps(driver());
        menu = new MenuSteps(driver());
        houseSettings = new HouseSettingsSteps(driver());
        inviteScreen = new InviteSteps(driver());
    }

    @Test(retryAnalyzer = RetryAnalyzerCount.class)
    public void CreateInvite() throws InterruptedException {

        baseAction.restartApp();
        house.chooseWifiHouse();
        menu.clickOptionsBtn();
        menu.checkMenuElements();
        menu.clickHouseSettingsBtn();
        houseSettings.checkHouseSettingsScreen();
        houseSettings.checkWifiHouseName();
        houseSettings.checkNoHiddenDevicesText();
        houseSettings.clickInvitesBtn();
        inviteScreen.checkInviteListScreen();
        inviteScreen.clickCreateInviteBtn();
        inviteScreen.checkCreateNewInviteScreen();


    }
}
