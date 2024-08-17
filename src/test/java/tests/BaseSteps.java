package tests;

import driver.WebDriverConfig;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BaseSteps {

    static WebDriver driver = WebDriverConfig.createDriver();

    @BeforeClass
    public static void initDriver() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void closeDriver() {
        driver.quit();
    }
}
