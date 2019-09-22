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

    @Step("Скролим экран до элемента")
    public boolean scrollToElementById(String elemId) {
        try {
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                    ".scrollIntoView(new UiSelector().resourceId(" + "\"" + elemId + "\"" + ").instance(0))");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Scroll to element failed");
            return false;
        }
    }

    @Step("Скролим экран до элемента")
    public boolean scrollToElementByText(String text) {
        try {
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                    ".scrollIntoView(new UiSelector().text(" + "\"" + text + "\"" + ").instance(0))");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Scroll to element failed");
            return false;
        }
    }
}