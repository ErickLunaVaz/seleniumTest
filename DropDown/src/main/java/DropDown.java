import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Erick/seleniumBasics/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        driver.manage().window().maximize();

        WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"));

        dropDown.click();

        Thread.sleep(1000);

        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));

        autocompleteItem.click();

        Thread.sleep(1000);

        driver.quit();
    }
}
