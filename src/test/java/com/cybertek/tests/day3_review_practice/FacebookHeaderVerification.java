package com.cybertek.tests.day3_review_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #3: Facebook header verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Verify header text is as expected:
Expected: “Connect with friends and the world around you on Facebook.”
 */
public class FacebookHeaderVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.facebook.com");

        String expectedHeader = "Connect with friends and the world around you on Facebook.";

       WebElement  header = driver.findElement(By.className("_8eso"));
       String actualHeader = header.getText();
       if(actualHeader.contains(expectedHeader)){
           System.out.println("Header verification Passed");
       }else{
           System.out.println("Header verification FAILED");
       }

    }
}
