package javaTests.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.SpinnerPage;

public class SpinnerSteps {

    private SpinnerPage spinnerPage;

    public SpinnerSteps(AndroidDriver androidDriver) {
        spinnerPage = new SpinnerPage(androidDriver);
    }

    @Step("Нажимаем на спиннер")
    public void clickSpinner() {
        spinnerPage.waitForElementToClick(spinnerPage.spinner).click();
    }

    @Step("Нажимаем создать дом")
    public void clickCreateHouseBtn() {
        spinnerPage.waitForElementToClick(spinnerPage.createHouseBtn).click();
    }

}
