package javaTests.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.MenuOptionsPage;

//Опции
public class MenuSteps {
    private final MenuOptionsPage menu;

    public MenuSteps(AndroidDriver androidDriver) {
        menu = new MenuOptionsPage(androidDriver);
    }


    @Step("Нажимаем опции")
    public void clickOptions() {
        menu.waitForElementToClick(menu.options).click();
    }

    @Step("Нажимаем настройки приложения")
    public void clickAppSettings() {
        menu.waitForElementToClick(menu.appSettings).click();
    }

    @Step("Нажимаем настройки дома")
    public void clickHouseSettings() {
        menu.waitForElementToClick(menu.houseSettings).click();
    }
}