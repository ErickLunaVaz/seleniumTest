import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.TreeMap;

public class DatePickerExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Erick/seleniumBasics/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));

        dateField.sendKeys("08/11/1982");

        Thread.sleep(1000);

        dateField.sendKeys(Keys.RETURN);

        Thread.sleep(1000);

        driver.quit();
    }
}
