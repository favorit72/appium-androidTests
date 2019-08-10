package helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class DriverWait extends Constructor {

    public DriverWait(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    protected MobileElement waitForElementToClick(MobileElement element) {
        return (MobileElement) setupWait(10).until(ExpectedConditions.elementToBeClickable(element));
    }

    protected MobileElement waitForElementIsDisplayed(MobileElement element) {
        return (MobileElement) setupWait(10).until(ExpectedConditions.visibilityOf(element));
    }

    protected List<WebElement> waitForListElements(List<WebElement> elementList) {
        return setupWait(10).until(ExpectedConditions.visibilityOfAllElements(elementList));
    }

    protected MobileElement waitForElementDisplayedFlexibleTime(MobileElement element, int secondsForWait) {
        return (MobileElement) setupWait(secondsForWait).until(ExpectedConditions.visibilityOf(element));
    }

    private WebDriverWait setupWait(int seconds) {
        return new WebDriverWait(getAndroidDriver(), seconds);
    }
}