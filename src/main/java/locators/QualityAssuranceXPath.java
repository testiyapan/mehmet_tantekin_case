package locators;

import org.openqa.selenium.By;

public class QualityAssuranceXPath {
    public static final By pageTitle = By.tagName("h1");
    public static final By seeAllQAJobsButton = By.xpath("//a[contains(@href, '/careers/open-positions/?department=qualityassurance') and contains(text(),'See all QA jobs')]");
    public static final By qualityAssuranceTitle = By.xpath("//h1[@class='big-EXPECTED_TITLE big-EXPECTED_TITLE-media mt-4 mt-lg-0' and text()='Quality Assurance']");
    public static final By qualityAssuranceParagraph = By.xpath("//p[contains(@class, 'text-medium')]");


}
