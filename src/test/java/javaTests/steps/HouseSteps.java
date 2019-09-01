package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.HousePage;

public class HouseSteps {

    private final HousePage housePage;

    public HouseSteps(AndroidDriver androidDriver) {
        housePage = new HousePage(androidDriver);
    }

    @Step("Название демо-дома 'Мой дом'")
    public void checkDemoHouseName() {
        String houseNameText;
        houseNameText = housePage.waitForElementToClick(housePage.currentHouseName).getText();
        Assert.assertEquals(houseNameText, "Мой дом");
    }
}