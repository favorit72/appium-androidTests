package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.SmartConfigScreenPage;
import utils.data.Strings;

public class AddDeviceSmartConfigSteps {

    private final SmartConfigScreenPage smartConfigScreenPage;

    public AddDeviceSmartConfigSteps(AndroidDriver androidDriver) {
        smartConfigScreenPage = new SmartConfigScreenPage(androidDriver);
    }

    //Check Screen:
    @Step("Проверяем элементы экрана подготовки розетки к смартконфигу")
    public void checkPrepareSocketSmartConfigScreen() throws InterruptedException {
        checkViewBtnIsNotEnable();
        checkBackBtn();
        checkPrepareDeviceSmartConfigTitle();
        checkPrepareSocketSmartConfigSubTitle();
        checkPrepareSocketSmartConfigDescription();
        checkViewBtnText();
        checkViewBtnIsEnable();
    }

    @Step("Проверяем элементы экрана добавления розетки в течении смартконфига")
    public void checkScreenDuringSmartConfigSocket() {
        checkSocketDuringSmartConfigSubTitle();
        checkBackBtn();
        checkSocketDuringSmartConfigDescription();
        smartConfigLoaderIsEnabled();
    }

    @Step("Проверяем элементы экрана по окончанию смарткофига")
    public void checkScreenAfterSmartConfig() {
        checkDefaultNameSocketAfterSmartConfig();
        checkCompleteOfSmartConfigTitle();
        checkDeviceNameAfterSmartConfigDescription();
        checkBackBtn();
        checkNextBtnText();
    }

    //Click:
    @Step("Нажимаем кнопку \"Вижу\"")
    public void clickViewBtn() {
        smartConfigScreenPage.waitForElementToClick(smartConfigScreenPage.viewBtn).click();
    }

    @Step("Нажимаем на кнопку \"далее\" после успешного смартконфига")
    public void clickNextBtnAfterSmartConfig() {
        smartConfigScreenPage.waitForElementToClick(smartConfigScreenPage.completeAddDeviceBySmartConfig).click();
    }

    @Step("Нажимаем на кнопку справки \"справку\"")
    public void clickHelpBtn() throws InterruptedException {
        smartConfigScreenPage.waitForElementToClick(smartConfigScreenPage.helpBtn).click();
        Thread.sleep(2000);
    }

    //Check text:
    @Step("Подзаголовок присутствует на экране подготовки розетки к смартконфигу")
    private void checkPrepareSocketSmartConfigSubTitle() {
        String subTitle = smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.prepareDeviceSmartConfigTitle).getText();
        Assert.assertEquals(subTitle, "Нажмите и подержите кнопку на корпусе розетки");
    }

    @Step("Подзаголовок присутствует во время поиска розетки по смартконфигу")
    private void checkSocketDuringSmartConfigSubTitle() {
        String subTitle = smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.prepareDeviceSmartConfigTitle).getText();
        Assert.assertEquals(subTitle, "Устройство подключается.");
    }

    @Step("Пояснение присутствует на экране подготовки розетки к смартконфигу")
    private void checkPrepareSocketSmartConfigDescription() {
        String subText = smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.prepareDeviceSmartConfigDescription).getText();
        Assert.assertEquals(subText, "Она начнет мигать синим");
    }

    @Step("Пояснение присутствует во время поиска розетки по смартконфигу")
    private void checkSocketDuringSmartConfigDescription() {
        String subText = smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.prepareDeviceSmartConfigDescription).getText();
        Assert.assertEquals(subText, "(обычно это занимает 1-3 минуты)");
    }

    @Step("Дефолтное имя для Wifi розетки подставлено корректно")
    private void checkDefaultNameSocketAfterSmartConfig() {
        String defaultName = smartConfigScreenPage.longWaitForElementIsDisplayed(smartConfigScreenPage.defaultDeviceNameAfterSmartConfigField).getText();
        Assert.assertEquals(defaultName, Strings.DEFAULT_DEVICE_NAME_SOCKET);
    }

    @Step("Текст кнопки \"вижу\" присуствует на кнопке")
    private void checkViewBtnText() {
        String textBtn = smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.viewBtn).getText();
        Assert.assertEquals(textBtn, "Вижу");
    }

    @Step("Заголовок \"Подключение\" присуствует на экране смартконфига устройств")
    private void checkPrepareDeviceSmartConfigTitle() {
        String title = smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.smartConfigTitle).getText();
        Assert.assertEquals(title, "Подключение");
    }

    @Step("Заголовок \"Подключено устройство\" присутствует при успешносм смартконфиге")
    private void checkCompleteOfSmartConfigTitle() {
        String title = smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.smartConfigTitle).getText();
        Assert.assertEquals(title, "Подключено устройство");
    }

    @Step("Описание для нового названия устройства присутствует после смартконфига")
    private void checkDeviceNameAfterSmartConfigDescription() {
        String description = smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.deviceNameAfterSmartConfigDescription).getText();
        Assert.assertEquals(description, "Придумайте название для устройства");
    }

    @Step("Текст присутствует на кнопке \"далее\"")
    private void checkNextBtnText() {
        String textBtn = smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.completeAddDeviceBySmartConfig).getText();
        Assert.assertEquals(textBtn, "Далее");
    }

    //Other checks:
    @Step("Кнопка \"Вижу\" не доступна")
    public void checkViewBtnIsNotEnable() {
        boolean enable = smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.viewBtn).isEnabled();
        Assert.assertFalse(enable);
    }

    @Step("Кнопка \"Вижу\" доступна")
    private void checkViewBtnIsEnable() throws InterruptedException {
        Thread.sleep(3000);
        boolean enable = smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.viewBtn).isEnabled();
        Assert.assertTrue(enable);
    }

    @Step("Кнопка \"назад\" присутствует")
    private void checkBackBtn() {
        smartConfigScreenPage.waitForElementToClick(smartConfigScreenPage.backBtn).isDisplayed();
        smartConfigScreenPage.backBtn.isEnabled();
    }

    @Step("Лодер появился. Старт смартконфига")
    public void smartConfigIsStarted() {
        boolean visibility = smartConfigScreenPage.longWaitForElementIsDisplayed(smartConfigScreenPage.progressLoader).isDisplayed();
        Assert.assertTrue(visibility);
    }

    @Step("Лодер присутствует в течении смартконфига")
    private void smartConfigLoaderIsEnabled() {
        boolean visibility = smartConfigScreenPage.longWaitForElementIsDisplayed(smartConfigScreenPage.progressLoader).isEnabled();
        Assert.assertTrue(visibility);
    }

}
