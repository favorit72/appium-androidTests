package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AppSettingsPage extends DriverWait {
    public AppSettingsPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(id = "com.XXX.client:id/toolbar_title")
    public MobileElement appSettingsTitle;
    @AndroidFindBy(id = "com.XXX.client:id/phone_num")
    public MobileElement userAccountPhone;
    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
    public MobileElement accountText;
    @AndroidFindBy(id = "com.XXX.client:id/textView3")
    public MobileElement appVersionTitle;
    @AndroidFindBy(id = "com.XXX.client:id/extra_settings_header")
    public MobileElement additionSettingsTitle;
    @AndroidFindBy(id = "com.XXX.client:id/tvThemeName")
    public MobileElement themeText;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Автообновление устройств')]")
    public MobileElement autoUpdateText;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]")
    public MobileElement backBtn;
    //Switch:
    @AndroidFindBy(id = "com.XXX.client:id/switchTheme")
    public MobileElement themeSwitch;
    @AndroidFindBy(id = "com.XXX.client:id/voice_settings")
    public MobileElement voiceSettings;
    @AndroidFindBy(id = "com.XXX.client:id/autoUpdateSwitch")
    public MobileElement autoUpdateSwitch;
    @AndroidFindBy(id = "com.XXX.client:id/newDesignSwitch")
    public MobileElement tileInterfacesSwitch;

}
