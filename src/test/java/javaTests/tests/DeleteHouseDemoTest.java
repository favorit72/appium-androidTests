package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.steps.FooterSteps;
import javaTests.steps.HouseSteps;
import javaTests.steps.SpinnerSteps;
import utils.BaseTest;
import utils.listener.Listener;

@Listeners(Listener.class)
public class DeleteHouseDemoTest extends BaseTest {
    private FooterSteps footer;
    private SpinnerSteps spinner;
    private HouseSteps house;

    @BeforeClass
    public void beforeClass() {
        footer = new FooterSteps(driver());
        spinner = new SpinnerSteps(driver());
        house = new HouseSteps(driver());
    }

    @Test
    public void DeleteHouse() throws InterruptedException {

        System.out.println("Start test delete house");
        footer.clickDeviceList();
        spinner.clickSpinner();
        spinner.clickDeleteHouseDemo();
        house.checkDeleteHouseAlert();
        house.clickDeleteHouseAlertCancelBtn();
        spinner.clickDeleteHouseDemo();
        house.checkDeleteHouseAlert();
        house.clickDeleteHouseAlertOkBtn();
        footer.clickDeviceList();

    }
}
