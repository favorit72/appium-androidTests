package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.SmartConfigWifiSocketPage;
import utils.data.Strings;

public class SmartConfigWifiSocketSteps {

    private final SmartConfigWifiSocketPage smartConfigWifiSocketPage;
    private final AddDeviceSteps addDeviceSteps;

    public SmartConfigWifiSocketSteps(AndroidDriver androidDriver) {
        smartConfigWifiSocketPage = new SmartConfigWifiSocketPage(androidDriver);
        addDeviceSteps = new AddDeviceSteps(androidDriver);
    }

    @Step("Проверяем элементы экрана подготовки розетки к смартконфигу")
    public void checkPrepareSocketSmartConfigScreen() throws InterruptedException {
        addDeviceSteps.checkViewBtnIsNotEnable();
        addDeviceSteps.checkBackBtn();
        addDeviceSteps.checkPrepareDeviceSmartConfigTitle();
        checkPrepareSocketSmartConfigSubTitle();
        checkPrepareSocketSmartConfigDescription();
        addDeviceSteps.checkViewBtnText();
        addDeviceSteps.checkViewBtnIsEnable();
    }

    @Step("Проверяем элементы экрана добавления розетки в течении смартконфига")
    public void checkScreenDuringSmartConfigSocket() {
        checkSocketDuringSmartConfigSubTitle();
        checkSocketDuringSmartConfigDescription();
        addDeviceSteps.smartConfigLoaderIsEnabled();
        addDeviceSteps.checkBackBtn();
    }

    //Check text:
    @Step("Подзаголовок присутствует на экране подготовки розетки к смартконфигу")
    private void checkPrepareSocketSmartConfigSubTitle() {
        String subTitle = smartConfigWifiSocketPage.waitForElementIsDisplayed(smartConfigWifiSocketPage.prepareWifiSocketSmartConfigTitle).getText();
        Assert.assertEquals(subTitle, "Нажмите и подержите кнопку на корпусе розетки");
    }

    @Step("Подзаголовок присутствует во время поиска розетки по смартконфигу")
    private void checkSocketDuringSmartConfigSubTitle() {
        String subTitle = smartConfigWifiSocketPage.waitForElementIsDisplayed(smartConfigWifiSocketPage.prepareWifiSocketSmartConfigTitle).getText();
        Assert.assertEquals(subTitle, "Устройство подключается.");
    }

    @Step("Пояснение присутствует на экране подготовки розетки к смартконфигу")
    private void checkPrepareSocketSmartConfigDescription() {
        String subText = smartConfigWifiSocketPage.waitForElementIsDisplayed(smartConfigWifiSocketPage.prepareWifiSocketSmartConfigDescription).getText();
        Assert.assertEquals(subText, "Она начнет мигать синим");
    }

    @Step("Пояснение присутствует во время поиска розетки по смартконфигу")
    private void checkSocketDuringSmartConfigDescription() {
        String subText = smartConfigWifiSocketPage.waitForElementIsDisplayed(smartConfigWifiSocketPage.prepareWifiSocketSmartConfigDescription).getText();
        Assert.assertEquals(subText, "(обычно это занимает 1-3 минуты)");
    }

    @Step("Дефолтное имя для Wifi розетки подставлено корректно")
    public void checkDefaultNameSocketAfterSmartConfig() {
        String defaultName = smartConfigWifiSocketPage.longWaitForElementIsDisplayed(smartConfigWifiSocketPage.defaultDeviceNameAfterSmartConfigField).getText();
        Assert.assertEquals(defaultName, Strings.DEFAULT_DEVICE_NAME_SOCKET);
    }

}
