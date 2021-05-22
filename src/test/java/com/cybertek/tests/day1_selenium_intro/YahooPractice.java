package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooPractice {
    public static void main(String[] args) {
/*
TC #1: Yahoo Title Verification
1. Open Chrome browser
2. Go to https://www.yahoo.com
3. Verify title:
Expected: Yahoo
 */
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");

        driver.getTitle();
        System.out.println("driver title = " + driver.getTitle());

       // driver.navigate().forward();
       // driver.navigate().back();
        driver.manage().window().maximize();

        
        
        //expected title
        String expectedTitle = "Yahoo";
        System.out.println("expectedTitle = " + expectedTitle);
        //actual title
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        //Creating our verification
        if(actualTitle.equals(expectedTitle)){
            System.out.println("title is as expected, verification passed");
        }else{
            System.out.println("title is not as expected, verification failed");
        }

    }
}
