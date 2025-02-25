package pages;

import locators.CareersXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import expecteds.CareersExpected;
import interfaces.ICareersPage;


import java.util.List;

public class CareersPage extends PageObject implements ICareersPage {

    public CareersPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void checkAndClickSeeAllTeamsButton() {
        if (isElementExist(CareersXPath.seeAllTeamsButton)) {
            System.out.println("'See all teams' button found. Clicking...");
            clickWithJS(CareersXPath.seeAllTeamsButton);
            waitUntilVisible(CareersXPath.qualityAssuranceSection);
        } else {
            throw new RuntimeException("'See all teams' button not found.");
        }
    }

    @Override
    public boolean verifyTeamSectionsPresent(List<String> expectedTeams) {
        List<String> actualTeams = getTextList(CareersXPath.teamTitles);

        System.out.println("Teams on the page: " + actualTeams);

        for (String expectedTeam : expectedTeams) {
            if (!actualTeams.contains(expectedTeam)) {
                System.out.println("Missing team found: " + expectedTeam);
                return false;
            }
        }
        return true;
    }

    @Override
    public List<WebElement> getTeamElements() {
        List<WebElement> teamElements = driver.findElements(CareersXPath.teamTitles);

        if (teamElements.isEmpty()) {
            throw new RuntimeException("Team cards were not found.");
        }
        return teamElements;
    }

    @Override
    public void scrollToAndClickSeeAllTeams() {
        scrollUntilElementVisible(CareersXPath.seeAllTeamsButton, 10);
        clickWithJS(CareersXPath.seeAllTeamsButton);
        System.out.println("See all teams' button found.");
    }

    @Override
    public void scrollToAndClickQualityAssuranceSection() {
        scrollUntilElementVisible(CareersXPath.qualityAssuranceSection, 10);
        clickWithJS(CareersXPath.qualityAssuranceSection);
        System.out.println("Clicked on the Quality Assurance section.");
    }

    @Override
    public boolean isPageTitleContainsExpected() {
        String pageTitle = getPageTitle();
        return pageTitle.contains(CareersExpected.EXPECTED_TITLE);
    }

}
