import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class WebForm {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Erick/seleniumBasics/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.manage().window().maximize();

        FormPage formPage = new FormPage();

        FormPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();

        confirmationPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));


        driver.quit();
    }

}
