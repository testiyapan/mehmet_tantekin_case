package tests.smoke;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.OpenPositionsPage;
import tests.base.BaseTest;

public class OpenPositionsPageSmokeTest extends BaseTest {

    private OpenPositionsPage openPositionsPage;

    @BeforeMethod
    public void setUp() {
        openPositionsPage = new OpenPositionsPage(driver);
    }

    @Test
    public void testFiltersExist() {
        Assert.assertTrue(openPositionsPage.areFiltersApplied(), "Filtreler not avaible!");
    }

    @Test
    public void testOpenPositionsPageLoadsSuccessfully() {
        Assert.assertTrue(openPositionsPage.isPageTitleContainsExpected(), "'Careers' page not loaded!");
    }


}
