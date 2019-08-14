package javaTests.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;

//Экран "Учетная запись"
public class UserAccountPage {

    public UserAccountPage(AppiumDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.rubetek.client:id/logOut")
    private MobileElement logOut;
    @AndroidFindBy(id = "android:id/button1")
    private MobileElement confirmLogout;
    @AndroidFindBy(id = "com.rubetek.client:id/resetPaassword")
    private MobileElement resetPassword;

    @Step("Нажимаем кнопку выйти")
    public void clickLogOut() {
        logOut.click();
    }

    @Step("Подтверждаем выход из учетки")
    public void clickConfirmLogout() {
        confirmLogout.click();
    }

    @Step("Нажимаем сброс пароля")
    public void clickResetPassword() {
        resetPassword.click();
    }

}
