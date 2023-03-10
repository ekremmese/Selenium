package tasks.day2_Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Etsy {

    public static void main(String[] args) {


        //TC #1: Etsy Title Verification
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com

        driver.get("https://www.etsy.com");

        //3. Search for “wooden spoon”

        WebElement searchBox =  driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("wooden spoon" + Keys.ENTER);


        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”

        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if( expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED!");
        } else  {
            System.out.println("Title verification FAILED");
        }

        System.out.println(actualTitle);

        driver.close();



    }
}
