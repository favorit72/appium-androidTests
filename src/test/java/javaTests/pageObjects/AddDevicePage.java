package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddDevicePage extends DriverWait {
    public AddDevicePage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //Button:
    @AndroidFindBy(id = "com.rubetek.client:id/fab")
    public MobileElement addDeviceBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Управление']")
    public MobileElement controlTitleExpandableList;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Видеонаблюдение']")
    public MobileElement cameraTitleExpandableList;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Электропитание']")
    public MobileElement powerSupplyTitleExpandableList;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Освещение']")
    public MobileElement lightingTitleExpandableList;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Климат']")
    public MobileElement climateTitleExpandableList;

    //Text:
    @AndroidFindBy(id = "com.rubetek.client:id/toolbar_title")
    public MobileElement addDeviceTitle;
}
