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

    public MobileElement waitForElementToClick(MobileElement element) {
        return (MobileElement) setupWait(10).until(ExpectedConditions.elementToBeClickable(element));
    }

    public Boolean waitForElementChangeText(MobileElement element, String expectedText) {
        return setupWait(10).until(ExpectedConditions.textToBePresentInElement(element, expectedText));
    }

    public MobileElement waitForElementIsDisplayed(MobileElement element) {
        return (MobileElement) setupWait(10).until(ExpectedConditions.visibilityOf(element));
    }

    public MobileElement longWaitForElementIsDisplayed(MobileElement element) {
        return (MobileElement) setupWait(10000).until(ExpectedConditions.visibilityOf(element));
    }

    public MobileElement longWaitForElementToClick(MobileElement element) {
        return (MobileElement) setupWait(10000).until(ExpectedConditions.elementToBeClickable(element));
    }

    public List<WebElement> waitForListElements(List<WebElement> elementList) {
        return setupWait(10).until(ExpectedConditions.visibilityOfAllElements(elementList));
    }

    public MobileElement waitForElementDisplayedFlexibleTime(MobileElement element, int secondsForWait) {
        return (MobileElement) setupWait(secondsForWait).until(ExpectedConditions.visibilityOf(element));
    }

    private WebDriverWait setupWait(int seconds) {
        return new WebDriverWait(getAndroidDriver(), seconds);
    }
}