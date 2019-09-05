package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.steps.HouseSteps;
import javaTests.steps.SpinnerSteps;
import utils.BaseTest;
import utils.Listener.Listener;

@Listeners(Listener.class)
public class CreateNewHouseTest extends BaseTest {
    private SpinnerSteps spinner;
    private HouseSteps house;

    @BeforeClass
    public void beforeClass() {
        spinner = new SpinnerSteps(driver());
        house = new HouseSteps(driver());
    }

    @Test
    public void createNewHouseTest() {
        spinner.clickSpinner();
        spinner.checkCreateNewHouseText();
        spinner.checkEnterByInviteText();
        spinner.clickCreateNewHouseBtn();
        house.checkCreateNewHouseTitle();
        house.checkNewHouseNameDescription();
        house.checkCreateNewHouseBtnText();
        house.checkEnterByInviteBtnText();

    }
}