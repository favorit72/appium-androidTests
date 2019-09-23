package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DeviceListPage extends DriverWait {
    public DeviceListPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Устройств пока нет']")
    public MobileElement notAvailableDevices;
}
