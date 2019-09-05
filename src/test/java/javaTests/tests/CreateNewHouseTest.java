package javaTests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javaTests.steps.SpinnerSteps;
import utils.BaseTest;
import utils.Listener.Listener;

@Listeners(Listener.class)
public class CreateNewHouseTest extends BaseTest {
    private SpinnerSteps spinner;

    @BeforeClass
    public void beforeClass() {
        spinner = new SpinnerSteps(driver());
    }

    @Test
    public void createNewHouseTest() {
        spinner.clickSpinner();
        spinner.clickCreateHouseBtn();
    }
}