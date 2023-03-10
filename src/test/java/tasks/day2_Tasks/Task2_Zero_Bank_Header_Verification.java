package tasks.day2_Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_Zero_Bank_Header_Verification {

    public static void main(String[] args) {

        //TC #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html

        driver.get("http://zero.webappsecurity.com/login.html");


        //3. Verify header text

        WebElement header = driver.findElement(By.tagName("h3"));

        //Expected: “Log in to ZeroBank”

        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = header.getText();

        if ( expectedHeaderText.equals(actualHeaderText)){
            System.out.println("Header Verification PASSED!");
        } else {
            System.out.println("Header Verification FAILED!");
        }

        driver.close();

    }
}
