package javaTests.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.HousePage;
import javaTests.pageObjects.SpinnerPage;
import org.testng.Assert;
import utils.data.Strings;

public class HouseSteps {

    private final HousePage housePage;
    private final SpinnerPage spinnerPage;
    private final SpinnerSteps spinner;
    private final FooterSteps footer;

    public HouseSteps(AndroidDriver androidDriver) {
        housePage = new HousePage(androidDriver);
        spinnerPage = new SpinnerPage(androidDriver);
        spinner = new SpinnerSteps(androidDriver);
        footer = new FooterSteps(androidDriver);
    }

    @Step("Проверяем экран создания дома")
    public void checkCreateNewHouseScreen() {
        checkCreateNewHouseTitle();
        checkBackBtn();
        checkNewHouseNameDescriptionText();
        checkCreateHouseBtnText();
        checkEnterByInviteBtnText();
    }

    @Step("Проверяем аллерт при создании нового дома с пустым названием")
    public void checkCreateNewHouseWithEmptyNameAlert() {
        checkErrorEmptyNameNewHouseText();
        checkErrorEmptyNameNewHouseBtnText();
    }

    @Step("Проверяем экран успешного завершения создания дома")
    public void checkCompleteCreateNewHouseScreen() {
        checkCreateNewHouseTitle();
        checkBackBtn();
        checkGotoAddDevicesBtnText();
        checkContinueBtnText();
        checkCongratulationMessageText();
        checkDescriptionText();
    }

    //Click:
    @Step("Нажимаем на справку")
    public void clickHelpBtn() {
        housePage.waitForElementToClick(housePage.helpBtn).click();
    }

    @Step("Создаем дом")
    public void clickCreateHouseBtn() {
        housePage.waitForElementToClick(housePage.createHouseBtn).click();
    }

    @Step("Нажимаем 'Ок' в ошибке пустого дома")
    public void clickOkBtnError() {
        housePage.waitForElementToClick(housePage.okButton).click();
    }

    @Step("Нажимаем 'Перейти к добавлению устройств'")
    public void clickGoToAddDevicesBtn() {
        housePage.waitForElementToClick(housePage.goToAddDevicesBtn).click();
    }

    @Step("Нажимаем кнопку'продолжить'")
    public void clickContinueBtn() {
        housePage.waitForElementToClick(housePage.continueBtn).click();
    }

    @Step("Нажимаем 'войти по приглашению'")
    public void clickEnterByInviteBtn() {
        housePage.waitForElementToClick(housePage.enterByInviteBtn2).click();
    }


    //Actions with field:
    @Step("Вводим название дома")
    public void inputNewHouseName(String houseName) {
        housePage.waitForElementToClick(housePage.newHouseNameField).sendKeys(houseName);
    }

    //Check text:
    @Step("Текст заголовка 'создание дома' присутствует")
    private void checkCreateNewHouseTitle() {
        String text = housePage.waitForElementIsDisplayed(housePage.createNewHouseTitle).getText();
        Assert.assertEquals(text, "Создание дома");
    }

    @Step("Текст описания имени нового дома присутствует")
    private void checkNewHouseNameDescriptionText() {
        String text = housePage.waitForElementIsDisplayed(housePage.newHouseNameDescription).getText();
        Assert.assertEquals(text, "Выбранное название будет отображаться у всех пользователей, которым вы предоставите доступ к вашему дому");
    }

    @Step("Текст кнопки 'создать новый дом' присутствует")
    private void checkCreateHouseBtnText() {
        String text = housePage.waitForElementIsDisplayed(housePage.createHouseBtn).getText();
        Assert.assertEquals(text, "Создать новый дом");
    }

    @Step("Текст кнопки 'войти по приглашению' присутствует")
    private void checkEnterByInviteBtnText() {
        String text = housePage.waitForElementIsDisplayed(housePage.enterByInviteBtn2).getText();
        Assert.assertEquals(text, "Войти по приглашению");
    }

    @Step("Текст описания ошибки при создании пустого дома присутствует")
    private void checkErrorEmptyNameNewHouseText() {
        String text = housePage.waitForElementIsDisplayed(housePage.messageEmptyNameNewHouse).getText();
        Assert.assertEquals(text, "Название дома не может быть пустым");
    }

    @Step("Текст кнопки ОК присутствует в ошибке при создании пустого дома")
    private void checkErrorEmptyNameNewHouseBtnText() {
        String text = housePage.waitForElementIsDisplayed(housePage.okButton).getText();
        Assert.assertEquals(text, "ОК");
    }

    @Step("Текст кнопки 'Перейти к добавлению устройств' присутствует")
    private void checkGotoAddDevicesBtnText() {
        String text = housePage.waitForElementIsDisplayed(housePage.goToAddDevicesBtn).getText();
        Assert.assertEquals(text, "Перейти к добавлению устройств");
    }

    @Step("Текст кнопки 'продолжить' присутствует")
    private void checkContinueBtnText() {
        String text = housePage.waitForElementIsDisplayed(housePage.continueBtn).getText();
        Assert.assertEquals(text, "Продолжить");
    }

    @Step("Текст поздравления о создании дома присутствует")
    private void checkCongratulationMessageText() {
        String text = housePage.waitForElementIsDisplayed(housePage.congratulationMessage).getText();
        Assert.assertEquals(text, "Поздравляем, вы успешно создали дом!");
    }

    @Step("Текст описания  после создании дома присутствует")
    private void checkDescriptionText() {
        String text = housePage.waitForElementIsDisplayed(housePage.completeCreateHouseDescription).getText();
        Assert.assertEquals(text, "Дом - это место в котором будут храниться все ваши устройства: Центр управления, датчики, камеры, домофоны и многое другое");
    }

    //Other action:
    @Step("Выбираем дом WIFI")
    public void chooseWifiHouse() {
        footer.clickDeviceList();
        String currentHouse = spinnerPage.waitForElementToClick(spinnerPage.currentHouseName).getText();
        if (currentHouse.equals(Strings.HOUSE_NAME_WIFI)) {
            System.out.println("Уже находимся в доме WIFI");
        } else {
            spinner.clickSpinner();
            spinner.checkHouseListWiFi();
            spinner.clickWifiHouseSpinner();
            System.out.println("Сменили дом");
        }
    }

    @Step("Кнопка назад присутствует")
    private void checkBackBtn() {
        housePage.waitForElementToClick(housePage.backBtn).isDisplayed();
        housePage.backBtn.isEnabled();
    }
}