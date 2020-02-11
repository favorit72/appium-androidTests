package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SpinnerPage extends DriverWait {
    public SpinnerPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(id = "com.XXX.client:id/spinner")
    public MobileElement spinner;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/tvProjectName' and @text='Создать новый дом']")
    public MobileElement createHouseBtn;
    @AndroidFindBy(id = "com.XXX.client:id/tvProjectName")
    public MobileElement currentHouseName;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/tvProjectName' and @text='Войти по приглашению']")
    public MobileElement enterByInviteBtn;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/tvProjectName' and @text='CC test']")
    public MobileElement houseNameCC;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/tvProjectName' and @text='Wi-fi test']")
    public MobileElement houseNameWIFI;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/tvProjectName' and @text='Мой умный дом']/parent::*/android.widget.ImageView[2]")
    public MobileElement deleteDemoHouse;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/tvProjectName' and @text='wifi house']/parent::*/android.widget.ImageView[2]")
    public MobileElement deleteGuestWifiHouse;

}