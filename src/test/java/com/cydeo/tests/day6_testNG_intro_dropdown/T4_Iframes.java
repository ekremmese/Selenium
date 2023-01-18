package com.cydeo.tests.day6_testNG_intro_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframes {
    public WebDriver driver;
    @BeforeMethod
    public void setupMethod (){
        //TC #4: Iframe practice
        //1. Create a new class called: T4_Iframes
        //2. Create new test and make set ups
        //3. Go to: https://practice.cydeo.com/iframe
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");

    }

    @Ignore
    @Test
    public void T4_IframePractice(){

        //we need to switch driver's focus to iframe
        WebElement iframe = driver.findElement(By.xpath("//iframe"));
        //option #1 using index number
        //driver.switchTo().frame(0);

        //option #2 locate as web element and pass in frame() method
        driver.switchTo().frame(iframe);

        //option #3 passing id attribute value
        //driver.switchTo().frame("mce_0_ifr");

        //Locate the p tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        //4. Assert: “Your content goes here.” Text is displayed.
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
        //To be able to verify the header, we must switch to "main HTML"

        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerText.isDisplayed());

    }
}
