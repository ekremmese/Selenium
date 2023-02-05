package com.cydeo.tests.day11_driver_close_actions_jsexecutor_practices;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_circle_draq_and_drop {





    @Test
    public void drag_and_drop_test(){

        //TC #: Drag and drop
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //Locate "Accept Cookies" button and click
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        acceptCookiesButton.click();

        //2. Drag and drop the small circle to bigger circle.

        //locating small and big circles to be able to drag and drop
        WebElement draggableElement = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement targetElementForDrop =Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));

        //drag and drop options
        Actions actions = new Actions(Driver.getDriver());
        // option 1:
        //actions.dragAndDrop(draggableElement,targetElementForDrop).perform();
        //option 2:
        actions.clickAndHold(draggableElement)
                .pause(2000)
                .moveToElement(targetElementForDrop)
                .release().perform();

        //3. Assert:
        //-Text in big circle changed to: “You did great!”

        Assert.assertEquals(targetElementForDrop.getText(), "You did great!");

    }

}
