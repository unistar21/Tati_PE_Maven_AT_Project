package originaltests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class London {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/");+
        driver.findElement(By.xpath("//*[text()='Accept']")).click();


        driver.findElement(By.xpath("//*[@aria-label='Dismiss sign in information.']")).click();

        WebElement searchfield=driver.findElement(By.name("ss"));
        searchfield.clear();
        searchfield.sendKeys("London");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement element = driver.findElement(By.xpath("//*[@data-testid='property-card'][10]"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor='green'", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.Color='red'", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click", element);

        File asfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(asfile, new File("pic3.png"));





        //WebElement element = driver.findElement(By.id("id_of_element"));

    }
}
