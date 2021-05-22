package com.cybertek.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #2: Cybertek practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cybertekschool.com
3. Verify URL contains
Expected: cybertekschool
4. Verify title:
 Expected: Practice
 */
public class P2_CybertekUrlVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();

         driver.get("http://practice.cybertekschool.com");
         driver.manage().window().maximize();

         String expectedUrl= "cybertekschool";
         String actualUrl = driver.getCurrentUrl();

         if(actualUrl.contains(expectedUrl)){
             System.out.println("Url verification passed");
         }else{
             System.out.println("Url verification failed");
         }

         String expectedTitle = "Practice";
         String actualTitle = driver.getTitle();
         if(actualTitle.contains(expectedTitle)){
             System.out.println("title verification passed");
         }else{
             System.out.println("title verification failed");
         }
    }
}
