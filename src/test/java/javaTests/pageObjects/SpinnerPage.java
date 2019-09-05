package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SpinnerPage extends DriverWait {
    public SpinnerPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(id = "com.rubetek.client:id/spinner")
    public MobileElement spinner;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
    public MobileElement createHouseBtn;
    @AndroidFindBy(id = "android.widget.LinearLayout[2]")
    public MobileElement currentHouseName;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Войти по приглашению']")
    public MobileElement enterByInviteBtn;

}