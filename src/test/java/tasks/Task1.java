package tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {


    public static void main(String[] args) {
        //TC #1: Yahoo Title Verification

        //1.Open Chrome browser
            //1. Setting up the chrome
        WebDriverManager.chromedriver().setup();

            //2- Crate instance of the Selenium WebDriver
        WebDriver driver = new ChromeDriver();

        //2.Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");
            //1. maximize the screen

        driver.manage().window().maximize();

        //3.Verify title:
        //Expected: Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        //actual title we get from the browser
        String currentTitle = driver.getTitle();

        if(expectedTitle.equals(currentTitle)){
            System.out.println("TEST PASSED!");
        } else {
            System.out.println("Test failed.");
        }

    }




}
