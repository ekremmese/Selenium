package tasks.day6_Tasks;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_Confirmation_Alert_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC #2: Confirmation alert practice
        //1. Open browser
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void confirmation_alert_practice(){
        driver.get(ConfigurationReader.getProperty("URL"));
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        Alert alert = driver.switchTo().alert();

        alert.accept();

        driver.findElement(By.xpath("//p[@id='result']")).isDisplayed();

    }

    //2. Go to website: http://practice.cydeo.com/javascript_alerts
    //3. Click to “Click for JS Confirm” button
    //4. Click to OK button from the alert
    //5. Verify “You clicked: Ok” text is displayed.


}
