package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RoomPage extends DriverWait {

    public RoomPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //Text:
    @AndroidFindBy(id = "com.XXX.client:id/toolbar_title")
    public MobileElement chooseRoomTitle;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.XXX.client:id/checkImg']/parent::android.widget.LinearLayout/android.widget.TextView")
    public MobileElement currentRoom;
    @AndroidFindBy(id = "com.XXX.client:id/alertTitle")
    public MobileElement createNewRoomTitle;
    @AndroidFindBy(xpath = "//*[resource-id='com.XXX.client:id/tv_header' and @text='Wi-fi room']")
    public MobileElement roomWifi;
    @AndroidFindBy(xpath = "//*[resource-id='com.XXX.client:id/tv_header' and @text='Без комнаты']")
    public MobileElement roomWithoutRoom;

    //Button:
    @AndroidFindBy(id = "com.XXX.client:id/fab")
    public MobileElement createNewRoomBtn;
    @AndroidFindBy(id = "com.XXX.client:id/checkImg")
    public MobileElement selectorRoom;
    @AndroidFindBy(id = "android:id/button1")
    public MobileElement confirmCreateNewRoomBtn;
    @AndroidFindBy(id = "android:id/button2")
    public MobileElement cancelCreateNewRoomBtn;
    @AndroidFindBy(xpath = "//*[@content-desc='Перейти вверх']")
    public MobileElement backBtn;

    //Field:
    @AndroidFindBy(id = "com.XXX.client:id/dialog_editText")
    public MobileElement newRoomNameField;

}