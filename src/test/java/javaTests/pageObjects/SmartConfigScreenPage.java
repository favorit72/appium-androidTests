package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SmartConfigScreenPage extends DriverWait {

    public SmartConfigScreenPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //Button:
    @AndroidFindBy(id = "com.XXX.client:id/completeBtn")
    public MobileElement completeAddDeviceBySmartConfig;
    @AndroidFindBy(xpath = "//*[@content-desc='Перейти вверх']")
    public MobileElement backBtn;
    @AndroidFindBy(id = "com.XXX.client:id/btn")
    public MobileElement viewBtn;
    @AndroidFindBy(id = "com.XXX.client:id/btn_check")
    public MobileElement nextBtn;
    @AndroidFindBy(id = "com.XXX.client:id/menu_help")
    public MobileElement helpBtn;

    //Element:
    @AndroidFindBy(id = "com.XXX.client:id/progress")
    public MobileElement progressLoader;

    //Field:
    @AndroidFindBy(id = "com.XXX.client:id/password")
    public MobileElement smartConfigPasswordField;
    @AndroidFindBy(id = "com.XXX.client:id/ssid")
    public MobileElement smartConfigSSID;
    @AndroidFindBy(id = "com.XXX.client:id/deviceName")
    public MobileElement defaultDeviceNameAfterSmartConfigField;

    //Text:
    @AndroidFindBy(id = "com.XXX.client:id/tv1")
    public MobileElement smartConfigSubTitle;
    @AndroidFindBy(id = "com.XXX.client:id/tv2")
    public MobileElement smartConfigDescriptionText;
    @AndroidFindBy(id = "com.XXX.client:id/toolbar_title")
    public MobileElement smartConfigTitle;
    @AndroidFindBy(id = "com.XXX.client:id/helpInfo")
    public MobileElement deviceNameAfterSmartConfigDescription;
    @AndroidFindBy(id = "com.XXX.client:id/tv_title")
    public MobileElement prepareDeviceSmartConfigTitle;
    @AndroidFindBy(id = "com.XXX.client:id/tv_note")
    public MobileElement prepareDeviceSmartConfigDescription;

}
