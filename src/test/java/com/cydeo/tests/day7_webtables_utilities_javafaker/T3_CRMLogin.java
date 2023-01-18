package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRMLogin {
    WebDriver driver;
    /*
    TC #3: Login scenario
1. Create new test and make set ups
2. Go to : http://login1.nextbasecrm.com/
3. Enter valid username
4. Enter valid password
5. Click to `Log In` button
6. Verify title is as expected:
Expected: Portal
USERNAME PASSWORD
helpdesk1@cybertekschool.com UserUser
Helpdesk2@cybertekschool.com UserUser
     */

    @BeforeMethod
    public void setupMethod(){
        //TC #3: Login scenario
        //1. Create new test and make set ups
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void crm_login_test(){


        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement logInInputBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        logInInputBox.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password

        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordInputBox.sendKeys("UserUser");

        //5. Click to `Log In` button

        WebElement logInButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        logInButton.click();

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");

    }
}
