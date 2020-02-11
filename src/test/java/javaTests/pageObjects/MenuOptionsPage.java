package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MenuOptionsPage extends DriverWait {
    public MenuOptionsPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(xpath = "//*[@content-desc='Ещё' or @content-desc='Другие параметры']")
    public MobileElement optionsBtn;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/title' and @text='Настройки дома']")
    public MobileElement houseSettingsBtn;
    @AndroidFindBy(xpath = "//*[@resource-id='com.XXX.client:id/title' and @text='Настройки приложения']")
    public MobileElement appSettingsBtn;
}
