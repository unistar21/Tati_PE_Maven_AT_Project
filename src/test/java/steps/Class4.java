package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Class4 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/");
        driver.findElement(By.xpath("//*[text()='Accept']")).click();


        WebElement searchfield=driver.findElement(By.name("ss"));
        searchfield.clear();
        searchfield.sendKeys("Paris");

        driver.findElement(By.xpath("//*[@aria-label='Dismiss sign in information.']")).click();




        driver.findElement(By.xpath("//button[@data-testid='occupancy-config']//span[@data-testid='searchbox-form-button-icon']")).click();
        driver.findElement(By.xpath("//input[@id='group_adults']/..//button[2]")).click();
        driver.findElement(By.xpath("//input[@id='group_adults']/..//button[2]")).click();

        driver.findElement(By.xpath("//input[@id='no_rooms']/..//button[2]")).click();

        driver.findElement(By.xpath("//button[@type='submit']")).click();


        driver.findElement(By.xpath("//div[@data-filters-item='class:class=5']/label/span[1]")).click();


    }
}
