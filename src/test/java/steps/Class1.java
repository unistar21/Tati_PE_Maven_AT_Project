package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Class1 {

    public static void main(String[] args) throws MalformedURLException {

        //WebDriver driver = new ChromeDriver();
        WebDriver driver =
                new RemoteWebDriver(new URL("http://localhost:9515"), new ChromeOptions());
        driver.get("https://selenium.dev");

    }
}
