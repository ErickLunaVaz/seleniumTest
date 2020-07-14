import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.windows.ThemeReader;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Erick/seleniumBasics/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));

        newTabButton.click();

        String originalHandle = driver.getWindowHandle();

        for(String handle1 : driver.getWindowHandles()){
            driver.switchTo().window(handle1);
            Thread.sleep(2000);
        }

        driver.switchTo().window(originalHandle);



        driver.quit();
    }
}
