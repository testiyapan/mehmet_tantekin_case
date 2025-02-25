package pages;

import expecteds.QualityAssuranceExpected;
import interfaces.IQualityAssurancePage;
import locators.QualityAssuranceXPath;
import org.openqa.selenium.WebDriver;


public class QualityAssurancePage extends PageObject implements IQualityAssurancePage {

    public QualityAssurancePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageTitle() {
        waitUntilVisible(QualityAssuranceXPath.pageTitle);
        return driver.findElement(QualityAssuranceXPath.pageTitle).getText();
    }

    @Override
    public boolean isVisibleSeeAllQAJobsButton() {
        waitUntilVisible(QualityAssuranceXPath.seeAllQAJobsButton);
        return false;
    }

    @Override
    public boolean isPageTitleContainsExpected() {
        String pageTitle = getPageTitle();
        return pageTitle.contains(QualityAssuranceExpected.EXPECTED_TITLE);
    }

}
