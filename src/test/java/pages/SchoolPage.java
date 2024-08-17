package pages;

import driver.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static org.junit.Assert.assertTrue;


public class SchoolPage {

    WebDriver driver = WebDriverConfig.createDriver();

    public void getPage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.w3schools.com/java/");
        driver.findElement(By.xpath("//div[@id='accept-choices']")).click();



    }

    public void copyText() {
        WebElement nameField = driver.findElement(By.xpath("//span[text()='Tutorial']"));
        Actions make = new Actions(driver);
        make.doubleClick(nameField).keyDown(Keys.LEFT_CONTROL).sendKeys("c").keyUp(Keys.LEFT_CONTROL).build().perform();

    }





}
