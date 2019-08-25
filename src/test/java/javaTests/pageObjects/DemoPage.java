package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DemoPage extends DriverWait {
    public DemoPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }
    @AndroidFindBy(id = "com.rubetek.client:id/btn_demo")
    public MobileElement demoMode;


}
