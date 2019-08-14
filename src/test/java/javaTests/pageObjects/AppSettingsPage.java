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

    @AndroidFindBy(id = "com.rubetek.client:id/phone_num")
    public MobileElement userAccount;
}
