package pages;

import driver.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;


public class GooglePage {
    WebDriver driver = WebDriverConfig.createDriver();

    public void getPage() {

        driver.get("https://www.google.com/");
    }

    public void selectEngine() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//[text()='Find what you need with Google']")).click();
        driver.findElement(By.xpath("//[text()='Set as default']")).click();

    }

    public void acceptCookiesButton() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//*[text()='Accept all']")).click();

    }

    public void pasteText() {
        Actions make = new Actions(driver);
        WebElement el2 = driver.findElement(By.name("q"));
        make.click(el2).keyDown(Keys.LEFT_CONTROL).sendKeys("v").keyUp(Keys.LEFT_CONTROL).sendKeys(Keys.ENTER).build().perform();
    }

    public boolean checkTutorialResults() {

        List<WebElement> searchResults = driver.findElements(By.xpath("//em"));

        return searchResults.stream()
                .allMatch(result -> result.getText().toLowerCase().contains("tutorial"));

    }

}
