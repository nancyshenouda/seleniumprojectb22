package com.cybertek.tests.Tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2PracticeCybertek_AddRemoveElementsVerification {
    public static void main(String[] args) throws InterruptedException {

//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/add_remove_elements

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        driver.manage().window().maximize();
//        3. Click to “Add Element” button
        WebElement addElement = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElement.click();
//        4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        System.out.println(deleteButton.isDisplayed());
//        // 5. Click to “Delete” button.

        try{
            deleteButton.click();

        if(!deleteButton.isDisplayed()){
            System.out.println("Delete button is Not Displayed after clicking! Passed");
        }else {
            System.out.println("Delete button is Displayed after clicking. Failed");
        }

        }catch(StaleElementReferenceException exception){
            System.out.println("StaleElementException has been thrown");
            System.out.println("Delete button is Not Displayed in the HTML page after clicking");
            System.out.println("Verification passed");
        }

//        6. Verify “Delete” button is NOT displayed after clicking.

    }
}
