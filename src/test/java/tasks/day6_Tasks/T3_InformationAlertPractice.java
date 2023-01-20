package tasks.day6_Tasks;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_InformationAlertPractice {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //TC #3: Information alert practice
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts

        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperty("URL"));
    }

    @Test
    public void information_alert_practice(){

        //3. Click to “Click for JS Prompt” button
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        //We this line we switch our drivers attention to the alert
        Alert alert = driver.switchTo().alert();

        //4. Send “hello” text to alert
        alert.sendKeys("Hello");

        //5. Click to OK button from the alert
        alert.accept();

        //6. Verify “You entered: hello” text is displayed
        driver.findElement(By.xpath("//p[.='You entered: Hello']")).isDisplayed();


    }

}




