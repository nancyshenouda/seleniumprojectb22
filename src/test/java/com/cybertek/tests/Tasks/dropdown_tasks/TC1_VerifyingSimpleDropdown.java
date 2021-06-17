package com.cybertek.tests.Tasks.dropdown_tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TC1_VerifyingSimpleDropdown {
    public static void main(String[] args) {

        /*
        TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        1.Open Chrome browser
        2.Go to http://practice.cybertekschool.com/dropdown


         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();

       // 3. Verify “Simple dropdown” default selected value is correct
        // Expected: “Please select an option”

        Select select = new Select(driver.findElement(By.id("dropdown")));

        String actual = select.getFirstSelectedOption().getText();
        String expected= "Please select an option";

        System.out.println("Actual option text = " + actual);
        System.out.println("Expected option text =  " + expected);
    // 4.Verify“State selection” default selected value is correct
        // Expected: “Select a State”

        Select selectState = new Select(driver.findElement(By.id("state")));

        String actualState = selectState.getFirstSelectedOption().getText();
        String expectedState = "Select a State";
        System.out.println("Actual option = " + actualState);
        System.out.println("Expected option = " + expectedState);






    }

}
