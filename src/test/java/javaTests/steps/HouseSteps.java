package javaTests.steps;

import javaTests.pageObjects.SpinnerPage;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.HousePage;

public class HouseSteps {

    private final HousePage housePage;
    private final SpinnerPage spinnerPage;

    public HouseSteps(AndroidDriver androidDriver) {
        housePage = new HousePage(androidDriver);
        spinnerPage = new SpinnerPage(androidDriver);
    }


}