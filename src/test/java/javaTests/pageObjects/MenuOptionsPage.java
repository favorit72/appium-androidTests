package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

//Опции
public class MenuOptionsPage extends DriverWait {
    public MenuOptionsPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(className = "android.widget.ImageView")
    public MobileElement options;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView")
    public MobileElement houseSettings;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView")
    public MobileElement appSettings;
}
