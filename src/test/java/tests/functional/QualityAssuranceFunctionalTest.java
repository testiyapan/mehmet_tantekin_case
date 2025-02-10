package tests.functional;

import locators.QualityAssuranceXPath;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.QualityAssurancePage;
import tests.base.BaseTest;
import expecteds.QualityAssuranceExpected;

import java.util.List;

public class QualityAssuranceFunctionalTest extends BaseTest {

    private QualityAssurancePage qualityAssurancePage;

    @BeforeMethod
    public void setUpPage() {
        qualityAssurancePage = new QualityAssurancePage(driver);
        Assert.assertNotNull(driver, "Driver is null, the test cannot be started!");
    }

    @Test(priority = 2)
    public void testQualityAssuranceParagraphText() {
        boolean isTextCorrect = qualityAssurancePage.verifyElementText(QualityAssuranceXPath.qualityAssuranceParagraph, QualityAssuranceExpected.qualityAssuranceText);
        Assert.assertTrue(isTextCorrect, "Element text is uncorrect");
    }

    @Test(priority = 1)
    public void testQualityAssurancePageTitle() {
        Assert.assertNotNull(qualityAssurancePage, "qualityAssurancePage nesnesi null, test başlatılamıyor!");

        String actualTitle = qualityAssurancePage.getPageTitle();
        Assert.assertTrue(actualTitle.contains(QualityAssuranceExpected.EXPECTED_TITLE), "The page title does not contain the expected value!");
    }

        @Test(priority = 4)
    public void testSeeAllQAJobsButton() {
        qualityAssurancePage.scrollUntilElementVisible(QualityAssuranceXPath.seeAllQAJobsButton, 10);
        boolean isElementVisible = qualityAssurancePage.isElementVisible(QualityAssuranceXPath.seeAllQAJobsButton);

        System.out.println("See All QA Jobs Button Visible: " + isElementVisible);
        Assert.assertTrue(isElementVisible, "'See All QA Jobs' buttun unvisible!");
    }










}
