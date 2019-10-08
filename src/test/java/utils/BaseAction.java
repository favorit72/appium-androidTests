package utils;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import java.time.Duration;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;

public class BaseAction {

    private AndroidDriver driver;

    public BaseAction(AndroidDriver driver) {
        this.driver = driver;
    }

    @Step("Нажимаем хардварную кнопку назад")
    public void pressBackHW() {
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

    @Step("Нажимаем кнопку назад")
    public void pressBackBtn() {
        driver.findElement(By.xpath("//*[@content-desc='Перейти вверх']")).click();
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

    @Step("Лонгпресс на элемент {element}")
    public void longPress(MobileElement element) {
        ElementOption elOption = new ElementOption()
                .withElement(element);

        LongPressOptions lpOptions = new LongPressOptions()
                .withElement(elOption)
                .withDuration(Duration.ofSeconds(4));

        TouchAction t = new TouchAction(driver);
        t.longPress(lpOptions);
        t.perform();
    }

    @Step("Нажимаем на элемент и свайпаем влевую сторону {element}")
    public void swipeFromElementToLeft(MobileElement element) {
        PointOption targetPointOption;
        Point targetPoint;

        targetPointOption = new PointOption().withCoordinates(element.getRect().getWidth() - 1, element.getCenter().y);
        targetPoint = new Point(1, element.getCenter().y);
        TouchAction t = new TouchAction(driver);

        t.longPress(LongPressOptions
                .longPressOptions()
                //.withDuration(Duration.ofSeconds(4))
                .withPosition(targetPointOption))
                .moveTo(PointOption.point(targetPoint))
                .release()
                .perform();
    }

    @Step("Нажимаем на элемент и свайпаем вправую сторону {element}")
    public void swipeFromElementToRight(MobileElement element) {
        PointOption targetPointOption;
        Point targetPoint;

        targetPointOption = new PointOption().withCoordinates(1, element.getCenter().y);
        targetPoint = new Point(element.getRect().width - 1, element.getCenter().y);
        TouchAction t = new TouchAction(driver);

        t.longPress(LongPressOptions
                .longPressOptions()
                //.withDuration(Duration.ofSeconds(4))
                .withPosition(targetPointOption))
                .moveTo(PointOption.point(targetPoint))
                .release()
                .perform();
    }

    @Step("Перезапускаем приложение")
    //также костыль для андроид 7+ и для ретрай
    public void restartApp() {
        driver.runAppInBackground(Duration.ofMillis(500));
    }

}