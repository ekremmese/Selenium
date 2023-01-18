package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void pizzaOrders() {

        //2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”
        WebElement bobMartinNameCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        Assert.assertEquals(bobMartinNameCell.getText(), "Bob Martin");

        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021
        WebElement bobMartinOrderCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        Assert.assertEquals(bobMartinOrderCell.getText(), "12/31/2021");
    }

    @Test
    public void pizzaOrders_2() {

        String customerName = "John Doe";
        String dateOfOrder = WebTableUtils.returnOrderDate(driver, customerName);

        System.out.println("dateOfOrder = " + dateOfOrder);

    }

    @Test
    public void pizzaOrders_3() {

        String customerName = "John Doe";
        String expectedOrderDate = "01/08/2021";

        WebTableUtils.orderVerify(driver, customerName,expectedOrderDate);

    }

}
