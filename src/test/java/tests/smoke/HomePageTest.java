package tests.smoke;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import tests.base.BaseTest;

public class HomePageTest extends BaseTest {

    private HomePage homePage;

    @BeforeMethod
    public void setUp() {
        homePage = new HomePage(driver);
        Assert.assertNotNull(driver, "Driver is null, the test cannot be started!");
    }

    @Test
    public void testHomePageLoadsSuccessfully() {
        Assert.assertTrue(homePage.isHomePageOpened(), "Home Page not laodedi!");
    }
}
