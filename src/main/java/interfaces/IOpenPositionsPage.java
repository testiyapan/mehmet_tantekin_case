package interfaces;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface IOpenPositionsPage {
    boolean areFiltersApplied();

    boolean areJobsDisplayed();

    void selectLocation(String location);

    List<String> getAllJobLocations();

    void selectDepartment(String department);

    List<String> getAllJobDepartments();

    boolean isPageTitleContainsExpected();

    WebElement getPositionLocationElement();

    void clickFirstViewRoleButton();

    void switchToNewTabAndVerifyUrlContains(String expectedUrlPart);
}
