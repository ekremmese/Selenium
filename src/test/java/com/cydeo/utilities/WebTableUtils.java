package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {


    //Method #1 info:
    //• Name: returnOrderDate ()
    //• Return type: String
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //This method should accept a costumerName and return the costumer order date //as a String
    //as a String
    /*
    //    This method  accepts a costumerName and return the costumer order date
     */

    public static String returnOrderDate(WebDriver driver, String costumerName) {

/*
        WebElement givenCustomerNameCell = new RemoteWebElement();

        List<WebElement> webElementsOfAllCells = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tbody//tr//td"));

        String dateOrderOfGivenName = "";

        for (WebElement each : webElementsOfAllCells) {
            if ( each.getText().equals(costumerName) ){

                dateOrderOfGivenName = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tbody//tr//td/following-sibling::td[4]")).getText();
                break;
            }
        }



       return dateOrderOfGivenName;

 */

        String locator = "//table[@id='ctl00_MainContent_orderGrid']//td[.='" + costumerName + "']/following-sibling::td[3]";

        WebElement customerDataCell = driver.findElement(By.xpath(locator));


        return customerDataCell.getText();


    }

    //Method #2 info:
    //• Name: orderVerify ()
    //• Return type: void
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //• Arg3: String expectedOrderDate
    //This method should accept above mentioned arguments and internally assert
    //expectedOrderDate matching actualOrderDate.

    public static void orderVerify(WebDriver driver, String costumerName, String expectedOrderDate){

        String locator = "//table[@id='ctl00_MainContent_orderGrid']//td[.='" + costumerName + "']/following-sibling::td[3]";

        WebElement costumerDataCell = driver.findElement(By.xpath(locator));

        Assert.assertEquals(costumerDataCell.getText(), expectedOrderDate);


    }



}
