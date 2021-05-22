package com.cybertek.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
 */
public class P3_BackAndForthNavigation {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right.
        driver.findElement(By.partialLinkText("mail")).click();
        //4- Verify title contains:
        //Expected: Gmail
        String actualTitle = driver.getTitle();
        String expectedTitle= "Gmail";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("title verification passed");
        }else{
            System.out.println("title verification failed");
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();


//        6- Verify title equals:
//        Expected: Google
        String actualGoogle= driver.getTitle();
        String expectedGoogle= "Google";

        if(actualGoogle.contains(expectedGoogle)){
            System.out.println("Google title verification passed");
        }else{
            System.out.println("Google title verification failed");
        }

    }
}
