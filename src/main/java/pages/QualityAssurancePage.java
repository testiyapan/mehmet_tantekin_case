package pages;

import expecteds.QualityAssuranceExpected;
import locators.QualityAssuranceXPath;
import org.openqa.selenium.WebDriver;


public class QualityAssurancePage extends PageObject {

    public QualityAssurancePage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle() {
        waitUntilVisible(QualityAssuranceXPath.pageTitle);
        return driver.findElement(QualityAssuranceXPath.pageTitle).getText();
    }

    public boolean isVisibleSeeAllQAJobsButton() {
        waitUntilVisible(QualityAssuranceXPath.seeAllQAJobsButton);
        return false;
    }

    public boolean isPageTitleContainsExpected() {
        String pageTitle = getPageTitle();
        return pageTitle.contains(QualityAssuranceExpected.EXPECTED_TITLE);
    }

}
