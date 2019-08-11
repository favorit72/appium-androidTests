//package javaTests.tests;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import javaTests.pageObjects.AppSettingsPage;
//import javaTests.pageObjects.MenuOptions;
//import javaTests.pageObjects.UserAccountPage;
//import javaTests.steps.LoginSteps;
//import utils.BaseTest;
//import utils.Listener.Listener;
//
//
//@Listeners(Listener.class)
//public class LogoutTest extends BaseTest {
//    private MenuOptions menu;
//
//    @BeforeClass
//    public void beforeClass() {
//        menu = new MenuOptions(driver());
//        appSettingsPage = new AppSettingsPage(driver());
//        userAccountPage = UserAccountPage(driver());
//    }
//
//    @Test
//    public void Logout() {
//        System.out.println("Start Logout Test");
//        MenuOptions menu = new MenuOptions();
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
