package com.cydeo.tests.day3_;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T4_cssSelector_getText {

    public static void main(String[] args) {
        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");


        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password

        String expectedResetPasswordButtonText = "Reset password";
        String actualResetPasswordButtonText = driver.findElement(By.cssSelector("button[class='login-btn']")).getText();
        System.out.println(actualResetPasswordButtonText);

        if(expectedResetPasswordButtonText.equals(actualResetPasswordButtonText)){
            System.out.println("\"Reset password\" button text verification PASSED!");
        } else {
            System.out.println("\"Reset password\" button text verification FAILED!");
        }

        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from



    }
}
