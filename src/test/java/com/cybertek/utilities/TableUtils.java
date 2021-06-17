package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class TableUtils {
//    PRACTICE #4: Method: verifyOrder
//            • Create a method named verifyOrder in TableUtils class.
//            • Method takes WebDriver object and String(name).
//            • Method should verify if given name exists in orders.
//             • This method should simply accepts a name(String), and assert whether
//               given name is in the list or not.
//            • Create a new TestNG test to test if the method is working as expected.

    public static void verifyOrder(WebDriver driver, String name){

        //locate all the names from the table and store them in a list of web elements
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='table1']//tr//td[2]"));

        for(WebElement each : allNames){
            if(each.getText().equals(name)) {
                Assert.assertTrue(true);
                return;
            }
            }
        Assert.assertTrue(false);

      }

//    Practice #5: Method: printNamesAndEmails
//• Create a method named printNamesAndEmails in TableUtils class.
//            • Method takes WebDriver object.
//            • This method should simply print all the names and emails in the table
//• Create a new TestNG test to test if the method is working as expected.
//            • Output should be like:
//            • Name1: name , Email1: email
//• Name2: name , Email2: email
    public static void printNamesAndEmails(WebDriver driver){

        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='table1']//tr//td[2]"));
        int countName = 0;
        int countEmail = 0;

        for(WebElement eachName: allNames){
            countName++;
            System.out.println("Name" + countName+ ": " + eachName.getText());
        }
        List<WebElement> allEmails= driver.findElements(By.xpath("//table[@id='table1']//tr//td[5]"));

        for( WebElement eachEmail : allEmails){
            countEmail++;
            System.out.println("Email" + countEmail+ ": " + eachEmail.getText());
        }
    }

    }

