package tests.school;

import driver.WebDriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SchoolCuc {

    WebDriver driver = WebDriverConfig.createDriver();

    @Given("Open a site")
    public void getPage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.w3schools.com/java/");
        driver.findElement(By.xpath("//div[@id='accept-choices']")).click();

    }


    @When("I copy Tutorial")
    public void copyText() {
        WebElement nameField = driver.findElement(By.xpath("//span[text()='Tutorial']"));
        Actions make = new Actions(driver);
        make.doubleClick(nameField).keyDown(Keys.LEFT_CONTROL).sendKeys("c").keyUp(Keys.LEFT_CONTROL).build().perform();

    }


    @Then("I see Tutorial results when paste it to Google")
    public void getGooglePage() {
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//*[text()='Accept all']")).click();
    }

    public void pasteText() {
        Actions make = new Actions(driver);
        WebElement el2 = driver.findElement(By.name("q"));
        make.click(el2).keyDown(Keys.LEFT_CONTROL).sendKeys("v").keyUp(Keys.LEFT_CONTROL).sendKeys(Keys.ENTER).build().perform();
    }

    public void checkResults() {

        List<WebElement> searchResults = driver.findElements(By.xpath("//em"));

        for (WebElement result : searchResults) {
            assertTrue("The search result does not contain the word 'Tutorials'.",
                    result.getText().toLowerCase().contains("tutorial"));


        }
    }

}


