package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class WebDriverConfig {

    private static WebDriver driver;

    public static WebDriver createDriver() {
        if (null == driver) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-search-engine-choice-screen");

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;


    }
}

