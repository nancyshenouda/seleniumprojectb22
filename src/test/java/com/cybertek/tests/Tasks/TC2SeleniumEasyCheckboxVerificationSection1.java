package com.cybertek.tests.Tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2SeleniumEasyCheckboxVerificationSection1 {
    public static void main(String[] args) {

//      1.Open Chrome browser
//      2.Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();

//      3.Verify “Success –Check box is checked” message is NOTdisplayed.

        WebElement successMessage = driver.findElement(By.xpath("//div[.='Success - Check box is checked']"));

        if(!successMessage.isDisplayed()){
            System.out.println("Success –Check box is checked is Not Displayed. Verification Passed");
        }else{
            System.out.println("Success –Check box is checked is Displayed. Verification FAILED");
        }


//      4.Click to checkbox under “Single Checkbox Demo” section

        WebElement checkBoxDemo = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        checkBoxDemo.click();
//      5. Verify “Success –Check box is checked” message isdisplayed.
        if(successMessage.isDisplayed()){
            System.out.println("Success –Check box is checked is Displayed. Verification Passed");
        }else{
            System.out.println("Success –Check box is checked is Not Displayed. Verification FAILED");
        }

  }
}
