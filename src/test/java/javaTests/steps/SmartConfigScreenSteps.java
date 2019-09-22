package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.SmartConfigScreenPage;

public class SmartConfigScreenSteps {
    private final SmartConfigScreenPage smartConfigScreenPage;
    private final AddDeviceSteps addDeviceSteps;

    public SmartConfigScreenSteps(AndroidDriver androidDriver) {
        smartConfigScreenPage = new SmartConfigScreenPage(androidDriver);
        addDeviceSteps = new AddDeviceSteps(androidDriver);
    }

    @Step("Проверяем элементы экрана смартконфиг")
    public void checkSmartConfigScreen() {
        checkSmartConfigTitle();
        checkSmartConfigSSID();
        checkSmartConfigDescription();
        addDeviceSteps.checkBackBtn();
        addDeviceSteps.checkNextBtnText();
    }

    @Step("Проверяем элементы экрана по окончанию смарткофига")
    public void checkScreenAfterSmartConfig() {
        checkCompleteOfSmartConfigTitle();
        checkDeviceNameAfterSmartConfigDescription();
    }

    //Click:
    @Step("Нажимаем на кнопку далее после успешного смартконфига")
    public void clickNextBtnAfterSmartConfig() {
        smartConfigScreenPage.waitForElementToClick(smartConfigScreenPage.completeAddDeviceBySmartConfig).click();
    }

    //Action with field:
    @Step("Вводим пароль к wifi сети")
    public void inputPasswordSmartConfig(String password) {
        clearPasswordSmartConfig();
        smartConfigScreenPage.waitForElementToClick(smartConfigScreenPage.smartConfigPasswordField).sendKeys(password);
    }

    @Step("Очищаем поле пароля")
    private void clearPasswordSmartConfig() {
        smartConfigScreenPage.waitForElementToClick(smartConfigScreenPage.smartConfigPasswordField).clear();
    }

    //Check text:
    @Step("Подзаголовок присутствует на экране смартконфига устройств")
    private void checkSmartConfigTitle() {
        String title = smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.smartConfigSubTitle).getText();
        Assert.assertEquals(title, "Введите пароль от сети");
    }

    @Step("Поле выбора wifi сети присуствует")
    private void checkSmartConfigSSID() {
        smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.smartConfigSSID).isDisplayed();
    }

    @Step("Подпись присутствует на экране выбора смартконфига устройств")
    private void checkSmartConfigDescription() {
        String subText = smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.smartConfigDescriptionText).getText();
        Assert.assertEquals(subText, "Поддерживаются только сети \u2028с частотой 2,4 ГГц");
    }

    @Step("Заголовок 'Подключено устройство' присутствует при успешносм смартконфиге")
    private void checkCompleteOfSmartConfigTitle() {
        String title = smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.completeOfSmartConfigTitle).getText();
        Assert.assertEquals(title, "Подключено устройство");
    }

    @Step("Описание для нового названия устройства присутствует после смартконфига")
    private void checkDeviceNameAfterSmartConfigDescription() {
        String description = smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.deviceNameAfterSmartConfigDescription).getText();
        Assert.assertEquals(description, "Придумайте название для устройства");
    }

}
