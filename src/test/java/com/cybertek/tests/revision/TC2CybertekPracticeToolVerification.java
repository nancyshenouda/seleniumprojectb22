package com.cybertek.tests.revision;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #2: Cybertekpractice toolverifications
1.Open Chrome browser
2.Go to https://practice.cybertekschool.com
3.Verify URL contains
Expected: cybertekschool
4.Verify title:
Expected: Practice
 */
public class TC2CybertekPracticeToolVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "cybertekschool";

        if(actualUrl.contains(expectedUrl)){
            System.out.println("Url verification Passed!");
        }else{
            System.out.println("Url verification Failed!!!");
        }

        Thread.sleep(3000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice";

        if(actualTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("Title verification Passed!");
        }else{
            System.out.println("Title Verification Failed!!!");
        }

    }
}
