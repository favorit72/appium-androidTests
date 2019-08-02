package com.rubetek.tests;

import org.openqa.selenium.NoSuchElementException;
import io.appium.java_client.MobileElement;

public class BaseAction {

    public static void click(MobileElement mobileElement) {
        try {
            if (mobileElement.isEnabled()) {
                mobileElement.click();
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    public static void setValue(MobileElement mobileElement, String setValue) {

        try {
            mobileElement.sendKeys(setValue);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    //Verifies is element enabled
    public static boolean isEnabled(MobileElement mobileElement) {
        return mobileElement.isEnabled();
    }


}