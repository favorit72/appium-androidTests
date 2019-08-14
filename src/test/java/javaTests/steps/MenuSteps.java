package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.MenuOptionsPage;

//Окно опций
public class MenuSteps {
    private final MenuOptionsPage menu;

    public MenuSteps(AndroidDriver androidDriver) {
        menu = new MenuOptionsPage(androidDriver);
    }

    /**
     * Клики
     */
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

    /**
     * проверки текстов
     */
    @Step("Проверяем текст меню настройки приложения")
    public void checkAppSettingsText() {
        String appSettingsText = menu.waitForElementIsDisplayed(menu.appSettingsBtn).getText();
        Assert.assertEquals(appSettingsText, "Настройки приложения");
    }

    @Step("Проверяем текст меню настройки дома")
    public void checkHouseSettingsText() {
        String houseSettingsText = menu.waitForElementIsDisplayed(menu.houseSettingsBtn).getText();
        Assert.assertEquals(houseSettingsText, "Настройки дома");
    }

}