package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.HouseSettingsPage;
import utils.data.Strings;

public class HouseSettingsSteps {

    private final HouseSettingsPage houseSettingsPage;

    public HouseSettingsSteps(AndroidDriver androidDriver) {
        houseSettingsPage = new HouseSettingsPage(androidDriver);
    }

    //Check Screen:
    @Step("Проверяем экран настроек дома")
    public void checkHouseSettingsScreen() {
        checkHouseSettingsTitle();
        checkBackBtn();
        checkCommonParameterSectionTitle();
        checkHouseNameTitle();
        checkSmsNotificationBtnText();
        checkInvitesBtnText();
        checkGuestListTitle();
        checkGuestListDescription();
        checkHideDeviceSectionTitle();
        checkHideDeviceDescription();
    }

    //Clicks:
    @Step("Нажимаем на кнопку \"Приглашения\"")
    public void clickInvitesBtn() {
        houseSettingsPage.waitForElementToClick(houseSettingsPage.invitesBtn).click();
    }

    //Texts:
    @Step("Проверяем заголовок экрана настроек дома")
    private void checkHouseSettingsTitle() {
        String text = houseSettingsPage.waitForElementIsDisplayed(houseSettingsPage.title).getText();
        Assert.assertEquals(text, "Настройки дома");
    }

    @Step("Проверем кнопку \"назад\"")
    private void checkBackBtn() {
        houseSettingsPage.waitForElementIsDisplayed(houseSettingsPage.backBtn).isDisplayed();
    }

    @Step("Проверяем название секции \"Основные параметры\"")
    private void checkCommonParameterSectionTitle() {
        String text = houseSettingsPage.waitForElementIsDisplayed(houseSettingsPage.commonParameterSection).getText();
        boolean s = text.equalsIgnoreCase("Основные параметры");
        Assert.assertTrue(s);
    }

    @Step("Проверяем заголовок с названием дома")
    private void checkHouseNameTitle() {
        String text = houseSettingsPage.waitForElementIsDisplayed(houseSettingsPage.houseNameTitle).getText();
        Assert.assertEquals(text, "Название дома");
    }

    @Step("Проверяем название дома для wifi")
    public void checkWifiHouseName() {
        String text = houseSettingsPage.waitForElementIsDisplayed(houseSettingsPage.houseName).getText();
        Assert.assertEquals(text, Strings.HOUSE_NAME_WIFI);
    }

    @Step("Проверяем текс кнопки \"смс-информирование\"")
    private void checkSmsNotificationBtnText() {
        String text = houseSettingsPage.waitForElementIsDisplayed(houseSettingsPage.smsNotificationBtn).getText();
        Assert.assertEquals(text, "SMS-информирование");
    }

    @Step("Проверяем текст кнопки \"Приглашения\"")
    private void checkInvitesBtnText() {
        String text = houseSettingsPage.waitForElementIsDisplayed(houseSettingsPage.invitesBtn).getText();
        Assert.assertEquals(text, "Приглашения");
    }

    @Step("Проверяем заголовок списка гостей")
    private void checkGuestListTitle() {
        String text = houseSettingsPage.waitForElementIsDisplayed(houseSettingsPage.guestListTitle).getText();
        Assert.assertEquals(text, "Список гостей");
    }

    @Step("Проверяем описание для списка гостей")
    private void checkGuestListDescription() {
        String text = houseSettingsPage.waitForElementIsDisplayed(houseSettingsPage.guestListDescription).getText();
        Assert.assertEquals(text, "В данном списке будут отображены все пользователи, которым предоставлен доступ к вашему дому");
    }

    @Step("Проверяем заголовок секции \"скрытия устройств\"")
    private void checkHideDeviceSectionTitle() {
        String text = houseSettingsPage.waitForElementIsDisplayed(houseSettingsPage.hideDeviceSectionTitle).getText();
        Assert.assertEquals(text, "Скрытие устройств");
    }

    @Step("Проверяем текст отсутствующих скрытых устройств")
    public void checkNoHiddenDevicesText() {
        String text = houseSettingsPage.waitForElementIsDisplayed(houseSettingsPage.hiddenDevicesText).getText();
        Assert.assertEquals(text, "Нет скрытых устройств");
    }

    @Step("Проверяем описание для скрытия устройств")
    private void checkHideDeviceDescription() {
        String text = houseSettingsPage.waitForElementIsDisplayed(houseSettingsPage.hideDeviceDescription).getText();
        Assert.assertEquals(text, "Список устройств, которые не отображаются на главном экране.");
    }

}
