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

    //КЛИКИ:
    //кнопка выйти
    @AndroidFindBy(id = "com.rubetek.client:id/logOut")
    public MobileElement logOutBtn;
    //подтвердить выход 'да'
    @AndroidFindBy(id = "android:id/button1")
    public MobileElement confirmLogoutBth;
    //отмены выхода 'нет'
    @AndroidFindBy(id = "android:id/button2")
    public MobileElement cancelLogoutBtn;
    //сменить пароль
    @AndroidFindBy(id = "com.rubetek.client:id/resetPassword")
    public MobileElement resetPasswordBth;

    //ПРОВЕРКИ ТЕКСТОВ:
    //заголовок
    @AndroidFindBy(id = "com.rubetek.client:id/toolbar_title")
    public MobileElement userAccountTitle;
    //заголовок алерта выхода из учетки
    @AndroidFindBy(id = "com.rubetek.client:id/alertTitle")
    public MobileElement alertLogoutTitle;
    //сообщение алерта выхода с учетки
    @AndroidFindBy(id = "android:id/message")
    public MobileElement messageAlertLogout;

}
