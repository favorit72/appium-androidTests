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

    //Check text:
    @Step("Текст заголовка 'создание дома'присутствует")
    public void checkCreateNewHouseTitle() {
        String text = housePage.waitForElementIsDisplayed(housePage.createNewHouseTitle).getText();
        Assert.assertEquals(text, "Создание дома");
    }

    @Step("Текст описания присутствует")
    public void checkNewHouseNameDescription() {
        String text = housePage.waitForElementIsDisplayed(housePage.newHouseNameDescription).getText();
        Assert.assertEquals(text, "Выбранное название будет отображаться у всех пользователей, которым вы предоставите доступ к вашему дому");
    }

    @Step("Текст кнопки 'создать новый дом'присутствует")
    public void checkCreateNewHouseBtnText() {
        String text = housePage.waitForElementIsDisplayed(housePage.createHouseBtn).getText();
        Assert.assertEquals(text, "СОЗДАТЬ НОВЫЙ ДОМ");
    }

    @Step("Текст кнопки 'войти по приглашению'присутствует")
    public void checkEnterByInviteBtnText() {
        String text = housePage.waitForElementIsDisplayed(housePage.createHouseBtn).getText();
        Assert.assertEquals(text, "ВОЙТИ ПО ПРИГЛАШЕНИЮ");
    }

}