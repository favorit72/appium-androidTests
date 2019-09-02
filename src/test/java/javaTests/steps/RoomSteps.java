package javaTests.steps;

import io.appium.java_client.android.AndroidDriver;
import javaTests.pageObjects.RoomPage;

public class RoomSteps {

    private final RoomPage roomPage;

    public RoomSteps(AndroidDriver androidDriver) {
        roomPage = new RoomPage(androidDriver);
    }
}