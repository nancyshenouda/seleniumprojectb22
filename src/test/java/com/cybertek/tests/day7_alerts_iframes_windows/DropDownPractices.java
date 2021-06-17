package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDownPractices {

    WebDriver driver;
    @BeforeClass
    public void setupClass(){
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    //3.Verify “Simple dropdown” default selected value is correct
    // Expected: “Please select an option”
    @Test
    public void ct1_simple_dropdown_list(){
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        //WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();
        String actualText = simpleDropdown.getFirstSelectedOption().getText();
        String expectedText = "Please select an option";
        Assert.assertTrue(actualText.equals(expectedText));

        // this is another way of doing every thing is one line
        //Assert.assertEquals(simpleDropdown.getFirstSelectedOption().getText(),"Please select an option");

        //4.Verify“State selection” default selected value is correct
        // Expected: “Select a State”

        Select selectState = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actualStateDropdownText = selectState.getFirstSelectedOption().getText();
        String expectedState = "Select a State";

        Assert.assertEquals(actualStateDropdownText,expectedState);
    }

    @Test
    public void tc2_state_dropdown_test(){
        /*
        Use all Select options.(visible text, value, index)
         */
        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //3.Select Illinois
        stateDropDown.selectByVisibleText("Illinois");
        //4.Select Virginia
        stateDropDown.selectByValue("VA");
        //5.Select California
        stateDropDown.selectByIndex(5);
        //6.Verify final selected option is California.

        String expectedOption = "California";
        String actualOption = stateDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOption,expectedOption);

    }
    @Test
    public void tc3_selecting_date_on_dropdown(){
        /*
    3.Select “December 1st, 1922” and verify it is selected.
    Select year using: visible text
    Select month using : value attribute
    Select day using: index number
     */
        //Select date = new Select(driver.findElement())

    }
    @AfterClass
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

}
