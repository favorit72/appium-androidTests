//package javaTests.tests;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//import javaTests.pageObjects.AppSettingsPage;
//import javaTests.pageObjects.MenuOptions;
//import javaTests.pageObjects.UserAccountPage;
//import utils.BaseTest;
//
//public class LogoutTest extends BaseTest {
//
//    @Test()
//
//    public void logout() {
//        System.out.println("Start Logout Test");
//        MenuOptions menu = new MenuOptions(driver);
//        AppSettingsPage appSettingsPage = new AppSettingsPage(driver);
//        UserAccountPage userAccountPage = new UserAccountPage(driver);
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//
//        menu.clickOptions();
//        menu.clickAppSettings();
//        appSettingsPage.clickUserAccount();
//        userAccountPage.clickLogOut();
//        userAccountPage.clickConfirmLogout();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.rubetek.client:id/title")));
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
