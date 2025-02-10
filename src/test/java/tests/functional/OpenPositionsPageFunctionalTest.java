package tests.functional;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.OpenPositionsPage;
import tests.base.BaseTest;

import java.util.List;

public class OpenPositionsPageFunctionalTest extends BaseTest {

    private OpenPositionsPage openPositionsPage;

    @BeforeMethod
    public void setUpPage() {
        Assert.assertNotNull(driver, "Driver is null, the test cannot be started!");
        openPositionsPage = new OpenPositionsPage(driver);
    }

    @Test(priority = 1, enabled = true)
    public void testPositionLocationDisplayed() {
        openPositionsPage.selectLocation("Istanbul");
        String positionLocation = openPositionsPage.getPositionLocationElement().getText();
        System.out.println("Position Location: " + positionLocation);

        // Beklenen bir değerle karşılaştırma yapılabilir
        Assert.assertTrue(positionLocation.contains("Istanbul"), "Position location does not contain 'Istanbul'!");
    }





    @Test(priority = 3)
    public void testFilterByLocation() {
        openPositionsPage.selectLocation("Istanbul, Turkiye");
        List<String> jobLocations = openPositionsPage.getAllJobLocations();

        for (String location : jobLocations) {
            Assert.assertEquals(location, "Istanbul, Turkiye", "Listed job is not in Istanbul, Turkiye!");
        }
    }

    @Test(priority = 4, enabled = false)
    public void testFilterByDepartment() {
        openPositionsPage.selectDepartment("Quality Assurance");
        List<String> jobDepartments = openPositionsPage.getAllJobDepartments();

        for (String department : jobDepartments) {
            Assert.assertEquals(department, "Quality Assurance", "Listed job is not in Quality Assurance department!");
        }
    }



    @Test(priority = 5, enabled = false)
    public void testFirstViewRoleButtonOpensCorrectPage() {
        openPositionsPage.clickFirstViewRoleButton();
        String expectedUrlPart = "jobs.lever.co/useinsider";
        openPositionsPage.switchToNewTabAndVerifyUrlContains(expectedUrlPart);
        System.out.println("View Role page opened");


    }




}
