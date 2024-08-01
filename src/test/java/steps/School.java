package steps;

import gui.GoogleUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static org.junit.Assert.*;

import java.time.Duration;
import java.util.List;

public class School {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/java/");
        driver.findElement(By.xpath("//div[@id='accept-choices']")).click();


        WebElement nameField = driver.findElement(By.xpath("//span[text()='Tutorial']"));

        Actions make = new Actions(driver);

        make.doubleClick(nameField).keyDown(Keys.LEFT_CONTROL).sendKeys("c").keyUp(Keys.LEFT_CONTROL).build().perform();



        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//*[text()='Accept all']")).click();


        WebElement el2 = driver.findElement(By.name("q"));
        make.click(el2).keyDown(Keys.LEFT_CONTROL).sendKeys("v").keyUp(Keys.LEFT_CONTROL).sendKeys(Keys.ENTER).build().perform();

        List<WebElement> searchResults = driver.findElements(By.xpath("//em"));

        for (WebElement result : searchResults) {
            assertTrue("The search result does not contain the word 'Tutorials'.",
                    result.getText().toLowerCase().contains("tutorial"));


        }
    }
    }
