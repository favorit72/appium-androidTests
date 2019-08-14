package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

//Экран "Учетная запись"
public class UserAccountPage extends DriverWait {

    public UserAccountPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(id = "com.rubetek.client:id/logOut")
    private MobileElement logOutBtn;
    @AndroidFindBy(id = "android:id/button1")
    private MobileElement confirmLogoutBth;
    @AndroidFindBy(id = "com.rubetek.client:id/resetPaassword")
    private MobileElement resetPasswordBth;
}
