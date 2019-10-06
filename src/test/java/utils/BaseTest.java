package utils;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
    private static final String APPIUM_SERVER_URL = "http://localhost:4723/wd/hub";
    private final Logger logger = LoggerFactory.getLogger(BaseTest.class);
    private AndroidDriver androidDriver;
    private final static String APP_PACKAGE = "com.rubetek.client";
    private final static String APP_ACTIVITY = "com.rubetek.client.ui.splash.SplashActivity";
    private final static String PLATFORM = "ANDROID";
    private final static int IMPLICITLY_WAIT = 20;
    private final static int COMMAND_TIMEOUT = 10;
    private final static String PHONE = "Phone";
    protected BaseAction baseAction;

    @Parameters({"ID"})
    @BeforeClass
    public void setUp(@Optional String id) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APP_PACKAGE);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, PHONE);
        capabilities.setCapability(MobileCapabilityType.UDID, id);
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
//        capabilities.setCapability(AndroidMobileCapabilityType.UNICODE_KEYBOARD, true);
//        capabilities.setCapability(AndroidMobileCapabilityType.RESET_KEYBOARD, true);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, COMMAND_TIMEOUT);

        androidDriver = (new AndroidDriver(new URL(APPIUM_SERVER_URL), capabilities));
        androidDriver.rotate(ScreenOrientation.PORTRAIT);
        androidDriver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT, TimeUnit.SECONDS);
        logger.info("rotation to 'portrait' for ");
        setUpBaseActions();
    }

    public AndroidDriver driver() {
        return androidDriver;
    }

    public void startActivity(String appPackage, String activity) {
        driver().startActivity(new Activity(appPackage, activity));
    }

    public String currentActivity() {
        String currentActivity = null;
        while (currentActivity == null) {
            currentActivity = driver().currentActivity();
            Thread.yield();
        }
        return currentActivity;
    }

    private void setUpBaseActions() {
        baseAction = new BaseAction(androidDriver);
    }

    @AfterClass
    public void tearDown() {
        if (androidDriver != null) {
            androidDriver.quit();
        }
    }
}
