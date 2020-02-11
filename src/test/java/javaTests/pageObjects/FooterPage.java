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
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/bottom_navigation_small_container'][1]")
    public MobileElement deviceList;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/bottom_navigation_small_container'][2]")
    public MobileElement scenarioList;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/bottom_navigation_small_container'][3]")
    public MobileElement eventsList;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/bottom_navigation_small_container'][4]")
    public MobileElement statisticList;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/bottom_navigation_small_container'][5]")
    public MobileElement cameraList;
    @AndroidFindBy(id = "com.XXX.client:id/bottom_navigation_notification")
    public MobileElement eventCounter;

    //Text
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/bottom_navigation_small_item_title']")
    public MobileElement deviceListInsetSubText;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/bottom_navigation_small_item_title']")
    public MobileElement scenarioInsetSubText;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/bottom_navigation_small_item_title']")
    public MobileElement eventInsetSubText;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/bottom_navigation_small_item_title']")
    public MobileElement statisticInsetSubText;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/bottom_navigation_small_item_title']")
    public MobileElement cameraInsetSubText;

}