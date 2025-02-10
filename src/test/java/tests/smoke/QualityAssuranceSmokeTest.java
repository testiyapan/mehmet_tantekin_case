package tests.smoke;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.QualityAssurancePage;
import tests.base.BaseTest;

public class QualityAssuranceSmokeTest extends BaseTest {

    private QualityAssurancePage qualityAssurancePage;

    @BeforeMethod
    public void setUp() {
        qualityAssurancePage = new QualityAssurancePage(driver);
    }

    @Test
    public void testQualityAssurancePageLoadsSuccessfully() {
        Assert.assertTrue(qualityAssurancePage.isPageTitleContainsExpected(), "'Careers' page not loaded!");
    }

}
