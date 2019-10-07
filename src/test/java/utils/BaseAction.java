package utils;


import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.time.Duration;
//import javafx.geometry.HorizontalDirection;

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

//    @Step("Нажимаем на элемент и свайпаем в {direction} сторону {element}")
//    public void swipeFromElement(MobileElement element, HorizontalDirection direction) {
//        PointOption targetPointOption;
//        Point targetPoint;
//
//        if (direction == HorizontalDirection.LEFT) {
//            targetPointOption = new PointOption().withCoordinates(element.getRect().getWidth() - 1, element.getCenter().y);
//            targetPoint = new Point(1, element.getCenter().y);
//        } else {
//            targetPointOption = new PointOption().withCoordinates(1, element.getCenter().y);
//            targetPoint = new Point(element.getRect().width - 1, element.getCenter().y);
//        }
//        TouchAction t = new TouchAction(driver);
//        t.longPress(LongPressOptions
//                .longPressOptions()
//                //.withDuration(Duration.ofSeconds(4))
//                .withPosition(targetPointOption))
//                .moveTo(PointOption.point(targetPoint))
//                .release()
//                .perform();
//    }

}