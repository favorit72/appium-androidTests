package javaTests.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;


public class AppSettingsPage {

    public AppSettingsPage(AppiumDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.rubetek.client:id/phone_num")
    private MobileElement userAccount;

    @Step("нажимаем Учетная запись")
    public void clickUserAccount() {
        userAccount.click();
    }
}
