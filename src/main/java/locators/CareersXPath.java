package locators;

import org.openqa.selenium.By;

public class CareersXPath {
    public static final By seeAllTeamsButton = By.xpath("//a[contains(text(), 'See all teams')]");
    public static final By teamCards = By.xpath("//div[contains(@class, 'team-card')]");
    public static final By qualityAssuranceSection = By.xpath("//div[contains(@class, 'job-item')]//h3[contains(text(), 'Quality Assurance')]");


    public static final By ourLocationsTitle = By.xpath("//h3[text()='Our Locations']");
    public static final By locationItems = By.xpath("//div[@class='career-location-item']");
    public static final By findDreamJobButton = By.xpath("//a[@href='https://useinsider.com/open-positions/' and text()='Find your dream job']");
    public static final By teamTitles = By.xpath("//div[contains(@class, 'job-item')]//h3");







}
