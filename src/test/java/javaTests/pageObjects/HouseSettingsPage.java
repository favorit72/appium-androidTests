package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HouseSettingsPage extends DriverWait {

    public HouseSettingsPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //Button:
    @AndroidFindBy(id = "com.XXX.client:id/phones")
    public MobileElement smsNotificationBtn;
    @AndroidFindBy(id = "com.XXX.client:id/invites")
    public MobileElement invitesBtn;
    @AndroidFindBy(xpath = "//*[@content-desc='Перейти вверх']")
    public MobileElement backBtn;
    //Field:
    @AndroidFindBy(id = "com.XXX.client:id/tv_house_name")
    public MobileElement houseName;
    //Text:
    @AndroidFindBy(id = "com.XXX.client:id/toolbar_title")
    public MobileElement title;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Основные параметры')]")
    public MobileElement commonParameterSection;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/houseName']/android.widget.TextView[@text='Название дома']")
    public MobileElement houseNameTitle;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/guests']/android.widget.TextView[@text='Список гостей']")
    public MobileElement guestListTitle;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/guests']/android.widget.TextView[2]")
    public MobileElement guestListDescription;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/hide_settings']/android.widget.TextView[1]")
    public MobileElement hideDeviceSectionTitle;
    @AndroidFindBy(id = "com.XXX.client:id/tv_device_visibility")
    public MobileElement hiddenDevicesText;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/hide_settings']/android.widget.TextView[3]")
    public MobileElement hideDeviceDescription;

}
