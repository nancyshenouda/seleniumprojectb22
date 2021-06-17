package com.cybertek.tests.Tasks;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC6XpathLocatorPractice {
    public static void main(String[] args) {

        /*
        TC #6: XPATH LOCATORpractice
        1. Open Chrome browser
        2. Go to http://practice.cybertekschool.com/multiple_buttons
        3. Click on Button 1
        4. Verify text displayed is as expected:
        Expected:“Clicked on button one!”
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();

        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
        String resultText = result.getText();

        String expectedText = "Clicked on button one!";

        if(resultText.equals(expectedText)){
            System.out.println("text verification Passed!");
        }else {
            System.out.println("text verification Failed!!!");
        }

    }
}
