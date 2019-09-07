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
    @AndroidFindBy(xpath = "//android.widget.LinearLayout")
    public MobileElement createHouseBtn;
    @AndroidFindBy(id = "com.rubetek.client:id/tvProjectName")
    public MobileElement currentHouseName;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Войти по приглашению']")
    public MobileElement enterByInviteBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ЦУ Test_Name']")
    public MobileElement houseNameCC;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Wi-fi Test_Name']")
    public MobileElement houseNameWIFI;

}