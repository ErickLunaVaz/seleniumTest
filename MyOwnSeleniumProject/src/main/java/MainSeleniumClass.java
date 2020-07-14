import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSeleniumClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Erick/seleniumBasics/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://mvnrepository.com/");

        WebElement element = driver.findElement(By.id("query"));

        element.click();

        element.sendKeys("selenium");

        driver.quit();
    }
}
