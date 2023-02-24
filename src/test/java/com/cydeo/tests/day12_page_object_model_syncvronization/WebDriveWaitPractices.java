package com.cydeo.tests.day12_page_object_model_syncvronization;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.pages.DynamicPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriveWaitPractices {

    DynamicPage dynamicPage;


    @Test
    public void dynamic_test() throws InterruptedException {

        //TC#4 : Dynamically Loaded Page Elements 7
        //1. Go to https://practice.cydeo.com/dynamic_loading/7

        dynamicPage = new DynamicPage();
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        //2. Wait until title is “Dynamic title”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

        wait.until(ExpectedConditions.titleIs("Dynamic title"));


        //3. Assert: Message “Done” is displayed.

        Assert.assertTrue(dynamicPage.doneMessage.isDisplayed());

        //4. Assert: Image is displayed.

        //Thread.sleep(5000);
        //Assert.assertTrue(dynamicPage.image.isDisplayed());

        //Note: Follow POM
    }

    @Test
    public void dynamic_loading1(){

        //TC#5 : Dynamically Loaded Page Elements 1
        //1. Go to https://practice.cydeo.com/dynamic_loading/1

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        //2. Click to start

        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();

        dynamicLoad1Page.startButton.click();

        //3. Wait until loading bar disappears

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));

        //4. Assert username inputbox is displayed

        Assert.assertTrue(dynamicLoad1Page.inputBoxUserName.isDisplayed());

        //5. Enter username: tomsmith
        dynamicLoad1Page.inputBoxUserName.sendKeys("tomsmith");

        //6. Enter password: incorrectpassword

        dynamicLoad1Page.inputBoxPassword.sendKeys("incorrectpassword");

        //7. Click to Submit button
        dynamicLoad1Page.submitButton.click();

        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamicLoad1Page.userNameInvalidAlert.isDisplayed());

        //Note: Follow POM Design Pattern

    }

}
