package com.cydeo.tests.day4_findElements_checkbox_radiobutton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_XpathAndCssSelectorPractice {

    public static void main(String[] args) {

        //XPATH and CSS Selector PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        //Locate home button using cssSelector, class value
        WebElement homeButton = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //Locate home button using cssSelector, href value
        WebElement homeButton2 = driver.findElement(By.cssSelector("a[href='/']"));

        ////Locate home button using cssSelector, class value with syntax2
        WebElement homeButton3 = driver.findElement(By.cssSelector("a.nav-link"));


        //b. “Forgot password” header

        //Locate header using cssSelector: locate parent element abd move down to h2
        WebElement forgetPasswordHeader3 = driver.findElement(By.cssSelector("div[id='content']>div>h2"));


        //locating forget password header with xpath 3rf syntax => //tagname[.='text']
        WebElement forgetPasswordHeader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        //locating forget password header with xpath 3rf syntax => //tagname[text()='text']
        WebElement forgetPasswordHeader2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //c. “E-mail” text

        //locatibg by cssSelector : syntax :  tagname[attribute='value']
        WebElement emailText1 = driver.findElement(By.cssSelector("label[for='email']"));

        //locating by xpath :syntax : //tagName[@attribute='value']
        WebElement emailText2 = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box

        //locating by xpath :syntax : //tagName[@attribute='value']
        WebElement emailInputBox = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement emailInputBox2 = driver.findElement(By.xpath("//input[@type='text']"));

        //locating by xpath syntax : //tagname[contains(@attribute, 'value')]
        WebElement emailInputBox3 = driver.findElement(By.xpath("//input[contains(@pattern, '[a-z0-9._')]"));
        WebElement emailInputBox4 = driver.findElement(By.xpath("//input[contains(@name, 'ail')]"));  //full value was 'email', I used 'ail' part of the full value

        //  //tagName[contains(@attribute, 'value')]


        //e. “Retrieve password” button
        //locating with xpath, syntax:  //tagName[@attribute='value']
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[ @id='form_submit']"));

        //locationg with xpath, syntax : //tagName[containts(@attribute, 'value')]
        WebElement retrievePasswordButton2 = driver.findElement(By.xpath("//i[contains(@class, 'on-2x i')]"));

        //locatins with xpath by text, syntax : //tagName[text()='text']
        WebElement retrievePasswordButton3 = driver.findElement(By.xpath("//i[.='Retrieve password']"));

        //locating with cssSelector : syntax : tagname[attribute='value']
        WebElement retrievePasswordButton4 = driver.findElement(By.cssSelector("button[class='radius']"));


        //f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[contains(@style, 'text')]"));




        //4. Verify all web elements are displayed.
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible


    }
}
