package javaTests.steps;

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
    @Step("Нажимаем Учетная запись")
    public void clickUserAccount() {
        appSettings.waitForElementToClick(appSettings.userAccount).click();
    }

//    @Step("Проверяем текст учетная запись")
//    public void

}