package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SmartConfigScreenPage extends DriverWait {

    public SmartConfigScreenPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //Click:
    @AndroidFindBy(id = "com.rubetek.client:id/completeBtn")
    public MobileElement completeAddDeviceBySmartConfig;

    //Field:
    @AndroidFindBy(id = "com.rubetek.client:id/password")
    public MobileElement smartConfigPasswordField;
    @AndroidFindBy(id = "com.rubetek.client:id/ssid")
    public MobileElement smartConfigSSID;

    //Text:
    @AndroidFindBy(id = "com.rubetek.client:id/tv1")
    public MobileElement smartConfigSubTitle;
    @AndroidFindBy(id = "com.rubetek.client:id/tv2")
    public MobileElement smartConfigDescriptionText;
    @AndroidFindBy(id = "com.rubetek.client:id/toolbar_title")
    public MobileElement completeOfSmartConfigTitle;
    @AndroidFindBy(id = "com.rubetek.client:id/helpInfo")
    public MobileElement deviceNameAfterSmartConfigDescription;

}
