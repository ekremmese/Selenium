package com.cydeo.tests.day12_page_object_model_syncvronization;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setupMethod(){

        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");

        libraryLoginPage = new LibraryLoginPage();

    }

    @Test
    public void required_field_error_message_test(){
        //TC #1: Required field error message test
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com



        //3- Do not enter any information
        //4- Click to “Sign in” button



        libraryLoginPage.signInButton.click();

        //5- Verify expected error is displayed:
        //Expected: This field is required.

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());
        //NOTE: FOLLOW POM DESIGN PATTERN

        Driver.closeDriver();
    }

    @Test
    public void invalid_email_format_error_message_text(){

        //C #2: Invalid email format error message test
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com



        //3- Enter invalid email format


        libraryLoginPage.inputUserName.sendKeys("abcdeg");

        libraryLoginPage.signInButton.click();

        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.

        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

        //NOTE: FOLLOW POM DESIGN PATTERN

        Driver.closeDriver();

    }

    @Test
    public void negative_login(){
        //TC #3: Library negative login
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com


        //3- Enter incorrect username or incorrect password



        libraryLoginPage.inputUserName.sendKeys("abc@gmail.com");
        //libraryLoginPage.inputPassword.sendKeys("abcdef");
        libraryLoginPage.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password

        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());

        //NOTE: FOLLOW POM DESIGN PATTERN

        Driver.closeDriver();


    }


}
