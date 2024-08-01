package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDateTime;

public class Class3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[text()='Accept all']")).click();
        driver.findElement(By.name("q")).sendKeys("погода минск");
        driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();

        LocalDateTime ldt = LocalDateTime.now().plusDays(1);
        String day = String.valueOf(ldt.getDayOfWeek()).toLowerCase();
        String fDay = day.substring(0, 1).toUpperCase() + day.substring(1);
        System.out.println(fDay);

        driver.findElement(By.xpath("//*[@aria-label='" + fDay + "']")).click();
        //System.out.println(driver.findElement(By.xpath("//*[@aria-label='24°Celsius '" + fDay + "' 12:00']")).getAttribute("aria-label"));


        //driver.navigate().to("https://ya.ru/");
        //driver.navigate().back();
        //driver.navigate().refresh();
    }
}
