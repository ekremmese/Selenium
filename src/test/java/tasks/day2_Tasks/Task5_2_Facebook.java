package tasks.day2_Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5_2_Facebook {

    public static void main(String[] args) {
        //
        //TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com

        driver.get("https://www.facebook.com");

        //3. Enter incorrect username

        WebElement emailInputBox = driver.findElement(By.id("email"));
        emailInputBox.sendKeys("abc@gmail.com");


        //4. Enter incorrect password
        WebElement passwordInputBox = driver.findElement(By.id("pass"));
        passwordInputBox.sendKeys("abcsdsf" + Keys.ENTER);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //5. Verify title changed to:
        //Expected: “Log into Facebook”

        String expectedTitle = "Log in to Facebook";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title Verification  FAILED");
        }

        System.out.println(actualTitle);
        System.out.println(expectedTitle);

        driver.close();

        //• Create new class for each task.
        //• There are some tips in the 2nd page for whoever needs it.
        //• Please try to solve yourself first before moving to the tips
    }



}
