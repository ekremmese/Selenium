package tasks.day10_Tasks;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_T5_ScrollPractice {

    //TC #4: Scroll practice
    //1- Open a Chrome browser
    //2- Go to: https://practice.cydeo.com/
    //3- Scroll down to “Powered by CYDEO”
    //4- Scroll using Actions class “moveTo(element)” method

    @Test
    public void scroll_down_task() {
        Driver.getDriver().get("https://practice.cydeo.com/");

        //create Actions object using WebDriver
        Actions actions = new Actions(Driver.getDriver());

        //BrowserUtils.sleep(3);
        WebElement cydeoButton = Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"));
        actions.moveToElement(cydeoButton).perform();
        //actions.moveToElement(Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"))).perform();


        BrowserUtils.sleep(3);
        actions.sendKeys(Keys.PAGE_UP).moveToElement(Driver.getDriver().findElement(By.xpath("//a[.='Home']"))).perform();

        //Driver.getDriver().quit();
        Driver.closeDriver();

    }

    @Test
    public void test2(){
        Driver.getDriver().get("https://google.com/");
        Driver.closeDriver();
    }


}
