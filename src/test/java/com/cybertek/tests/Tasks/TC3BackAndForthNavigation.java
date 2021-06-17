package com.cybertek.tests.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #3: Back and forth navigation
1-Open a chrome browser
2-Go to: https://google.com
3-Click to Gmail from top right.
4-Verify title contains:
Expected: Gmail
5-Go back to Google by using the .back();
6-Verify title equals:
Expected: Google
 */
public class TC3BackAndForthNavigation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.className("gb_g")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification Passed!");
        }else {
            System.out.println("Title verification Failed!!!");
        }
            driver.navigate().back();

        String actualTitle2 = driver.getTitle();
            String expectedTitle2= "Google";

        if(actualTitle2.equalsIgnoreCase(expectedTitle2)){
            System.out.println("Title2 verification Passed!");
        }else {
            System.out.println("Title2 verification Failed!!!");

        }
        }
}
