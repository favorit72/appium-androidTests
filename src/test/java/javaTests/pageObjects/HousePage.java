package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HousePage extends DriverWait {
    public HousePage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(id = "com.rubetek.client:id/toolbar_title")
    public MobileElement createNewHouseTitle;
    @AndroidFindBy(id = "com.rubetek.client:id/houseName")
    public MobileElement newHouseName;
    @AndroidFindBy(id = "com.rubetek.client:id/createHouse")
    public MobileElement createHouseBtn;
    @AndroidFindBy(id = "com.rubetek.client:id/inviteHouse")
    public MobileElement enterByInviteBtn2;
    @AndroidFindBy(className = "android.widget.TextView[2]")
    public MobileElement newHouseNameDescription;
    @AndroidFindBy(id = "com.rubetek.client:id/action_help")
    public MobileElement helpBtn;
}
