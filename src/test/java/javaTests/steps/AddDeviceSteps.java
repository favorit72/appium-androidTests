package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.AddDevicePage;

public class AddDeviceSteps {

    private final AddDevicePage addDevicePage;

    public AddDeviceSteps(AndroidDriver androidDriver) {
        addDevicePage = new AddDevicePage(androidDriver);
    }

    //Click:
    @Step("Нажимаем добавить устройство")
    public void clickAddDeviceBtn() {
        addDevicePage.waitForElementToClick(addDevicePage.addDeviceBtn).click();
    }

    @Step("Нажимаем кнопку 'Далее'")
    public void clickNextBtn() {
        addDevicePage.waitForElementToClick(addDevicePage.nextBtn).click();
    }

    @Step("Нажимаем добавить розетку")
    public void clickAddWifiSocket() {
        addDevicePage.waitForElementToClick(addDevicePage.powerSupplyGroupExpandableList).click();
        addDevicePage.waitForElementToClick(addDevicePage.wifiSocketExpandableList).click();
    }

    //Action with field:
    @Step("Нажимаем кнопку 'Вижу'")
    public void clickViewBtn() {
        addDevicePage.waitForElementToClick(addDevicePage.viewBtn).click();
    }

    @Step("Нажимаем на справку")
    public void clickHelpBtn() throws InterruptedException {
        addDevicePage.waitForElementToClick(addDevicePage.helpBtn).click();
        Thread.sleep(2000);
    }

    //Check text:
    @Step("Текст кнопки 'вижу' присуствует на кнопке")
    void checkViewBtnText() {
        String textBtn = addDevicePage.waitForElementIsDisplayed(addDevicePage.viewBtn).getText();
        Assert.assertEquals(textBtn, "Вижу");
    }

    @Step("Заголовок 'Подключение' присуствует на экране смартконфига устройств")
    void checkPrepareDeviceSmartConfigTitle() {
        String title = addDevicePage.waitForElementIsDisplayed(addDevicePage.addDeviceAllScreenTitle).getText();
        Assert.assertEquals(title, "Подключение");
    }

    @Step("Текст присутствует на кнопке 'далее'")
    void checkNextBtnText() {
        String textBtn = addDevicePage.waitForElementIsDisplayed(addDevicePage.nextBtn).getText();
        Assert.assertEquals(textBtn, "Далее");
    }

    //Other checks:
    @Step("Проверяем список добавления устройств для пустого дома")
    public void checkAddDeviceGroupEmptyHouse() throws InterruptedException {

        checkBackBtn();
        addDevicePage.waitForElementToClick(addDevicePage.addDeviceAllScreenTitle).isDisplayed();
        Thread.sleep(4000);
        addDevicePage.controlGroupExpandableList.click();
        addDevicePage.waitForElementToClick(addDevicePage.controlModuleExpandableList).isDisplayed();
        addDevicePage.waitForElementToClick(addDevicePage.controlCenterExpandableList).isDisplayed();
        addDevicePage.controlGroupExpandableList.click();
        addDevicePage.cameraGroupExpandableList.click();
        addDevicePage.waitForElementToClick(addDevicePage.streetCameraExpandableList).isDisplayed();
        addDevicePage.waitForElementToClick(addDevicePage.homeCameraExpandableList).isDisplayed();
        addDevicePage.waitForElementToClick(addDevicePage.intercomExpandableList).isDisplayed();
        addDevicePage.cameraGroupExpandableList.click();
        addDevicePage.powerSupplyGroupExpandableList.click();
        addDevicePage.waitForElementToClick(addDevicePage.wifiSocketExpandableList).isDisplayed();
        addDevicePage.waitForElementToClick(addDevicePage.oneChannelWifiRelayExpandableList).isDisplayed();
        addDevicePage.waitForElementToClick(addDevicePage.twoChannelWifiRelayExpandableList).isDisplayed();
        addDevicePage.waitForElementToClick(addDevicePage.wifiPowerStripExpandableList).isDisplayed();
        addDevicePage.powerSupplyGroupExpandableList.click();
        addDevicePage.lightingGroupExpandableList.click();
        addDevicePage.waitForElementToClick(addDevicePage.wifiRgbLampExpandableList).isDisplayed();
        addDevicePage.waitForElementToClick(addDevicePage.wifiRgbStripExpandableList).isDisplayed();
        addDevicePage.waitForElementToClick(addDevicePage.oneChannelWifiSwitchExpandableList).isDisplayed();
        addDevicePage.waitForElementToClick(addDevicePage.twoChannelWifiSwitchExpandableList).isDisplayed();
        addDevicePage.lightingGroupExpandableList.click();
        addDevicePage.climateGroupExpandableList.click();
        addDevicePage.waitForElementToClick(addDevicePage.warmFloorExpandableList).isDisplayed();
        addDevicePage.waitForElementToClick(addDevicePage.tionExpandableList).isDisplayed();
        addDevicePage.waitForElementToClick(addDevicePage.convectorElectrolusExpandableList).isDisplayed();
        addDevicePage.waitForElementToClick(addDevicePage.convectorBalluExpandableList).isDisplayed();
        addDevicePage.waitForElementToClick(addDevicePage.conditionerMideaExpandableList).isDisplayed();
        addDevicePage.waitForElementToClick(addDevicePage.conditionerHaierExpandableList).isDisplayed();
        addDevicePage.waitForElementToClick(addDevicePage.conditionerElectroluxExpandableList).isDisplayed();

        //TODO добавить проверку на устройства, которых не должно быть в пустом доме
    }

    @Step("Кнопка назад присутствует")
    void checkBackBtn() {
        addDevicePage.waitForElementToClick(addDevicePage.backBtn).isDisplayed();
        addDevicePage.backBtn.isEnabled();
    }

    @Step("Кнопка 'Вижу' не доступна")
    public void checkViewBtnIsNotEnable() {
        boolean enable = addDevicePage.waitForElementIsDisplayed(addDevicePage.viewBtn).isEnabled();
        Assert.assertFalse(enable);
    }

    @Step("Кнопка 'Вижу' доступна")
    void checkViewBtnIsEnable() throws InterruptedException {
        Thread.sleep(3000);
        boolean enable = addDevicePage.waitForElementIsDisplayed(addDevicePage.viewBtn).isEnabled();
        Assert.assertTrue(enable);
    }

    @Step("Лодер появился. Старт смартконфига")
    public void smartConfigIsStarted() {
        boolean visibility = addDevicePage.longWaitForElementIsDisplayed(addDevicePage.progressLoader).isEnabled();
        Assert.assertTrue(visibility);
    }

    @Step("Лодер присутствует в течении смартконфига")
    void smartConfigLoaderIsEnabled() {
        boolean enable = addDevicePage.longWaitForElementIsDisplayed(addDevicePage.progressLoader).isEnabled();
        Assert.assertTrue(enable);
    }
}


