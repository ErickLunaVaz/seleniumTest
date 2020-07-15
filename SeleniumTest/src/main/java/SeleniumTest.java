import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Erick/seleniumBasics/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();

        WebElement accounts = driver.findElement(By.cssSelector("span[class='nav-line-2 ']"));

        accounts.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement userData = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));

//        WebElement  userData  = driver.findElement(By.id("ap_email"));

        userData.sendKeys("erickluna25@gmail.com");

        WebElement continueButton = driver.findElement(By.id("continue"));

        continueButton.click();

        WebElement pass = driver.findElement(By.id("ap_password"));

        pass.sendKeys("m2j4r1l1v3d1!");

        WebElement enterButton = driver.findElement(By.id("signInSubmit"));

        enterButton.click();

        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));

        search.sendKeys("Iphone 6");

        driver.quit();
    }
}
