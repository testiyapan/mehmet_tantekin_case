package tests.smoke;

import expecteds.CareersExpected;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CareersPage;
import tests.base.BaseTest;

import java.util.List;

public class CareersPageSmokeTest extends BaseTest {

    private CareersPage careersPage;

    @BeforeMethod
    public void setUp() {
        careersPage = new CareersPage(driver);  // Nesneyi sadece bir kez başlatıyoruz
    }

    @Test
    public void testCareersPageLoadsSuccessfully() {
        Assert.assertTrue(careersPage.isPageTitleContainsExpected(), "'Careers' page not loaded!");
    }

    @Test
    public void testDefaultTeamsAreDisplayed() {
        List<String> expectedTeams = CareersExpected.DEFAULT_EXPECTED_TEAMS();
        boolean defaultTeamsPresent = careersPage.verifyTeamSectionsPresent(expectedTeams);
        Assert.assertTrue(defaultTeamsPresent, "Some teams are missing");
    }
}
