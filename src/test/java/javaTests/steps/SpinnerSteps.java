package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.SpinnerPage;

public class SpinnerSteps {

    private SpinnerPage spinnerPage;

    public SpinnerSteps(AndroidDriver androidDriver) {
        spinnerPage = new SpinnerPage(androidDriver);
    }

    //Click:
    @Step("Нажимаем на спиннер")
    public void clickSpinner() {
        spinnerPage.waitForElementToClick(spinnerPage.spinner).click();
    }

    @Step("Нажимаем создать дом")
    public void clickCreateNewHouseBtn() {
        spinnerPage.waitForElementToClick(spinnerPage.createHouseBtn).click();
    }

    @Step("Нажимаем войти по приглашению")
    public void clickEnterByInviteBtn() {
        spinnerPage.waitForElementToClick(spinnerPage.enterByInviteBtn).click();
    }

    //Check text:
    @Step("Текст кнопки 'создать новый дом'присутствует")
    public void checkCreateNewHouseText() {
        String text = spinnerPage.waitForElementIsDisplayed(spinnerPage.createHouseBtn).getText();
        Assert.assertEquals(text, "Создать новый дом");
    }

    @Step("Текст кнопки 'войти по приглашению'присутствует")
    public void checkEnterByInviteText() {
        String text = spinnerPage.waitForElementIsDisplayed(spinnerPage.enterByInviteBtn).getText();
        Assert.assertEquals(text, "Войти по приглашению");
    }

    @Step("Текущий дом - WIFI")
    public void checkCurrentHouseText() {
        String text = spinnerPage.waitForElementIsDisplayed(spinnerPage.currentHouseName).getText();
        Assert.assertEquals(text, "Wi-fi Test_Name");
    }

}
