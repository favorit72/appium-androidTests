package javaTests.tests;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class BaseTest {
    private static final String APPIUM_SERVER_URL = "http://localhost:4723/wd/hub";
    public AndroidDriver<org.openqa.selenium.WebElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "x");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.rubetek.client");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.rubetek.client.ui.splash.SplashActivity");
        capabilities.setCapability("noReset", "true");
        driver = new AndroidDriver<>(new URL(APPIUM_SERVER_URL), capabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
