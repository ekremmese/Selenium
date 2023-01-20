package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRMLogin extends TestBase {

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

    @Test
    public void crm_login_test2(){


        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver);

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"My tasks");

    }

    @Test
    public void crm_login_test3(){


        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver, "helpdesk1@cybertekschool.com", "UserUser");

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"My tasks");

    }


}
