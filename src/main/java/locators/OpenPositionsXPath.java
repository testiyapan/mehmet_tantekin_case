package locators;

import org.openqa.selenium.By;

public class OpenPositionsXPath {


    public static final By allOpenPositionsTitle = By.xpath("//h3[(contains(@class, 'mb') and contains(@data-animate, 'fade-in')) or normalize-space(text())='All open positions']");
    public static final By locationDropdown = By.xpath("//span[@id='select2-filter-by-location-container']");
    public static final By istanbulOption = By.xpath("//li[contains(text(),'Istanbul')]");
    public static final By clearLocationFilterButton = By.xpath("//span[@class='select2-selection__clear' and @title='Remove all items']");
    public static final By locationFilter = By.id("select2-filter-by-location-container");
    public static final By departmentFilter = By.id("select2-filter-by-department-container");
    public static final By jobList = By.xpath("//div[contains(@class, 'job-item')]");
    public static final By viewRoleButton = By.xpath("//a[contains(text(), 'View Role')]");
    public static final By locationDropdownOptions = By.xpath("//ul[@id='select2-filter-by-location-results']//li");
    public static final By departmentDropdown = By.xpath("//span[@id='select2-filter-by-department-container']");
    public static final By departmentDropdownOptions = By.xpath("//ul[@id='select2-filter-by-department-results']//li");
    public static final By POSITION_LOCATION = By.xpath("//div[@class='position-location text-large']");
    public static final By POSITION_DEPARTMENT= By.xpath("//div[@class='position-department text-large']");
    public static final By FIRST_VIEW_ROLE_BUTTON = By.xpath("//div[@id='jobs-list']/div[1]//a[contains(@class, 'btn-navy')]");
    public static final By FIRST_POSITION_CONTAINER = By.xpath("//div[@id='jobs-list']/div[1]");
    public static final By FIRST_VIEW_ROLE_BUTTON_dynamic = By.xpath("//div[@id='jobs-list']/div[contains(@class, 'position-list-item')][1]//a[contains(text(), 'View Role')]");
    public static final By departmanDropdown = By.xpath("//span[contains(@class, 'select2-selection__rendered') and normalize-space(text())='All']");

    public static final By LOCATION_FILTER = By.id("select2-filter-by-location-container");
    public static final By LOCATION_OPTION = By.xpath("//ul[contains(@id, 'select2-filter-by-location-results')]//li[contains(text(), 'Istanbul')]");
    public static final By LOCATION_LIST = By.xpath("//ul[contains(@id, 'select2-filter-by-location-results')]");

    public static final By DEPARTMENT_FILTER = By.id("select2-filter-by-department-container");
    public static final By FILTER_APPLIED_INDICATOR = By.cssSelector(".filter-applied");
    public static final By JOB_LOCATIONS = By.cssSelector(".job-location");
    public static final By JOB_DEPARTMENTS = By.cssSelector(".job-department");


}
