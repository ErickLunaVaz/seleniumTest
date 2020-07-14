import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class ImplicitWait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Erick/seleniumBasics/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        driver.manage().window().maximize();

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));

        autocomplete.sendKeys("1131W 12th Street Tempe, Arizona");

//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); implementing implicit wait
//        implicit wait

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

assertEquals("hola","adios");

@Before
        @After
        @Test


//        explicit wait
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("class-name")));




//        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));

//        creating expected condition using explicit wait to get the web element
//        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));


//        autocompleteResult.click();


        driver.quit();
    }
}
