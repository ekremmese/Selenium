package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_GettingPageTitle {
    public static void main(String[] args) {

        //set up chrome drover and create instance

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to google
        driver.get("https://www.cydeo.com");



        //get the title and assign to a browser
        String title = driver.getTitle();
        System.out.println("Title of the page: "+title);

        if( title.equals("Cydeo")){
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }

        driver.quit();



    }
}
