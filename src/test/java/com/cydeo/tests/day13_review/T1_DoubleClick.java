package com.cydeo.tests.day13_review;

import com.cydeo.pages.W3SchoolPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_DoubleClick {


    @Test
    public void t1_double_click_test(){

        //TC #1: Double Click Test
        //1. Go to
        //https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblcli
        //ck2

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        //2. Switch to iframe.

        Driver.getDriver().switchTo().frame("iframeResult");

        //3. Double click on the text “Double-click me to change my text color.”

        W3SchoolPage w3SchoolPage = new W3SchoolPage();

        Actions actions = new Actions(Driver.getDriver());

        actions.doubleClick(w3SchoolPage.doubleClickText).perform();

        //4. Assert: Text’s “style” attribute value contains “red”.

        String actualStyleAttributeValue=  w3SchoolPage.doubleClickText.getAttribute("style");

        String expectedStyleAttributeValue = "red";

        Assert.assertTrue(actualStyleAttributeValue.contains(expectedStyleAttributeValue));


        //NOTE: FOLLOW POM

    }

}
