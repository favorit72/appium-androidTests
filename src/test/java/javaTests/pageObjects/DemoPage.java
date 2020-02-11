package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DemoPage extends DriverWait {
    public DemoPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(id = "com.XXX.client:id/btn_demo")
    public MobileElement demoModeBtn;
    @AndroidFindBy(id = "com.XXX.client:id/demo_close")
    public MobileElement closeDemoHouseBtn;
    @AndroidFindBy(id = "com.XXX.client:id/demo_header")
    public MobileElement demoHouseName;
}
