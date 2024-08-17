package pages;

import driver.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookingPage {

    WebDriver driver = WebDriverConfig.createDriver();

    public void getPage() {

        driver.get("https://www.booking.com/");
        driver.findElement(By.xpath("//*[text()='Accept']")).click();

        WebElement closePopup = driver.findElement(By.xpath("//*[@aria-label='Dismiss sign in information.']"));
        if (closePopup.isDisplayed()) {
            closePopup.click();
        }
    }

    public void typeSearchParis() {
        WebElement searchfield = driver.findElement(By.name("ss"));
        searchfield.clear();
        searchfield.sendKeys("Paris");
    }

    public void openAdultsDropdown() {
        driver.findElement(By.xpath("//button[@data-testid='occupancy-config']//span[@data-testid='searchbox-form-button-icon']")).click();
    }

    public void plusAdult() {
        driver.findElement(By.xpath("//input[@id='group_adults']/..//button[2]")).click();
    }

    public void plusRoom() {
        driver.findElement(By.xpath("//input[@id='no_rooms']/..//button[2]")).click();
    }

    public void clickSubmitButton() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public void selectFilters() {
        driver.findElement(By.xpath("//div[@data-filters-item='class:class=5']/label/span[1]")).click();
    }

    public void selectTypeCheckbox(String propertyType) {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebElement propertyTypeHotelsCheckbox = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By
                        .xpath(String.format("//div[@id='popular-filters-go-here']//preceding-sibling::div[@data-testid='filters-sidebar']//div[@data-filters-group='ht_id']//div[text()='%s']", propertyType))));
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        actions.moveToElement(propertyTypeHotelsCheckbox).perform();
        propertyTypeHotelsCheckbox.click();


    }

    public void selecRatingCheckbox(String propertyRateInStars) {
        driver.findElement(By.xpath(String.format("//div[@id='popular-filters-go-here']//preceding-sibling::div[@data-testid='filters-sidebar']//div[@data-filters-group='class']//div[text()='%s']", propertyRateInStars))).click();


    }

    public void explicitWaitOfDisplayedLabelOfRate(int propertyRate) {

        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//label[@data-testid='filter:class=%s']", propertyRate))));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }

    public void clickToDropdownSortingList() {
        driver.findElement(By.xpath("//button[@data-testid='sorters-dropdown-trigger']")).click();


    }

    public void clickToPropertyRatingLowToHighOptionOfDropdownSortingList() {
        driver.findElement(By.xpath("//div/span[text()='Property rating (low to high)']")).click();


    }

    public String getRate(int propertyCardOrderNumber) {

        return driver.findElement(By.xpath(String.format("//div[@data-testid='property-card'][%s]//div[@aria-label]", propertyCardOrderNumber))).getAttribute("aria-label");
    }


}
