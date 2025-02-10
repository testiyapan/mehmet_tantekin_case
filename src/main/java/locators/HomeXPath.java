package locators;

import org.openqa.selenium.By;

public class HomeXPath {
    public static final By companyMenu = By.xpath("//li[@class='nav-item dropdown']//a[contains(text(), 'Company')]");
    public static final By dropdownMenuOptions = By.xpath("//div[contains(@class, 'dropdown-menu')]//a[contains(text(), 'Careers')]");
    public static final By demoButton  = By.xpath("//a[text()='Get a Demo']");
    public static final By loginButton = By.xpath("//a[text()='Login']");
    public static final By platformTourButton =By.xpath("//a[text()='Platform Tour']");
    public static final By languageDropdown =By.xpath("//button[contains(@class, 'dropdown-toggle')]");
    public static final By aboutUsLink =By.xpath("//a[text()='About Us']");
    public static final By careersLink =By.xpath("//a[text()='Careers']");
    public static final By contactUsLink = By.xpath("//a[text()='Contact Us']");
    public static final By whyInsiderMenu = By.xpath("//ul[@class='navbar-nav']//a[text()='Why Insider']");
    public static final By insiderDifference = By.xpath("//ul[@class='navbar-nav']//a[contains(@href, 'why-insider')]");
    public static final By platformMenu = By.xpath("//ul[@class='navbar-nav']//a[text()='Platform']");
    public static final By customerDataManagement = By.xpath("//ul[@class='navbar-nav']//a[contains(@href, 'customer-data-management')]");
    public static final By solutionsMenu = By.xpath("//ul[@class='navbar-nav']//a[text()='Solutions']");
    public static final By optimizeCustomerAcquisition = By.xpath("//ul[@class='navbar-nav']//a[contains(@href, 'onboarding')]");
    public static final By resourcesMenu = By.xpath("//ul[@class='navbar-nav']//a[text()='Resources']");
    public static final By caseStudies = By.xpath("//ul[@class='navbar-nav']//a[contains(@href, 'case-studies')]");
    public static final By aboutUs = By.xpath("//ul[@class='navbar-nav']//a[contains(@href, 'about-us')]");
    public static final By navigationMenu = By.xpath("//div[@class='collapse navbar-collapse']");














}
