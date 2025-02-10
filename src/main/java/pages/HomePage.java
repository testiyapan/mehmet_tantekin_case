package pages;

import locators.HomeXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class HomePage extends PageObject {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isHomePageOpened() {
        return getPageTitle().contains("Insider");
    }

    public String getHomePageTitle() {
        return getPageTitle();
    }

    public boolean isNavigationMenuDisplayed() {
        return isElementVisible(HomeXPath.navigationMenu);
    }

    public void clickLoginButton() {
        waitAndClick(HomeXPath.loginButton);
    }

    public void clickLoginButtonAndSwitchToNewTab() {
        clickElementByXpath(HomeXPath.loginButton);
        switchToNewTab();
        waitForUrlToContain("https://inone.useinsider.com/login", 10);
    }

    public void navigateToCareers() {
        clickElementByXpath(HomeXPath.companyMenu);
        waitUntilVisible(HomeXPath.dropdownMenuOptions);

        List<WebElement> menuOptions = getElements(HomeXPath.dropdownMenuOptions);
        boolean isCareerOptionFound = false;

        for (WebElement option : menuOptions) {
            if (option.getText().equalsIgnoreCase("Careers")) {
                if (!isElementVisible(HomeXPath.dropdownMenuOptions)) {
                    scrollToElement(option);
                }
                option.click();
                isCareerOptionFound = true;
                break;
            }
        }

        if (!isCareerOptionFound) {
            throw new RuntimeException("'Careers' option not found!");
        }
        System.out.println("Successfully clicked on the 'Careers' menu.");
    }


}
