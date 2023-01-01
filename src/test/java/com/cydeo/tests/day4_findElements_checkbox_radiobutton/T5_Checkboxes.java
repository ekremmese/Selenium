package com.cydeo.tests.day4_findElements_checkbox_radiobutton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class T5_Checkboxes {
    public static void main(String[] args) {
        //Practice: Checkboxes
        //1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/checkboxes");

        //2. Confirm checkbox #1 is NOT selected by default
        boolean firstCheckboxSelectedOrNot = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
        System.out.println("firstCheckboxSelectedOrNot = " + firstCheckboxSelectedOrNot);

        //3. Confirm checkbox #2 is SELECTED by default.
        boolean secondCheckBoxSelectedOrNot = driver.findElement(By.xpath("//input[contains(@name, 'box2')]")).isSelected();
        System.out.println("secondCheckBoxSelectedOrNot = " + secondCheckBoxSelectedOrNot);


        System.out.println("----------------------------------");

        //4. Click checkbox #1 to select it.
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();


        //5. Click checkbox #2 to deselect it.
        driver.findElement(By.xpath("//input[contains(@name, 'box2')]")).click();


        //6. Confirm checkbox #1 is SELECTED.
        firstCheckboxSelectedOrNot = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
        System.out.println("firstCheckboxSelectedOrNot = " + firstCheckboxSelectedOrNot);

        //7. Confirm checkbox #2 is NOT selected.
        secondCheckBoxSelectedOrNot = driver.findElement(By.xpath("//input[contains(@name, 'box2')]")).isSelected();
        System.out.println("secondCheckBoxSelectedOrNot = " + secondCheckBoxSelectedOrNot);

    }
}
