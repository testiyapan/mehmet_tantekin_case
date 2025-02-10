package tests.functional;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CareersPage;
import pages.HomePage;
import tests.base.BaseTest;

public class NavigateToCareersTest extends BaseTest {

    private HomePage homePage;

    @BeforeMethod
    public void setUpPage() {
        homePage = new HomePage(driver);
        Assert.assertNotNull(driver, "Driver is null, the test cannot be started!");
    }
    @Test
    public void testNavigateToCareers() {
        homePage.navigateToCareers();
        CareersPage careersPage = new CareersPage(driver);
        Assert.assertTrue(driver.getTitle().contains("Careers"), "The page title does not contain the expected value!");
    }
}
