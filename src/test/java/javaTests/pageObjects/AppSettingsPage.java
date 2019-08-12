package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;


public class AppSettingsPage extends DriverWait {

    public AppSettingsPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(id = "com.rubetek.client:id/phone_num")
    private MobileElement userAccount;

    @Step("нажимаем Учетная запись")
    public void clickUserAccount() {
        userAccount.click();
    }
}
