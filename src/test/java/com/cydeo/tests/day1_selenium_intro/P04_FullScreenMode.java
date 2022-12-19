package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04_FullScreenMode {

    public static void main(String[] args) {

        //set up chrome and create WebDriver instance

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to google and print our the title
        driver.get("https://www.cydeo.com");
        String title = driver.getTitle();

        //driver.manage().window().maximize(); // just maximizes the page

        driver.manage().window().fullscreen(); // you can not see even task bar,

        System.out.println(title);

        //driver.quit();
    }
}
