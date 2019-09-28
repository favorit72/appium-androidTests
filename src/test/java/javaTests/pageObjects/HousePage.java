package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HousePage extends DriverWait {
    public HousePage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //Button:
    @AndroidFindBy(id = "com.rubetek.client:id/action_help")
    public MobileElement helpBtn;
    @AndroidFindBy(id = "com.rubetek.client:id/createHouse")
    public MobileElement createHouseBtn;
    @AndroidFindBy(id = "com.rubetek.client:id/inviteHouse")
    public MobileElement enterByInviteBtn2;
    @AndroidFindBy(id = "android:id/button1")
    public MobileElement okButton;
    @AndroidFindBy(id = "com.rubetek.client:id/addDevices")
    public MobileElement goToAddDevicesBtn;
    @AndroidFindBy(id = "com.rubetek.client:id/continueBtn")
    public MobileElement continueBtn;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Перейти вверх']")
    public MobileElement backBtn;
    @AndroidFindBy(id = "android:id/button2")
    public MobileElement deleteHouseCancelBtn;
    @AndroidFindBy(id = "android:id/button1")
    public MobileElement deleteHouseOkBtn;
    @AndroidFindBy(id = "com.rubetek.client:id/open_house")
    public MobileElement goToUseHouseAfterInvite;

    //Field:
    @AndroidFindBy(id = "com.rubetek.client:id/houseName")
    public MobileElement newHouseNameField;

    //Text:
    @AndroidFindBy(id = "com.rubetek.client:id/toolbar_title")
    public MobileElement createNewHouseTitle;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Выбранное название')]")
    public MobileElement newHouseNameDescription;
    @AndroidFindBy(id = "android:id/message")
    public MobileElement messageEmptyNameNewHouse;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]")
    public MobileElement congratulationMessage;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]")
    public MobileElement completeCreateHouseDescription;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Устройств пока нет']")
    public MobileElement notAvailableDevices;
    @AndroidFindBy(id = "com.rubetek.client:id/alertTitle")
    public MobileElement deleteHouseTitle;
    @AndroidFindBy(id = "android:id/message")
    public MobileElement deleteHouseDescription;
    @AndroidFindBy(id = "com.rubetek.client:id/progressBar2")
    public MobileElement progressBarDuringEnterByInvite;
    @AndroidFindBy(id = "com.rubetek.client:id/textView5")
    public MobileElement messageDuringEnterByInvite;

}
