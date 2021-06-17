package com.cybertek.tests.Tasks.dropdown_tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC4SelectingValueFromMultipleSelectDropdown {
    public static void main(String[] args) throws InterruptedException {
        /*
        1.Open Chrome browser
        2.Go to http://practice.cybertekschool.com/dropdown

        4.Print out all selected values.
        5.Deselect all values.
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();

        // 3.Select all the options from multiple select dropdown.
        Select select = new Select(driver.findElement(By.name("Languages")));
        List<WebElement> multiplyElements = select.getOptions();

        for( WebElement each : multiplyElements){
            select.selectByVisibleText(each.getText());
            //4.Print out all selected values.
            System.out.println(each.getText());

        }
        Thread.sleep(1000);
        select.deselectAll();



    }
}
