package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import io.appium.java_client.android.AndroidDriver;
import utils.listener.Screenshot;

import static io.appium.java_client.remote.MobileCapabilityType.DEVICE_NAME;

public class RetryAnalyzerCount implements IRetryAnalyzer {
    private int nowCount = 0;
    private int maxCount = 1;

    @Override
    public boolean retry(ITestResult result) {
        takeScreenshotAtRetry(result);

        if (nowCount < maxCount) {
            nowCount++;
            return true; //пока истина перезапускаем
        }
        System.out.println("Тест завален дважды");
        nowCount = 0;
        return false;
    }

    private void takeScreenshotAtRetry(ITestResult result) {
        String nameDevice = result.getTestContext().getCurrentXmlTest().getParameter(DEVICE_NAME);
        final BaseTest instance = (BaseTest) result.getInstance();
        final AndroidDriver androidDriver = instance.driver();
        Screenshot screenshot = new Screenshot();
        screenshot.captureScreenshot(androidDriver, nameDevice);
    }
}