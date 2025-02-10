package tests.functional;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import expecteds.HomePageExpected;
import pages.PageObject;
import tests.base.BaseTest;

public class HomePageFunctionalTest extends BaseTest {

    private HomePage homePage;

    @BeforeMethod
    public void setUpPage() {
        homePage = new HomePage(driver);
        Assert.assertNotNull(driver, "Driver is null, the test cannot be started!");
    }

    @Test(priority = 1)
    public void testHomePageTitle() {
        String actualTitle = homePage.getHomePageTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(actualTitle.contains(HomePageExpected.EXPECTED_TITLE), "The page title does not contain the expected value!");
    }

    @Test(priority = 2)
    public void testNavigationMenuIsDisplayed() {
        Assert.assertTrue(homePage.isNavigationMenuDisplayed(), "The navigation menu is not visible!");
    }

    @Test(priority = 3)
    public void testLoginButtonNavigation() {
        String originalTab = driver.getWindowHandle();
        homePage.clickLoginButton();
        homePage.switchToNewTab();

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL in new tab: " + currentUrl);
        Assert.assertTrue(currentUrl.contains(HomePageExpected.EXPECTED_URL_LOGIN), "incorrect page loaded!");

        homePage.closeCurrentTab();
        driver.switchTo().window(originalTab);
        System.out.println("Returned to original tab: " + driver.getCurrentUrl());
    }



}
