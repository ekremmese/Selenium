package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void registration_form_test() {
        //TC#1: Registration form confirmation
        //Note: Use JavaFaker OR read from configuration.properties file when possible.
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form

        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        Faker faker = new Faker();

        //3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());

        //4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

        //5. Enter username
        String userName = faker.bothify("helpdesk###");
        Driver.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(userName);

        //6. Enter email address

        Driver.getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys(faker.bothify(userName + "@email.com"));


        //7. Enter password
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys(faker.bothify("###???_#"));

        //8. Enter phone number
        Driver.getDriver().findElement(By.xpath("//input[@name='phone']")).sendKeys(faker.numerify("###-###-####"));

        //9. Select a gender from radio buttons
        WebElement genderRadioButtons=  Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        genderRadioButtons.click();

        //10.Enter date of birth
        WebElement inputDateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        inputDateOfBirth.sendKeys("03/12/2010");

        //11.Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));


        //12.Select Job Title
        Select jobTitleDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitleDropdown.selectByIndex(faker.number().numberBetween(1,8));

        //13.Select programming language from checkboxes
        Driver.getDriver().findElement(By.xpath("//input[@value='java']")).click();

        //14.Click to sign up button
        Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']")).click();


        //15.Verify success message “You’ve successfully completed registration.” is
        Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div/p")).isDisplayed();

        //displayed.
        //Note:
        //1. Use new Driver utility class and method
        //2. User JavaFaker when possible
        //3. User ConfigurationReader when it makes sense
    }

}
