package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.AppSettingsPage;

public class AppSettingsSteps {
    private final AppSettingsPage appSettings;

    public AppSettingsSteps(AndroidDriver androidDriver) {
        appSettings = new AppSettingsPage(androidDriver);
    }

    @Step("Проверяем экран настроек приложения")
    public void checkAppSettingsScreen() {
        checkAppSettingsTitle();
        checkBackBtn();
        checkAccountText();
        checkAccountPhoneText();
        checkAppVersionSubTitle();
        checkAdditionSettingsSubTitle();
        checkDarkTheme();
        checkVoiceSettingsText();
        checkAutoUpdate();
        //TODO добавить недостающие проверки
    }

    //Click:
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

    //Check text:
    @Step("Заголовок экрана настроек присутствует")
    private void checkAppSettingsTitle() {
        String text = appSettings.waitForElementIsDisplayed(appSettings.appSettingsTitle).getText();
        Assert.assertEquals(text, "Настройки");
    }

    @Step("Текст 'учетная запись' присутствует")
    private void checkAccountText() {
        String accountText = appSettings.waitForElementIsDisplayed(appSettings.accountText).getText();
        Assert.assertEquals(accountText, "Учетная запись");
    }

    @Step("Номер учетки присутствует")
    private void checkAccountPhoneText() {
        String userAccountText = appSettings.waitForElementIsDisplayed(appSettings.userAccountPhone).getText();
        Assert.assertEquals(userAccountText, "+7 ( 960 ) 645 62 30");
    }

    @Step("Текст 'Версия приложения' присутствует в заголовке")
    private void checkAppVersionSubTitle() {
        String appVersionTitleText = appSettings.waitForElementIsDisplayed(appSettings.appVersionTitle).getText();
        Assert.assertEquals(appVersionTitleText, "Версия приложения");
    }

    @Step("Текст 'дополнительные настройки' присутствует в заголовке")
    private void checkAdditionSettingsSubTitle() {
        String additionSettingsTitleText = appSettings.waitForElementIsDisplayed(appSettings.additionSettingsTitle).getText();
        Assert.assertEquals(additionSettingsTitleText, "Дополнительные настройки");
    }

    @Step("Текст 'Настройки голосового управления' присутствует")
    private void checkVoiceSettingsText() {
        String voiceSettingsText = appSettings.waitForElementIsDisplayed(appSettings.voiceSettings).getText();
        Assert.assertEquals(voiceSettingsText, "Настройки управления голосом");
    }

    //Check available element:
    @Step("Свитч и описание настройки темной темы присутствует")
    private void checkDarkTheme() {
        appSettings.waitForElementToClick(appSettings.themeSwitch).isDisplayed();
        appSettings.waitForElementToClick(appSettings.themeSwitch).isEnabled();
        String themeText = appSettings.waitForElementIsDisplayed(appSettings.themeText).getText();
        Assert.assertEquals(themeText, "Тёмная тема");
    }

    @Step("Свитч и описание настройки автообновления присутствует")
    private void checkAutoUpdate() {
        appSettings.waitForElementToClick(appSettings.autoUpdateSwitch).isDisplayed();
        appSettings.waitForElementToClick(appSettings.autoUpdateSwitch).isEnabled();
        String text = appSettings.waitForElementIsDisplayed(appSettings.autoUpdateText).getText();
        Assert.assertEquals(text, "Автообновление устройств\u200B");
    }

    @Step("Кнопка назад присутствует")
    private void checkBackBtn() {
        appSettings.waitForElementIsDisplayed(appSettings.backBtn).isEnabled();
        appSettings.backBtn.isDisplayed();
    }

}