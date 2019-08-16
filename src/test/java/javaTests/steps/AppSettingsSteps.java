package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.AppSettingsPage;

//Настройки приложения
public class AppSettingsSteps {
    private final AppSettingsPage appSettings;

    public AppSettingsSteps(AndroidDriver androidDriver) {
        appSettings = new AppSettingsPage(androidDriver);
    }

    //КЛИКИ:
    @Step("Нажимаем на 'Учетная запись'")
    public void clickUserAccount() {
        appSettings.waitForElementToClick(appSettings.userAccountPhone).click();
    }

    @Step("Нажимаем на свитч 'темная тема'")
    public void clickThemeSwitch() {
        appSettings.waitForElementToClick(appSettings.themeSwitch).click();
    }

    @Step("Нажимаем на 'Настройки управления голосом'")
    public void clickVoiceSettings() {
        appSettings.waitForElementToClick(appSettings.voiceSettings).click();
    }


    @Step("Нажимаем на свитч 'автообновления'")
    public void clickAutoUpdateSwitch() {
        appSettings.waitForElementToClick(appSettings.autoUpdateSwitch).click();
    }

    //ПРОВЕРКИ ТЕКСТОВ:
    @Step("Текст 'учетная запись' присутствует")
    public void checkAccountText() {
        String accountText = appSettings.waitForElementIsDisplayed(appSettings.accountText).getText();
        Assert.assertEquals(accountText, "Учетная запись");
    }

    @Step("Номер учетки присутствует")
    public void checkAccountPhoneText() {
        String userAccountText = appSettings.waitForElementIsDisplayed(appSettings.userAccountPhone).getText();
        Assert.assertEquals(userAccountText, "+7 ( 960 ) 645 62 30");
    }

    @Step("Текст 'Версия приложения' присутствует в заголовке")
    public void checkAppVersionTitleText() {
        String appVersionTitleText = appSettings.waitForElementIsDisplayed(appSettings.appVersionTitle).getText();
        Assert.assertEquals(appVersionTitleText, "Версия приложения");
    }

    @Step("Текст 'дополнительные настройки' присутствует в заголовке")
    public void checkAdditionSettingsTitleText() {
        String additionSettingsTitleText = appSettings.waitForElementIsDisplayed(appSettings.additionSettingsTitle).getText();
        Assert.assertEquals(additionSettingsTitleText, "Дополнительные настройки");
    }

    @Step("Текст 'темная тема' присутствует")
    public void checkDarkThemeText() {
        String themeText = appSettings.waitForElementIsDisplayed(appSettings.themeText).getText();
        Assert.assertEquals(themeText, "Тёмная тема");
    }

    @Step("Текст 'Настройки голосового управления' присутствует")
    public void checkVoiceSettingsText() {
        String voiceSettingsText = appSettings.waitForElementIsDisplayed(appSettings.voiceSettings).getText();
        Assert.assertEquals(voiceSettingsText, "Настройки управления голосом");
    }
}