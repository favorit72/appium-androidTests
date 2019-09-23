package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.RoomPage;

public class RoomSteps {

    private final RoomPage roomPage;

    public RoomSteps(AndroidDriver androidDriver) {
        roomPage = new RoomPage(androidDriver);
    }

    @Step("Проверяем окно ввода имени новой комнаты")
    public void checkCreateNewRoomWindow() {
        checkBackBtn();
        checkConfirmCreateNewRoomText();
        checkCancelCreateNewRoomText();
        checkCreateNewRoomTitle();
    }

    @Step("Проверяем экран выбора комнаты")
    public void checkChooseRoomScreen() {
        checkBackBtn();
        checkChooseRoomTitle();
        checkCreateNewRoomBtnIsDisplayed();
        selectorRoomIsNotDisplayed();
        checkRoomWithoutRoom();
    }

    //Click:
    @Step("Нажимаем кнопку 'Создать новую комнату'")
    public void clickCreateNewRoomBtn() {
        roomPage.waitForElementToClick(roomPage.createNewRoomBtn).click();
    }

    @Step("Нажимаем кнопку 'Отмена' на экране создания комнаты")
    public void clickCancelCreateNewRoom() {
        roomPage.waitForElementToClick(roomPage.cancelCreateNewRoomBtn).click();
    }

    @Step("Нажимаем кнопку 'Готово' на экране создания комнаты")
    public void clickConfirmCreateNewRoom() {
        roomPage.waitForElementToClick(roomPage.confirmCreateNewRoomBtn).click();
    }

    @Step("Выбираем комнату Wi-fi")
    public void chooseRoomWifi() {
        roomPage.waitForElementIsDisplayed(roomPage.roomWifi).click();
    }

    //Action with field:
    @Step("Вводить имя новой комнаты 'wifi'")
    public void inputNewRoomNameField(String newRoomName) {
        roomPage.waitForElementIsDisplayed(roomPage.newRoomNameField).sendKeys(newRoomName);
    }

    //Check text:
    @Step("Заголовок на экране выбора комнаты присутствует")
    private void checkChooseRoomTitle() {
        String title = roomPage.waitForElementIsDisplayed(roomPage.chooseRoomTitle).getText();
        Assert.assertEquals(title, "Расположение");
    }

    @Step("Комната 'без комнаты' присутствует")
    private void checkRoomWithoutRoom() {
        roomPage.waitForElementIsDisplayed(roomPage.roomWithoutRoom).isDisplayed();
    }

    @Step("Заголовок на экране создания комнаты присутствует")
    private void checkCreateNewRoomTitle() {
        String title = roomPage.waitForElementIsDisplayed(roomPage.createNewRoomTitle).getText();
        Assert.assertEquals(title, "Новая комната");
    }

    @Step("Текст кнопки 'Готово' при создании комнаты присутствует")
    private void checkConfirmCreateNewRoomText() {
        String title = roomPage.waitForElementIsDisplayed(roomPage.confirmCreateNewRoomBtn).getText();
        Assert.assertEquals(title, "Готово");
    }

    @Step("Текст кнопки 'Отмена' при создании комнаты присутствует")
    private void checkCancelCreateNewRoomText() {
        String title = roomPage.waitForElementIsDisplayed(roomPage.cancelCreateNewRoomBtn).getText();
        Assert.assertEquals(title, "Отмена");
    }

    //Other checks:
    @Step("Кнопка создать комнату присутствует")
    private void checkCreateNewRoomBtnIsDisplayed() {
        boolean visibility = roomPage.longWaitForElementToClick(roomPage.createNewRoomBtn).isEnabled();
        Assert.assertTrue(visibility);
    }

    @Step("Галка выбора комнаты присутствует")
    public void selectorRoomIsEnable() {
        boolean selector = roomPage.waitForElementIsDisplayed(roomPage.selectorRoom).isDisplayed();
        Assert.assertTrue(selector);
    }

    @Step("Галка выбора комнаты отсутствует")
    private boolean selectorRoomIsNotDisplayed() {
        try {
            return roomPage.waitForElementIsDisplayed(roomPage.selectorRoom).isDisplayed();
        } catch (Exception e) {
            System.out.println("Элемент отсуствует");
            return false;
        }
    }

    @Step("Выбрана дефолтная комната 'Без комнаты'")
    public void checkDefaultRoomIsSelected() {
        String text = roomPage.waitForElementIsDisplayed(roomPage.currentRoom).getText();
        Assert.assertEquals(text, "Без комнаты");
    }

    @Step("Кнопка назад присутствует")
    private void checkBackBtn() {
        roomPage.waitForElementToClick(roomPage.backBtn).isDisplayed();
        roomPage.backBtn.isEnabled();
    }
}