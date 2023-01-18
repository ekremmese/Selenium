package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    /*
    This method will be login with helpdesk1 user when it is called
    helpdesk1@cypertekschool.com
     */
    public static void crm_login(WebDriver driver){


        //3. Enter valid username
        WebElement logInInputBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        logInInputBox.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password

        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordInputBox.sendKeys("UserUser");

        //5. Click to `Log In` button

        WebElement logInButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        logInButton.click();


    }

    public static void  crm_login(WebDriver driver, String userName, String password){
        //3. Enter valid username
        WebElement logInInputBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        logInInputBox.sendKeys(userName);

        //4. Enter valid password

        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordInputBox.sendKeys(password);

        //5. Click to `Log In` button

        WebElement logInButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        logInButton.click();
    }

}
