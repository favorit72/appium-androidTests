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
    @AndroidFindBy(id = "com.rubetek.client:id/completeBtn")
    public MobileElement completeAddDeviceBySmartConfig;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Перейти вверх']")
    public MobileElement backBtn;
    @AndroidFindBy(id = "com.rubetek.client:id/btn")
    public MobileElement viewBtn;
    @AndroidFindBy(id = "com.rubetek.client:id/btn_check")
    public MobileElement nextBtn;
    @AndroidFindBy(id = "com.rubetek.client:id/menu_help")
    public MobileElement helpBtn;

    //Element:
    @AndroidFindBy(id = "com.rubetek.client:id/progress")
    public MobileElement progressLoader;

    //Field:
    @AndroidFindBy(id = "com.rubetek.client:id/password")
    public MobileElement smartConfigPasswordField;
    @AndroidFindBy(id = "com.rubetek.client:id/ssid")
    public MobileElement smartConfigSSID;
    @AndroidFindBy(id = "com.rubetek.client:id/deviceName")
    public MobileElement defaultDeviceNameAfterSmartConfigField;

    //Text:
    @AndroidFindBy(id = "com.rubetek.client:id/tv1")
    public MobileElement smartConfigSubTitle;
    @AndroidFindBy(id = "com.rubetek.client:id/tv2")
    public MobileElement smartConfigDescriptionText;
    @AndroidFindBy(id = "com.rubetek.client:id/toolbar_title")
    public MobileElement smartConfigTitle;
    @AndroidFindBy(id = "com.rubetek.client:id/helpInfo")
    public MobileElement deviceNameAfterSmartConfigDescription;
    @AndroidFindBy(id = "com.rubetek.client:id/tv_title")
    public MobileElement prepareDeviceSmartConfigTitle;
    @AndroidFindBy(id = "com.rubetek.client:id/tv_note")
    public MobileElement prepareDeviceSmartConfigDescription;

}
