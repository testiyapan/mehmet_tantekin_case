package tests.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.ConfigReader;
import utils.DriverFactory;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

public class BaseTest {
    protected static final Logger logger = LogManager.getLogger(BaseTest.class);
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser, Method method) {
        logger.info("Starting test: {}", method.getName());
        if (browser == null) {
            throw new IllegalStateException(String.format("Browser information '%s' is not defined in config.properties!", browser));
        }
        driver = DriverFactory.createInstance(browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(ConfigReader.getProperty("implicitWait"))));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(ConfigReader.getProperty("explicitWait"))));

        String testUrl = ConfigReader.getProperty(method.getName() + ".url");
        if (testUrl != null) {
            logger.info("Test URL: {}", testUrl);
            driver.get(testUrl);
        } else {
            logger.info("Using default URL.");
            driver.get(ConfigReader.getProperty("baseUrl"));
        }
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            logger.error("Test failed: {}", result.getName());
            takeScreenshot(result.getName());
        } else {
            logger.info("Test completed successfully: {}", result.getName());
        }
        if (driver != null) {
            logger.info("Closing WebDriver...");
            driver.quit();
        }
    }

    private void takeScreenshot(String testName) {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("screenshots/" + testName + ".png"));
            logger.info("Screenshot taken: {}", testName);
        } catch (IOException e) {
            logger.error("Error while taking screenshot", e);
        }
    }
}
