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
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id,'com.rubetek.client:id/bottom_navigation_small_container')][1]")
    public MobileElement deviceList;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id,'com.rubetek.client:id/bottom_navigation_small_container')][2]")
    public MobileElement scenarioList;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id,'com.rubetek.client:id/bottom_navigation_small_container')][3]")
    public MobileElement eventsList;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id,'com.rubetek.client:id/bottom_navigation_small_container')][4]")
    public MobileElement statisticList;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id,'com.rubetek.client:id/bottom_navigation_small_container')][5]")
    public MobileElement cameraList;
    @AndroidFindBy(id = "com.rubetek.clientidbottom_navigation_notification")
    public MobileElement eventCounter;

    //Text
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.rubetek.client:id/bottom_navigation_small_item_title' and @text='Устройства']")
    public MobileElement deviceListInsetSubText;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.rubetek.client:id/bottom_navigation_small_item_title' and @text='Сценарии']")
    public MobileElement scenarioInsetSubText;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.rubetek.client:id/bottom_navigation_small_item_title' and @text='События']")
    public MobileElement eventInsetSubText;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.rubetek.client:id/bottom_navigation_small_item_title' and @text='Статистика']")
    public MobileElement statisticInsetSubText;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.rubetek.client:id/bottom_navigation_small_item_title' and @text='Камеры']")
    public MobileElement cameraInsetSubText;

}