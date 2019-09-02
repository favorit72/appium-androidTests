package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HousePage extends DriverWait {
    public HousePage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(id = "com.rubetek.client:id/demo_header")
    public MobileElement currentHouseName;
}
