package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FooterPage extends DriverWait {
    public FooterPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[1]")
    public MobileElement deviceList;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[2]")
    public MobileElement scenarioList;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[3]")
    public MobileElement eventsList;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[4]")
    public MobileElement statisticList;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[5]")
    public MobileElement cameraList;
    @AndroidFindBy(id = "com.rubetek.client:id/bottom_navigation_notification")
    public MobileElement eventCounter;
    @AndroidFindBy(id = "com.rubetek.client:id/bottom_navigation_small_item_title")
    public MobileElement subTextDeviceListInset;

}


