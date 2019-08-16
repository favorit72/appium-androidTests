package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

//Экран "настройки приложения"
public class AppSettingsPage extends DriverWait {
    public AppSettingsPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }
    //Номер телефона
    @AndroidFindBy(id = "com.rubetek.client:id/phone_num")
    public MobileElement userAccountPhone;
    //Текст учетной записи
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Учетная запись']")
    public MobileElement accountText;
    //Текст заголовка версия приложение
    @AndroidFindBy(id = "com.rubetek.client:id/textView3")
    public MobileElement appVersionTitle;
    //Текст заголовка Дополнительные настройки
    @AndroidFindBy(id = "com.rubetek.client:id/extra_settings_header")
    public MobileElement additionSettingsTitle;
    //Текст 'темная тема'
    @AndroidFindBy(id = "com.rubetek.client:id/tvThemeName")
    public MobileElement themeText;

    //СВИТЧИ
    //Свитч темная тема
    @AndroidFindBy(id = "com.rubetek.client:id/switchTheme")
    public MobileElement themeSwitch;
    //Настройки голоса
    @AndroidFindBy(id = "com.rubetek.client:id/voice_settings")
    public MobileElement voiceSettings;
    //Свитч автообновлений
    @AndroidFindBy(id = "com.rubetek.client:id/autoUpdateSwitch")
    public MobileElement autoUpdateSwitch;
    //Свитч литочный интерфейс
    @AndroidFindBy(id = "com.rubetek.client:id/newDesignSwitch")
    public MobileElement tileInterfacesSwitch;
}
