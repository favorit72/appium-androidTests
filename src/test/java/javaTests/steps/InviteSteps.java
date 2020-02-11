package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.InvitePage;

public class InviteSteps {

    private final InvitePage invitePage;

    public InviteSteps(AndroidDriver androidDriver) {
        invitePage = new InvitePage(androidDriver);
    }

    //Check Screen:
    @Step("Проверяем экран списка приглашений")
    public void checkInviteListScreen() {
        checkBackBtn();
        checkPlaceHolderText();
        checkCreateInviteBtnText();
    }

    @Step("Проверяем экран создания нового приглашения")
    public void checkCreateNewInviteScreen() {
        checkBackBtn();
        checkCreateNewInviteScreenTitle();
        checkNewInviteNameTitle();
        checkExtendedAccessTitle();


        checkExtendedAccessDescription();
        checkUnlimitedTimeInviteTitle();
        checkUnlimitedTimeInviteDescription();
        checkReUsableInviteTitle();
        checkReUsableInviteDescription();
    }

    //Text:
    @Step("Кнопка \"назад\" присутсвует")
    private void checkBackBtn() {
        invitePage.waitForElementIsDisplayed(invitePage.backBtn).isDisplayed();
    }

    @Step("Проверяем текст плейсхолдера экрана списка приглашений")
    private void checkPlaceHolderText() {
        String text = invitePage.waitForElementIsDisplayed(invitePage.placeholderText).getText();
        Assert.assertEquals(text, "Чтобы предоставить доступ к дому своим родным и близким, создайте новое приглашение и поделитесь им");
    }

    @Step("Проверяем текст кнопки \"Создать приглашение\"")
    private void checkCreateInviteBtnText() {
        String text = invitePage.waitForElementToClick(invitePage.createInviteBtn).getText();
        boolean s = text.equalsIgnoreCase("Создать приглашение");
        Assert.assertTrue(s);
    }

    @Step("Проверяем заголовок экрана создания нового приглашения")
    private void checkCreateNewInviteScreenTitle() {
        String text = invitePage.waitForElementIsDisplayed(invitePage.createInviteScreenTitle).getText();
        Assert.assertEquals(text, "Новое приглашение");
    }

    @Step("Проверяем заголовок для поля ввода название приглашения")
    private void checkNewInviteNameTitle() {
        String text = invitePage.waitForElementIsDisplayed(invitePage.inviteNameTitle).getText();
        Assert.assertEquals(text, "Название приглашения");
    }

    @Step("Проверяем заголовок для расширенного доступа")
    private void checkExtendedAccessTitle() {
        String text = invitePage.waitForElementIsDisplayed(invitePage.extendedAccessTitle).getText();
        Assert.assertEquals(text, "Расширенный доступ  ");
    }

    @Step("Проверяем описание для расширенного приглашения")
    private void checkExtendedAccessDescription() {
        String text = invitePage.waitForElementIsDisplayed(invitePage.extendedAccessDescription).getText();
        Assert.assertEquals(text, "Позволяет изменять настройки, добавлять и удалять устройства");
    }

    @Step("Проверяем заголовок для неограниченного действия приглашения")
    private void checkUnlimitedTimeInviteTitle() {
        String text = invitePage.waitForElementIsDisplayed(invitePage.unlimitedTimeInviteTitle).getText();
        Assert.assertEquals(text, "Неограниченное время действия приглашения");
    }

    @Step("Проверяем описание для неограниченного действия приглашения")
    private void checkUnlimitedTimeInviteDescription() {
        String text = invitePage.waitForElementIsDisplayed(invitePage.unlimitedTimeInviteDescription).getText();
        Assert.assertEquals(text, "Стандартное время действия приглашения - 7 дней");
    }

    @Step("Проверяем заголовок для многоразового приглашения")
    private void checkReUsableInviteTitle() {
        String text = invitePage.waitForElementIsDisplayed(invitePage.reUsableInviteTitle).getText();
        Assert.assertEquals(text, "Многоразовое приглашение");
    }

    @Step("Проверяем описание для многоразового приглашения")
    private void checkReUsableInviteDescription() {
        String text = invitePage.waitForElementIsDisplayed(invitePage.reUsableInviteDescription).getText();
        Assert.assertEquals(text, "Приглашение сможет принять неограниченное количество человек");
    }

    //Click:
    @Step("Нажимаем на кнопку \"Создать приглашение\"")
    public void clickCreateInviteBtn() {
        invitePage.longWaitForElementToClick(invitePage.createInviteBtn).click();
    }

    @Step("Вклюаем свитч \"Расширенный доступ\"")
    public void exendedAccessSwitchOn() {
        invitePage.longWaitForElementToClick(invitePage.extendedAccessSwitch).click();
    }

}
