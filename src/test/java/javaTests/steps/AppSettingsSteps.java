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

    /**
     * клики
     **/
    @Step("Нажимаем 'Учетная запись'")
    public void clickUserAccount() {
        appSettings.waitForElementToClick(appSettings.userAccount).click();
    }

    /**
     * Проверка текстов
     **/
    @Step("Текст 'учетная запись' присутствует")
    public void checkAccountText() {
        String accountText = (appSettings.accountText).getText();
        Assert.assertEquals(accountText, "Учетная запись");
    }
}