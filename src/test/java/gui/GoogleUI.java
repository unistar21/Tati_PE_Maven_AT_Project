package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleUI {

    WebDriver driver = new ChromeDriver();

    public void acceptCookies() {
         driver.findElement(By.xpath("//*[text()='Accept all']")).click();

    }

     public final WebElement acceptCookiesButton = driver.findElement(By.xpath("//*[text()='Accept all']"));
}
