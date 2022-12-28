package com.cydeo.tests.day3_;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {
        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");


        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        String expectedLogInButtonText = "Log In";
        String actualLogInButtonText = driver.findElement(By.cssSelector("input[type='submit']")).getAttribute("value");
        //String value = driver.findElement(By.cssSelector("input[class='login-btn']")).getAttribute("value");
        //String value1 = driver.findElement(By.cssSelector("input[value='Log In']")).getAttribute("value");

        //System.out.println(value1.equals(expectedLogInButtonText));
        //System.out.println(value.equals(expectedLogInButtonText));


        System.out.println(actualLogInButtonText);

        if(expectedLogInButtonText.equals(actualLogInButtonText)){
            System.out.println("\"Log in\" button text verification PASSED!");
        } else {
            System.out.println("\"Log in\" button text verification FAILED");
        }

        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from



        driver.quit();

    }
}
