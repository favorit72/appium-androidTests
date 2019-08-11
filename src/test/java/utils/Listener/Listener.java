package utils.Listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.testng.AllureTestNg;
import utils.BaseTest;


public class Listener extends AllureTestNg implements ITestListener {

    private final Logger logger = LoggerFactory.getLogger(Listener.class);
    private final static String DEVICE_NAME = "DEVICE_NAME";

    @Override
    public void onTestStart(ITestResult result) {
        logger.info("Test started: " + result.getName() + ": " + result.getTestContext().getCurrentXmlTest().getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("Test success: " + result.getName() + ": " + result.getTestContext().getCurrentXmlTest().getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.info("Test failed: " + result.getName() + ": " + result.getTestContext().getCurrentXmlTest().getName());
        String nameDevice = result.getTestContext().getCurrentXmlTest().getParameter(DEVICE_NAME);

        if (result.getInstance() instanceof BaseTest) {
            final BaseTest instance = (BaseTest) result.getInstance();
            final AndroidDriver androidDriver = instance.driver();
            Screenshot screenshot = new Screenshot();
            screenshot.captureScreenshot(androidDriver, nameDevice);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
        logger.info("Suite started: " + context.getCurrentXmlTest().getSuite().getName() + " | " + context.getCurrentXmlTest().getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        logger.info("Suite finished: " + context.getCurrentXmlTest().getSuite().getName() + " | " + context.getCurrentXmlTest().getName());
    }
}
