import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Erick/seleniumBasics/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.icicibank.com/");

        WebElement popup = driver.findElement(By.id("push-modal-close"));


        popup.click();


        WebElement login = driver.findElement(By.className("pl-login-ornage-box"));

        WebElement user = driver.findElement(By.name("DUMMY1"));

        user.sendKeys("wrongUser");

        login.click();

        driver.quit();




    }

}
