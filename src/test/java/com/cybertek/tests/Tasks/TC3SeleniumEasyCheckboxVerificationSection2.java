package com.cybertek.tests.Tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC3SeleniumEasyCheckboxVerificationSection2 {
    public static void main(String[] args) {

//        1.Open Chrome browser
//        2.Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
//         3.Verify “Check All” button text is “Check All”
        WebElement checkAll= driver.findElement(By.xpath("//input[@type='button']"));
        String checkAllText = checkAll.getAttribute("value");
        String expectedText = "Check All";

        if(checkAllText.equals(expectedText)){
            System.out.println("Check all text verification Passed");
        }else{
            System.out.println("Check all text verification Failed");
        }

        // 4.Click to “Check All” button
        checkAll.click();
        // 5.Verify all check boxes are checked

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));


        for(WebElement each : checkBoxes){
            if(each.isSelected()){
                System.out.println("All check Boxes are checked. Verification Passed");
            }else{
                System.out.println("All check Boxes are Not checked. Verification Failed");
            }
        }
        // 6.Verify button text changed to “Uncheck All”

        String checkAllTextAfterSelect = checkAll.getAttribute("value");
        if(checkAllTextAfterSelect.equals("Uncheck All")){
            System.out.println("check button text is changed. Verification Passed");
        }else{
            System.out.println("check button text is Not changed. Verification Failed");
        }
    }
}
