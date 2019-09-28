package javaTests.steps;

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

    @Step("Нажимаем добавить розетку")
    public void clickAddWifiSocket() {
        addDevicePage.waitForElementToClick(addDevicePage.powerSupplyGroupExpandableList).click();
        addDevicePage.waitForElementToClick(addDevicePage.wifiSocketExpandableList).click();
    }

    //Other checks:
    @Step("Проверяем список добавления устройств для пустого дома")
    public void checkAddDeviceGroupEmptyHouse() throws InterruptedException {

        checkBackBtn();
        addDevicePage.waitForElementToClick(addDevicePage.addDeviceScreenTitle).isDisplayed();
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
    private void checkBackBtn() {
        addDevicePage.waitForElementToClick(addDevicePage.backBtn).isDisplayed();
        addDevicePage.backBtn.isEnabled();
    }

}


