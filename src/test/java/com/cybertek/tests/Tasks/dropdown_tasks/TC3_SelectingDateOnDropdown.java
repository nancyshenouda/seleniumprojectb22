package com.cybertek.tests.Tasks.dropdown_tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC3_SelectingDateOnDropdown {
    public static void main(String[] args) {
        /*
        TC #3: Selecting date on dropdown and verifying
        1.Open Chrome browser
        2.Go to http://practice.cybertekschool.com/dropdown

        Select year using: visible text
        Select month using : value attribute
        Select day using: index number
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        // 3.Select “December 1st, 1922” and verify it is selected.
        Select select = new Select(driver.findElement(By.id("year")));
        select.selectByVisibleText("1922");


        Select selectMonth = new Select(driver.findElement(By.id("month")));
        selectMonth.selectByValue("11");

        Select selectDay = new Select(driver.findElement(By.id("day")));
        selectDay.selectByIndex(0);

        List<WebElement> selectedOptions = select.getAllSelectedOptions();

        for( WebElement option : selectedOptions){
            System.out.println(option.getText());
        }







    }
}
