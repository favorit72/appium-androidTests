package javaTests.pageObjects;


import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DeviceListPage extends DriverWait {
    public DeviceListPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //BUTTONS:
    @AndroidFindBy(id = "com.rubetek.client:id/demo_close")
    public MobileElement demoModeCloseBtn;
    @AndroidFindBy(id = "com.rubetek.client:id/security")
    public MobileElement securityModeBtn;
    //TEXTS:
    @AndroidFindBy(id = "com.rubetek.client:id/demo_header")
    public MobileElement currentHouseName;
    @AndroidFindBy(id = "com.rubetek.client:id/name")
    public MobileElement securityStatus;
}