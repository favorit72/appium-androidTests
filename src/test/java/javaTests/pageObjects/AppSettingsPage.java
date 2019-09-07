package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AppSettingsPage extends DriverWait {
    public AppSettingsPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(id = "com.rubetek.client:id/phone_num")
    public MobileElement userAccountPhone;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Учетная запись']")
    public MobileElement accountText;
    @AndroidFindBy(id = "com.rubetek.client:id/textView3")
    public MobileElement appVersionTitle;
    @AndroidFindBy(id = "com.rubetek.client:id/extra_settings_header")
    public MobileElement additionSettingsTitle;
    @AndroidFindBy(id = "com.rubetek.client:id/tvThemeName")
    public MobileElement themeText;

    //Switch:
    @AndroidFindBy(id = "com.rubetek.client:id/switchTheme")
    public MobileElement themeSwitch;
    @AndroidFindBy(id = "com.rubetek.client:id/voice_settings")
    public MobileElement voiceSettings;
    @AndroidFindBy(id = "com.rubetek.client:id/autoUpdateSwitch")
    public MobileElement autoUpdateSwitch;
    @AndroidFindBy(id = "com.rubetek.client:id/newDesignSwitch")
    public MobileElement tileInterfacesSwitch;
}
