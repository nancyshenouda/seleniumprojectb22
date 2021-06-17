package com.cybertek.tests.Tasks.dropdown_tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TC2_SelectingStateFromDropdown {
    public static void main(String[] args) throws InterruptedException {
        /*
        1.Open Chrome browser
        2.Go to http://practice.cybertekschool.com/dropdown




        Use all Select options.(visible text, value, index)
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        //3.Select Illinois

        Select select = new Select(driver.findElement(By.id("state")));
        select.selectByVisibleText("Select a State");
        select.selectByIndex(14);
        Thread.sleep(1000);
        //4.Select Virginia
        select.selectByValue("VA");
        Thread.sleep(1000);
        // 5.Select California
        select.selectByValue("CA");
        Thread.sleep(1000);

        String expected = "California";
        String actualState = select.getFirstSelectedOption().getText();

        if(actualState.equals(expected)){
            System.out.println("State is matching. Verification Passed");
        }else{
            System.out.println("State is not matching. Verification Failed!");
        }





    }
}
