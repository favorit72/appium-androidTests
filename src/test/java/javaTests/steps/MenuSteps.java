package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.MenuOptionsPage;

public class MenuSteps {
    private final MenuOptionsPage menu;

    public MenuSteps(AndroidDriver androidDriver) {
        menu = new MenuOptionsPage(androidDriver);
    }

    @Step("Проверяем пункты меню")
    public void checkMenuElements() {
        checkHouseSettingsInMenu();
        checkAppSettingsInMenu();
    }

    //Click:
    @Step("Нажимаем опции")
    public void clickOptionsBtn() {
        menu.waitForElementToClick(menu.optionsBtn).click();
    }
    @Step("Нажимаем настройки приложения")
    public void clickAppSettingsBtn() {
        menu.waitForElementToClick(menu.appSettingsBtn).click();
    }
    @Step("Нажимаем настройки дома")
    public void clickHouseSettingsBtn() {
        menu.waitForElementToClick(menu.houseSettingsBtn).click();
    }

    //Check text:
    @Step("'настройки приложения' присутствует в меню")
    private void checkAppSettingsInMenu() {
        String appSettingsText = menu.waitForElementIsDisplayed(menu.appSettingsBtn).getText();
        Assert.assertEquals(appSettingsText, "Настройки приложения");
    }

    @Step("'настройки дома' присутствует в меню")
    private void checkHouseSettingsInMenu() {
        String houseSettingsText = menu.waitForElementIsDisplayed(menu.houseSettingsBtn).getText();
        Assert.assertEquals(houseSettingsText, "Настройки дома");
    }

}