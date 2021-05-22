package com.cybertek.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
 */
public class T1_ZeroBankHeaderVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        // another way of declaring a WebElement and locating it:
        WebElement actualHeader = driver.findElement(By.tagName("h3"));

        //Storing the WebElement into a String
        String actualHeaderText= actualHeader.getText();


        String expectedHeader = "Log in to ZeroBank";

        if(actualHeaderText.equals(expectedHeader)){
            System.out.println("Header verification passed");

        }else{
            System.out.println("Header verification Failed!");
        }




    }
}

