package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddDevicePage extends DriverWait {

    public AddDevicePage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //Button:
    @AndroidFindBy(id = "com.rubetek.client:id/fab")
    public MobileElement addDeviceBtn;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Перейти вверх']")
    public MobileElement backBtn;
    @AndroidFindBy(id = "com.rubetek.client:id/btn_check")
    public MobileElement nextBtn;

    //Text:
    @AndroidFindBy(id = "com.rubetek.client:id/toolbar_title")
    public MobileElement addDeviceScreenTitle;

    //Expandable list:
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Управление\").instance(0))")
    public MobileElement controlGroupExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Видеонаблюдение\").instance(0))")
    public MobileElement cameraGroupExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Электропитание\").instance(0))")
    public MobileElement powerSupplyGroupExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Освещение\").instance(0))")
    public MobileElement lightingGroupExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Климат\").instance(0))")
    public MobileElement climateGroupExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Датчики\").instance(0))")
    public MobileElement sensorGroupExpandableList;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Центр управления\").instance(0))")
    public MobileElement controlCenterExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Модуль управления\").instance(0))")
    public MobileElement controlModuleExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Уличная камера\").instance(0))")
    public MobileElement streetCameraExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Домашняя камера\").instance(0))")
    public MobileElement homeCameraExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Домофон\").instance(0))")
    public MobileElement intercomExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Wi-Fi розетка\").instance(0))")
    public MobileElement wifiSocketExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Одноканальный блок управления\").instance(0))")
    public MobileElement oneChannelWifiRelayExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Двухканальный блок управления\").instance(0))")
    public MobileElement twoChannelWifiRelayExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Wi-Fi сетевой фильтр\").instance(0))")
    public MobileElement wifiPowerStripExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Wi-Fi RGB лампа\").instance(0))")
    public MobileElement wifiRgbLampExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Светодиодная лента с Wi-Fi\").instance(0))")
    public MobileElement wifiRgbStripExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Одноканальный Wi-Fi выключатель\").instance(0))")
    public MobileElement oneChannelWifiSwitchExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Двухканальный Wi-Fi выключатель\").instance(0))")
    public MobileElement twoChannelWifiSwitchExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Терморегулятор TP Equation\").instance(0))")
    public MobileElement warmFloorExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Tion Бризер 3S\").instance(0))")
    public MobileElement tionExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Конвектор Electrolux\").instance(0))")
    public MobileElement convectorElectrolusExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Конвектор Ballu\").instance(0))")
    public MobileElement convectorBalluExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Кондиционер Midea\").instance(0))")
    public MobileElement conditionerMideaExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Кондиционер Haier\").instance(0))")
    public MobileElement conditionerHaierExpandableList;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().text(\"Кондиционер Electrolux\").instance(0))")
    public MobileElement conditionerElectroluxExpandableList;

}
