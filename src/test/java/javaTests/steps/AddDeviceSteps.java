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

    //Check text:
    @Step("Текст 'Добавить устройство' присутствует в заголовке")
    public void checkAddDeviceTitleText() {
        String text = addDevicePage.waitForElementToClick(addDevicePage.addDeviceTitle).getText();
        Assert.assertEquals(text, "Добавить устройство");
    }

    @Step("Вкладка 'Управление' присутствует в списке добавления")
    public void checkControlTitleExpandableList() {
        String text = addDevicePage.waitForElementToClick(addDevicePage.controlTitleExpandableList).getText();
        Assert.assertEquals(text, "Управление");
    }

    @Step("Вкладка 'Видеонаблюдение' присутствует в списке добавления")
    public void checkCameraTitleExpandableList() {
        String text = addDevicePage.waitForElementToClick(addDevicePage.cameraTitleExpandableList).getText();
        Assert.assertEquals(text, "Видеонаблюдение");
    }

    @Step("Вкладка 'Видеонаблюдение' присутствует в списке добавления")
    public void checkPowerSupplyTitleExpandableList() {
        String text = addDevicePage.waitForElementToClick(addDevicePage.powerSupplyTitleExpandableList).getText();
        Assert.assertEquals(text, "Электропитание");
    }

    @Step("Вкладка 'Освещение' присутствует в списке добавления")
    public void checkLightingTitleExpandableList() {
        String text = addDevicePage.waitForElementToClick(addDevicePage.lightingTitleExpandableList).getText();
        Assert.assertEquals(text, "Освещение");
    }

    @Step("Вкладка 'Климат' присутствует в списке добавления")
    public void checkClimateTitleExpandableList() {
        String text = addDevicePage.waitForElementToClick(addDevicePage.climateTitleExpandableList).getText();
        Assert.assertEquals(text, "Климат");
    }


}
