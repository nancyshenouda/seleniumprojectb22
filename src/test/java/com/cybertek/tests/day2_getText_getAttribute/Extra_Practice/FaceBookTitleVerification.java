package com.cybertek.tests.day2_getText_getAttribute.Extra_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #1: Facebook title verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Verify title:
Expected: “Facebook -Log In or Sign Up”
 */
public class FaceBookTitleVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com");

        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Facebook title verification PASSED");
        }else{
            System.out.println("Facebook title verification FAILED!!");
        }

    }
}
