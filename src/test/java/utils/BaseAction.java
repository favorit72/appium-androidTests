package utils;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class BaseAction {

    private AndroidDriver driver;

    public BaseAction(AndroidDriver driver) {
        this.driver = driver;
    }

    public void pressBack() {
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

    public void openNotification() {
        driver.openNotifications();
    }

    public void hideKeyBoard() {
        driver.hideKeyboard();
    }
}