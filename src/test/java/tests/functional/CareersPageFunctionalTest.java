package tests.functional;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import pages.CareersPage;
import tests.base.BaseTest;
import expecteds.CareersExpected;


import java.util.List;

public class CareersPageFunctionalTest extends BaseTest {

    private CareersPage careersPage;

    @BeforeMethod
    public void setUpPage() {
        careersPage = new CareersPage(driver);
        Assert.assertTrue(careersPage.isPageTitleContainsExpected(),
                "The page title does not contain the expected value! Expected: " + CareersExpected.EXPECTED_TITLE);
    }

    @Test(priority = 0)
    public void testCareersPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("careers"), "On the wrong page!");
    }

    @Test(priority = 1)
    public void testSeeAllTeamsButton() {
        // "See All Teams" butonuna tıkla
        careersPage.checkAndClickSeeAllTeamsButton();

        // Takım kartlarını al ve kontrol et
        List<WebElement> teamCards = careersPage.getTeamElements();
        Assert.assertFalse(teamCards.isEmpty(), "Team cards are empty");
    }

    @Test(priority = 2)
    public void testQualityAssuranceSectionNavigation() {
        careersPage.scrollToAndClickSeeAllTeams();
        careersPage.scrollToAndClickQualityAssuranceSection();
        Assert.assertTrue(driver.getCurrentUrl().contains("quality-assurance"), "Failed to navigate to the Quality Assurance page!");
    }






}
