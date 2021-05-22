package com.cybertek.tests.revision;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #2: Facebook incorrect login title verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Enter incorrect username
4.Enter incorrect password
5.Verify title changed to:
Expected: “Log into Facebook”
 */
public class TC2FacebookIncorrectLoginVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("username" + Keys.ARROW_DOWN);
        driver.findElement(By.id("pass")).sendKeys("password" + Keys.ENTER);
        driver.findElement(By.id("loginbutton")).click();

        String expectedTitle = "Log into Facebook";
        Thread.sleep(5000);
        String actualTitle = driver.getTitle();



        if(actualTitle.equals(expectedTitle)){
            System.out.println("Facebook login title verification Passed!");
        }else {
            System.out.println("Facebook login Title verification Failed!!!");
        }

    }
}
