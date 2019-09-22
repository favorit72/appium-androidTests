package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SmartConfigWifiSocketPage extends DriverWait {

    public SmartConfigWifiSocketPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //Text:
    @AndroidFindBy(id = "com.rubetek.client:id/tv_title")
    public MobileElement prepareWifiSocketSmartConfigTitle;
    @AndroidFindBy(id = "com.rubetek.client:id/tv_note")
    public MobileElement prepareWifiSocketSmartConfigDescription;

    //Field:
    @AndroidFindBy(id = "com.rubetek.client:id/deviceName")
    public MobileElement defaultDeviceNameAfterSmartConfigField;

}
