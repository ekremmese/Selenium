package tasks.day10_Tasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_T5_ScrollPractice {

    //TC #4: Scroll practice
    //1- Open a chrome browser
    //2- Go to: https://practice.cydeo.com/
    //3- Scroll down to “Powered by CYDEO”
    //4- Scroll using Actions class “moveTo(element)” method

    @Test
    public void scroll_down_task() {
        Driver.getDriver().get("https://practice.cydeo.com/");

        //create Actions object using WebDriver
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"))).perform();

        actions.sendKeys(Keys.PAGE_UP).moveToElement(Driver.getDriver().findElement(By.xpath("//a[.='Home']"))).perform();

        //  //div[@style='text-align: center;']
    }

}
