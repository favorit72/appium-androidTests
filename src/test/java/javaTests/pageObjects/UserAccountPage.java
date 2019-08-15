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

    //кнопка выйти
    @AndroidFindBy(id = "com.rubetek.client:id/logOut")
    public MobileElement logOutBtn;
    //подтвердить выход 'да'
    @AndroidFindBy(id = "android:id/button1")
    public MobileElement confirmLogoutBth;
    //сменить пароль
    @AndroidFindBy(id = "com.rubetek.client:id/resetPaassword")
    public MobileElement resetPasswordBth;
}
