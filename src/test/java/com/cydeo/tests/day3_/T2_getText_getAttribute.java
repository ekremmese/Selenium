package com.cydeo.tests.day3_;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T2_getText_getAttribute {
    public static void main(String[] args) {
        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer

        String actualText = driver.findElement(By.className("login-item-checkbox-label")).getText();
        String expectedText = "Remember me on this computer";

        if(actualText.equals(expectedText)){
            System.out.println("Label text verification is PASSED!");
        } else {
            System.out.println("Label text verification is FAILED!");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?

        actualText = driver.findElement(By.className("login-link-forgot-pass")).getText();
        expectedText = "Forgot your password?";

        if(actualText.equalsIgnoreCase(expectedText)){
            System.out.println("Link text verification is PASSED!");
        } else {
            System.out.println("Link text verification is FAILED!");
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes

        actualText = driver.findElement(By.className("login-link-forgot-pass")).getAttribute("href");
        expectedText = "forgot_password=yes";

        if(actualText.contains(expectedText)){
            System.out.println("Attribute text verification is PASSED!");
        } else {
            System.out.println("Attribute text verification is FAILED!");
        }

        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
    }
}
