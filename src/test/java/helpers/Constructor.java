package helpers;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class Constructor {

    private AndroidDriver androidDriver;

    Constructor(AndroidDriver androidDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
        this.androidDriver = androidDriver;
    }

    protected AndroidDriver getAndroidDriver() {
        return androidDriver;
    }
}

