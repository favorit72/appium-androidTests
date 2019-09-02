package javaTests.pageObjects;


import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SecurityPage extends DriverWait {
    public SecurityPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //BUTTONS:
    @AndroidFindBy(id = "com.rubetek.client:id/security")
    public MobileElement securityModeBtn;
    //TEXTS:
    @AndroidFindBy(id = "com.rubetek.client:id/name")
    public MobileElement securityStatus;
}