package com.cydeo.tests.day13_review;

import com.cydeo.pages.DynamicControls;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2_ExplicitlyWaitPractice {

    DynamicControls dynamicControls;

    @BeforeMethod
    public void setup_method(){

        //TC #2: Explicit wait practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControls = new DynamicControls();
    }


    @Test(priority = 0)
    public void explicitly_wait_practice() throws InterruptedException {


        //3- Click to “Remove” button



        dynamicControls.removeButton.click();

        //4- Wait until “loading bar disappears”

       //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        // WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        //wait.until(ExpectedConditions.invisibilityOf(dynamicControls.loadingBar));

        BrowserUtils.waitForInvisibilityOf(dynamicControls.loadingBar);

        //5- Verify:
        //a. Checkbox is not displayed

        try{

            //the web element is deleted from the page after we click to remove button, thats why we used try&catch block here
            Assert.assertFalse(dynamicControls.checkBox.isDisplayed());

        } catch (NoSuchElementException n) {
            Assert.assertTrue(true);
        }

        //b. “It’s gone!” message is displayed.

        Assert.assertTrue(dynamicControls.goneMessage.isDisplayed());
        Assert.assertTrue(dynamicControls.goneMessage.getText().equals("It's gone!"));
        //NOTE: FOLLOW POM

    }

    @Test (priority = 1)
    public void enable_button_test(){

        //3- Click to “Enable” button

        dynamicControls.enableButton.click();

        //4- Wait until “loading bar disappears”
        BrowserUtils.waitForInvisibilityOf(dynamicControls.loadingBar);

        //5- Verify:
        //a. Input box is enabled.

        Assert.assertTrue(dynamicControls.inputBox.isEnabled());

        //b. “It’s enabled!” message is displayed.
        Assert.assertTrue(dynamicControls.goneMessage.isDisplayed());
        Assert.assertTrue(dynamicControls.goneMessage.getText().equals("It's enabled!"));

        //NOTE: FOLLOW POM
    }

}
