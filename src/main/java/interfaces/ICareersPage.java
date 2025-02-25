package interfaces;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface ICareersPage {
    void checkAndClickSeeAllTeamsButton();

    boolean verifyTeamSectionsPresent(List<String> expectedTeams);

    List<WebElement> getTeamElements();

    void scrollToAndClickSeeAllTeams();

    void scrollToAndClickQualityAssuranceSection();

    boolean isPageTitleContainsExpected();
}
