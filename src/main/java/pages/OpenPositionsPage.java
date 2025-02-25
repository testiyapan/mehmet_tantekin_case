package pages;

import expecteds.OpenPositionExpected;
import interfaces.IOpenPositionsPage;
import locators.OpenPositionsXPath;
import org.openqa.selenium.*;

import java.util.List;

public class OpenPositionsPage extends PageObject implements IOpenPositionsPage {

    public OpenPositionsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean areFiltersApplied() {
        return isElementExist(OpenPositionsXPath.locationFilter) && isElementExist(OpenPositionsXPath.departmentFilter);
    }

    @Override
    public boolean areJobsDisplayed() {
        return !driver.findElements(OpenPositionsXPath.jobList).isEmpty();
    }

    @Override
    public void selectLocation(String location) {
        clickElementByXpath(OpenPositionsXPath.LOCATION_FILTER);
        WebElement locationOption = driver.findElement(OpenPositionsXPath.LOCATION_OPTION);
        locationOption.click();
        waitUntilVisible(OpenPositionsXPath.FILTER_APPLIED_INDICATOR, 10);
    }

    @Override
    public List<String> getAllJobLocations() {
        return getTextList(OpenPositionsXPath.JOB_LOCATIONS);
    }

    @Override
    public void selectDepartment(String department) {
        clickElementByXpath(OpenPositionsXPath.DEPARTMENT_FILTER);
        WebElement departmentOption = driver.findElement(By.xpath("//li[text()='" + department + "']"));
        departmentOption.click();
        waitUntilVisible(OpenPositionsXPath.FILTER_APPLIED_INDICATOR, 10);
    }

    @Override
    public List<String> getAllJobDepartments() {
        return getTextList(OpenPositionsXPath.JOB_DEPARTMENTS);
    }

    @Override
    public boolean isPageTitleContainsExpected() {
        String pageTitle = getPageTitle();
        return pageTitle.contains(OpenPositionExpected.EXPECTED_TITLE);
    }

    @Override
    public WebElement getPositionLocationElement() {
        scrollUntilElementVisible(OpenPositionsXPath.POSITION_LOCATION, 10);
        if (isElementVisible(OpenPositionsXPath.POSITION_LOCATION)) {
            return driver.findElement(OpenPositionsXPath.POSITION_LOCATION);
        } else {
            throw new RuntimeException("Position location element not found!");
        }
    }

    @Override
    public void clickFirstViewRoleButton() {
        By containerLocator = OpenPositionsXPath.FIRST_POSITION_CONTAINER;
        By viewRoleButtonLocator = OpenPositionsXPath.FIRST_VIEW_ROLE_BUTTON;

        try {
            WebElement containerElement = waitUntilVisible(containerLocator, 10);
            scrollToElement(containerElement);
            WebElement viewRoleButton = driver.findElement(viewRoleButtonLocator);

            if (!viewRoleButton.isDisplayed()) {
                System.out.println("View Role button is not visible, scrolling again...");
                scrollToElement(viewRoleButton);
            }

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", viewRoleButton);

        } catch (TimeoutException e) {
            System.out.println("TimeoutException: View Role button not found. " + e.getMessage());
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Hata: View Role button not clicked. " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public void switchToNewTabAndVerifyUrlContains(String expectedUrlPart) {
        switchToNewTab();
        waitForUrlToContain(expectedUrlPart, 10);
    }


}
