package javaTests.tests;

import javaTests.steps.HouseSteps;
import javaTests.steps.SpinnerSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.Listener.Listener;

@Listeners(Listener.class)
public class EnterByInviteTest extends BaseTest {
    private SpinnerSteps spinner;
    private HouseSteps house;

    @BeforeClass
    public void beforeClass() {
        spinner = new SpinnerSteps(driver());
        house = new HouseSteps(driver());
    }

    @Test()
    public void EnterByInvite() {

        System.out.println("Start test enter by invite");
        spinner.clickSpinner();
        spinner.clickEnterByInviteBtn();
        //wait user for scan QR
        house.checkScreenDuringEnterByInvite();

    }
}