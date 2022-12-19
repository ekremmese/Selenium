package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        //setting up the web driver manager
        WebDriverManager.chromedriver().setup();
       // System.setProperty("webdriver.chrome.driver", "C:/Users/Emre/Desktop/chromedriver.exe");

        //2 - Instance of the chrome web driver

        WebDriver driver = new ChromeDriver();

       driver.get("https://github.com/ekremmese");  // this the ver






    }
}
