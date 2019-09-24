package javaTests.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.SmartConfigScreenPage;
import org.testng.Assert;

public class SmartConfigCommonScreenSteps {
    private final SmartConfigScreenPage smartConfigScreenPage;

    public SmartConfigCommonScreenSteps(AndroidDriver androidDriver) {
        smartConfigScreenPage = new SmartConfigScreenPage(androidDriver);
    }

    @Step("Проверяем элементы экрана смартконфиг")
    public void checkSmartConfigScreen() {
        checkSmartConfigTitle();
        checkSmartConfigSSID();
        checkSmartConfigDescription();
        checkBackBtn();
        checkNextBtnText();
    }

    //Click:
    @Step("Нажимаем кнопку 'Далее'")
    public void clickNextBtn() {
        smartConfigScreenPage.waitForElementToClick(smartConfigScreenPage.nextBtn).click();
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

    @Step("Подпись присутствует на экране выбора смартконфига устройств")
    private void checkSmartConfigDescription() {
        String subText = smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.smartConfigDescriptionText).getText();
        Assert.assertEquals(subText, "Поддерживаются только сети \u2028с частотой 2,4 ГГц");
    }

    @Step("Текст присутствует на кнопке 'далее'")
    private void checkNextBtnText() {
        String textBtn = smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.nextBtn).getText();
        Assert.assertEquals(textBtn, "Далее");
    }

    //Other action:
    @Step("Кнопка назад присутствует")
    private void checkBackBtn() {
        smartConfigScreenPage.waitForElementToClick(smartConfigScreenPage.backBtn).isDisplayed();
        smartConfigScreenPage.backBtn.isEnabled();
    }

    @Step("Поле выбора wifi сети присуствует")
    private void checkSmartConfigSSID() {
        smartConfigScreenPage.waitForElementIsDisplayed(smartConfigScreenPage.smartConfigSSID).isDisplayed();
    }

}
