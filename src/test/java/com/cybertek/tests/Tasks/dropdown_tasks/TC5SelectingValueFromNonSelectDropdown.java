package com.cybertek.tests.Tasks.dropdown_tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC5SelectingValueFromNonSelectDropdown {
    public static void main(String[] args) throws InterruptedException {
        /*
        1.Open Chrome browser
        2.Go to http://practice.cybertekschool.com/dropdown
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        //3.Click to non-select dropdown
        WebElement nonSelect = driver.findElement(By.id("dropdownMenuLink"));
        nonSelect.click();
        // 4.Select Facebook from dropdown
       WebElement facebook = nonSelect.findElement(By.xpath("//a[.='Facebook']"));

        facebook.click();
        Thread.sleep(1000);
        //5.Verify title is “Facebook -Log In or Sign Up”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed");
        }else{
            System.out.println("Title verification Failed!");
        }
    }
}
