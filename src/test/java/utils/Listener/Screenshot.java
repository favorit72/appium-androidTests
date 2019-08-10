package utils.Listener;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Attachment;


public class Screenshot {

    public void captureScreenshot(AndroidDriver androidDriver, String nameDevice) {

        String file = new SimpleDateFormat("yyyy:MM:dd_HH:mm:ss").format(Calendar.getInstance().getTime()) + "_" + nameDevice + ".png";

        System.out.println("::: Got an exception ::: " + " ::: Will save screenshot into file: " + file);

        byte[] screenshot = androidDriver.getScreenshotAs(OutputType.BYTES);
        try {
            String SCREENSHOT_PATH = "./target/screenshots/";
            FileUtils.writeByteArrayToFile(new File(SCREENSHOT_PATH + file), saveScreenshot(screenshot));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Attachment(value = "screenShot", type = "image/png")
    private byte[] saveScreenshot(byte[] screenshot) {
        return screenshot;
    }

}