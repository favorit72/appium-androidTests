package javaTests.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.SpinnerPage;
import org.testng.Assert;
import utils.data.Strings;

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

    @Step("Ищем WIFI дом в списке домов")
    void clickWifiHouseSpinner() {
        spinnerPage.waitForElementToClick(spinnerPage.houseNameWIFI).click();
    }

    @Step("Нажимаем войти по приглашению")
    public void clickEnterByInviteBtn() {
        spinnerPage.waitForElementToClick(spinnerPage.enterByInviteBtn).click();
    }

    @Step("Удаляем дом")
    public void clickDeleteHouseDemo() {
        spinnerPage.waitForElementIsDisplayed(spinnerPage.deleteDemoHouse).click();
    }

    @Step("Нажимаем удалить гостевой WIFI дом")
    public void clickDeleteGuestWifiHouse() {
        spinnerPage.waitForElementToClick(spinnerPage.deleteGuestWifiHouse).click();
    }

    //Check text:
    @Step("Текст кнопки 'создать новый дом'присутствует")
    public void checkCreateNewHouseText() {
        String text = spinnerPage.waitForElementIsDisplayed(spinnerPage.createHouseBtn).getText();
        boolean s = text.equalsIgnoreCase("Создать новый дом");
        Assert.assertTrue(s);
    }

    @Step("Текст кнопки 'войти по приглашению'присутствует")
    public void checkEnterByInviteText() {
        String text = spinnerPage.waitForElementIsDisplayed(spinnerPage.enterByInviteBtn).getText();
        boolean s = text.equalsIgnoreCase("Войти по приглашению");
        Assert.assertTrue(s);
    }

    @Step("Текущий дом - WIFI")
    public void checkCurrentHouseWiFi() {
        String text = spinnerPage.waitForElementIsDisplayed(spinnerPage.currentHouseName).getText();
        Assert.assertEquals(text, Strings.HOUSE_NAME_WIFI);
    }

    @Step("Текущий дом - ЦУ")
    public void checkCurrentHouseCC() {
        String text = spinnerPage.waitForElementIsDisplayed(spinnerPage.currentHouseName).getText();
        Assert.assertEquals(text, Strings.HOUSE_NAME_CC);
    }

    @Step("Дом ЦУ присутствует в списке")
    public void checkHouseListCC() {
        String text = spinnerPage.waitForElementIsDisplayed(spinnerPage.houseNameCC).getText();
        Assert.assertEquals(text, Strings.HOUSE_NAME_CC);
    }

    @Step("Дом Wi-Fi присутствует в списке")
    public void checkHouseListWiFi() {
        String text = spinnerPage.waitForElementIsDisplayed(spinnerPage.houseNameWIFI).getText();
        Assert.assertEquals(text, Strings.HOUSE_NAME_WIFI);
    }
}
