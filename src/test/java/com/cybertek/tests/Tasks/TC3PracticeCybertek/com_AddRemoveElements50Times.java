package com.cybertek.tests.Tasks.TC3PracticeCybertek;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class com_AddRemoveElements50Times {
    public static void main(String[] args) {

//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/add_remove_elements

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        driver.manage().window().maximize();
//        3. Click to “Add Element” button 50 times
        WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));


        //int deleteCount = 0;
        for (int i=0; i<50 ;i++) {
            addElement.click();
         //  deleteCount++;
        }
      //  4. Verify 50 “Delete” button is displayed after clicking.
        List<WebElement> deleteList= driver.findElements(By.xpath("//div[@id='elements']//button"));
        WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        if(deleteList.size()==50){
            System.out.println("delete buttons count = 50. Verification Passed");
        }else{
            System.out.println("delete buttons count doesn't 50. Verification Failed");
        }

//        5. Click to ALL “Delete” buttons to delete them.


        for (WebElement each : deleteList) {
            each.click();
        }
//        6. Verify “Delete” button is NOT displayed after clicking.
//
        try {
            if (!deleteButton.isDisplayed()) {
                System.out.println("Delete button is Not displayed after clicking. Verification Passed");
            } else {
                System.out.println("Delete button is displayed after clicking. Verification failed");
            }
        }catch (StaleElementReferenceException exception){
            System.out.println("StaleElementReferenceException has been thrown");
            System.out.println("It means delete button is Not displayed in the HTML page after clicking");
            System.out.println("Verification passed");

        }

    }
}
