package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FooterPage extends DriverWait {
    public FooterPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //Click:
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'com.rubetek.client:id/bottom_navigation_small_container')][1]")
    public MobileElement deviceList;
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'com.rubetek.client:id/bottom_navigation_small_container')][2]")
    public MobileElement scenarioList;
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'com.rubetek.client:id/bottom_navigation_small_container')][3]")
    public MobileElement eventsList;
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'com.rubetek.client:id/bottom_navigation_small_container')][4]")
    public MobileElement statisticList;
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'com.rubetek.client:id/bottom_navigation_small_container')][5]")
    public MobileElement cameraList;
    @AndroidFindBy(id = "com.rubetek.client:id/bottom_navigation_notification")
    public MobileElement eventCounter;

    //Text
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'com.rubetek.client:id/bottom_navigation_small_item_title')]")
    public MobileElement deviceListInsetSubText;
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'com.rubetek.client:id/bottom_navigation_small_item_title')]")
    public MobileElement scenarioInsetSubText;
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'com.rubetek.client:id/bottom_navigation_small_item_title')]")
    public MobileElement eventInsetSubText;
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'com.rubetek.client:id/bottom_navigation_small_item_title')]")
    public MobileElement statisticInsetSubText;
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'com.rubetek.client:id/bottom_navigation_small_item_title')]")
    public MobileElement cameraInsetSubText;

}