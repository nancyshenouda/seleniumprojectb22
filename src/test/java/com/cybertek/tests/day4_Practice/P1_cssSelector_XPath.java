package com.cybertek.tests.day4_Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_XPath {
    public static void main(String[] args) {

        //TC #6: XPATH LOCATOR practice
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2. Go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // 3. Click on Button 1

        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();

        // 4. Verify text displayed is as expected:
        // Expected: “Clicked on button one!”
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        String actualResultText = resultText.getText();
        String expectedText = "Clicked on button one";

        if(actualResultText.contains(expectedText)){
            System.out.println("Result button1 PASSED");
        }else{
            System.out.println("Result button1 FAILED");
        }

       // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        WebElement button2 = driver.findElement(By.xpath("//button[@onclick='button2()']"));
        WebElement button3 = driver.findElement(By.xpath("//button[@onclick='button3()']"));
        WebElement button4 = driver.findElement(By.xpath("//button[@onclick='button4()']"));
        WebElement button5 = driver.findElement(By.xpath("//button[@onclick='button5()']"));
        WebElement dontClick = driver.findElement(By.xpath("//button[@onclick='button6()']"));

        System.out.println("Button 1 " + button1.isDisplayed());

        System.out.println("button 2  = " + button2.isDisplayed());
        System.out.println("button 3 = " + button3.isDisplayed());
        System.out.println("button 4 = " + button4.isDisplayed());
        System.out.println("button 5 = " + button5.isDisplayed());
        System.out.println("dontClick = " + dontClick.isDisplayed());






    }
}
