package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01 {

    public static void main(String[] args) throws InterruptedException {

        //1 - Set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the Selenium WebDriver
        WebDriver driver = new ChromeDriver();

        //this line will maximize the size
        //driver.manage().window().maximize(); //works fine both with max and windoes

        driver.manage().window().fullscreen(); // notworked with my windows

        //3- go to tesla.com
        driver.get("https://www.tesla.com");

        //stop code execution for 3 seconds
        Thread.sleep(1000);

        //use selenium to navigate back
        driver.navigate().back();

        //stop code execution for 3 seconds
        Thread.sleep(1000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //stop code execution for 3 seconds
        Thread.sleep(1000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //getting the current Title by using Selenium
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //getting the currrentURL
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //use navigate().to()
        driver.navigate().to("https://www.facebook.com");

        //get the title of the page
        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //getting the currentURL
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //this will close the currently opened window
        //driver.close();




        //this will close all of the opened windows
        //kills the the session
        //driver.quit();

        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

    }
}
