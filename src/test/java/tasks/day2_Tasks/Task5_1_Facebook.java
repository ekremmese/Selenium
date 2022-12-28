package tasks.day2_Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5_1_Facebook {

    public static void main(String[] args) {

        //TC #1: Facebook title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com

        driver.get("https://www.facebook.com");

        //3. Verify title:
        //Expected: “Facebook - Log In or Sign Up”

        String  expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title Verification FAILED");
        }


        driver.close();


    }
}
