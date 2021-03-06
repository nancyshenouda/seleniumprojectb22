package com.cybertek.tests.day10_webTable_properties_practices;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.TableUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TableTasks {


    }
    @Test
    public void task3_return_tims_due_amount(){
        // this line returns String: chrome

        String url = ConfigurationReader.getProperty("dataTablesUrl");
        //this line returns String: http://practice.cybertekschool.com/tables#edit
        driver.get(url);
        //2-Locate first table and verify Tim has due amount of “$50”
        //3-Note: Create locator for Tim that will be dynamic and doesn’t care in which row Tim is.

        //WebElement tim = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']"));
        WebElement amountCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));

        System.out.println("amountCell =  " + amountCell.getText());
        String actualTimAmount = amountCell.getText();
        String expectedAmount = "$50.00";
        Assert.assertEquals(actualTimAmount,expectedAmount);
        // we can also locate the amount by //table[@id='table1']//td[.='Tim']/following-sibling::td[2]

    }
    @Test
    public void task4_verify_orders(){
        TableUtils.verifyOrder(driver,"Tim");
    }

@Test
    public void task5_print_names_emails(){
        TableUtils.printNamesAndEmails(driver);
}
}
