package javaTests.steps;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import javaTests.pageObjects.SecurityPage;

public class SecuritySteps {

    private final SecurityPage securityPage;

    public SecuritySteps(AndroidDriver androidDriver) {
        securityPage = new SecurityPage(androidDriver);
    }

    //CLICKS:
    @Step("Ставим дом на охрану")
    public void securityModeOn() {
        String securityStatus = securityPage.waitForElementIsDisplayed(securityPage.securityStatus).getText();
        if ("Дом снят с охраны".equals(securityStatus)) {
            securityPage.waitForElementToClick(securityPage.securityModeBtn).click();
        }
    }

    @Step("Снимаем дом с охраны")
    public void securityModeOff() {
        String securityStatus = securityPage.waitForElementIsDisplayed(securityPage.securityStatus).getText();
        if ("Дом поставлен на охрану".equals(securityStatus)) {
            securityPage.waitForElementToClick(securityPage.securityModeBtn).click();
        }
    }

    //CHECK TEXT:
    @Step("Дом не на охране")
    public void checkSecurityStatusOff() {
        String securityStatus = securityPage.waitForElementIsDisplayed(securityPage.securityStatus).getText();
        Assert.assertEquals(securityStatus, "Дом снят с охраны");
    }

    @Step("Дом на охране")
    public void checkSecurityStatusOn() {
        String securityStatus = securityPage.waitForElementIsDisplayed(securityPage.securityStatus).getText();
        Assert.assertEquals(securityStatus, "Дом поставлен на охрану");
    }
}
