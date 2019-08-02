package javaTests.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.qameta.allure.Step;
import io.qameta.allure.Step;

public class MenuOptions {

    public MenuOptions(AppiumDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(className = "android.widget.ImageView")
    private MobileElement options;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView")
    private MobileElement houseSettings;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView")
    private MobileElement appSettings;

    @Step("нажимаем опции")
    public void clickOptions() {
        options.click();
    }

    @Step("нажимаем настройки дома")
    public void clickHouseSettings() {
        houseSettings.click();
    }

    @Step("нажимаем настройки приложения")
    public void clickAppSettings() {
        appSettings.click();
    }


}
