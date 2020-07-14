import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrooling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Erick/seleniumBasics/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/scroll");

        WebElement fullName = driver.findElement(By.id("name"));

        Actions actions = new Actions(driver);

        actions.moveToElement(fullName);

        fullName.sendKeys("Alejandro Erick Luna Vazquez");

        WebElement date = driver.findElement(By.id("date"));

        date.sendKeys("08/08/1988");

        Thread.sleep(1000);

        driver.quit();

    }
}
