import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingCheckBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Erick/seleniumBasics/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));

        checkBox1.click();

        Thread.sleep(1000);

        WebElement checkboxTwo = driver.findElement(By.cssSelector("input[value='checkbox-2']"));

        checkboxTwo.click();

        Thread.sleep(1000);

        WebElement checkboxThree = driver.findElement(By.cssSelector("input[value='checkbox-3']"));

        checkboxThree.click();

        Thread.sleep(1000);

        driver.quit();
    }
}
