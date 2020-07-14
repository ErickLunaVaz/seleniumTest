import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingRadioButtons {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Erick/seleniumBasics/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement firstRadioButton = driver.findElement(By.id("radio-button-1"));

        firstRadioButton.click();

        Thread.sleep(1000);

        WebElement secondRadioButton = driver.findElement(By.cssSelector("input[value='option2']"));

        secondRadioButton.click();

        Thread.sleep(1000);

        WebElement thirdRadioButton = driver.findElement(By.xpath("/html/body/div/div[3]/label"));

        thirdRadioButton.click();

        Thread.sleep(1000);

        driver.quit();
    }
}
