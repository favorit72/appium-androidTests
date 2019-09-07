package utils;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.qameta.allure.Step;

public class BaseAction {

    private AndroidDriver driver;

    public BaseAction(AndroidDriver driver) {
        this.driver = driver;
    }

    @Step("Нажимаем назад")
    public void pressBack() {
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

    @Step("Открываем нотификации")
    public void openNotification() {
        driver.openNotifications();
    }

    @Step("Скрываем клавиатуру")
    public void hideKeyBoard() {
        driver.hideKeyboard();
    }

    @Step("Очищаем поле")
    public void clearField() {
        driver.pressKey(new KeyEvent(AndroidKey.CLEAR));
    }
}