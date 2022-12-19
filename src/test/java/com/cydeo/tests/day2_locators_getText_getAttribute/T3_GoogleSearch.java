package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) {

        //TC#3: Google search
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://www.google.com");

        //3- Write “apple” in search box
        //4- PRESS ENTER using Keys.ENTER
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);
        //googleSearchBox.sendKeys("apple");

        //click Google Search Button - I tried to solve it with clicking on Google'da Ata but failed
        //WebElement searchButton = driver.findElement(By.className("gNO89b"));
        //searchButton.click();


        //5- Verify title:
        //Expected: Title should start with “apple” word
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        //verification with if statement
        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification passed!");
        } else {
            System.out.println("Title verification failed!");

        }

    }
}

