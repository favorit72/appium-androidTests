package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

//Опции
public class MenuOptionsPage extends DriverWait {
    public MenuOptionsPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //Кнопка опций
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Ещё']")
    public MobileElement optionsBtn;
    //Настройки дома
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Настройки дома']")
    public MobileElement houseSettingsBtn;
    //Настройки приложения
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Настройки приложения']")
    public MobileElement appSettingsBtn;
}
