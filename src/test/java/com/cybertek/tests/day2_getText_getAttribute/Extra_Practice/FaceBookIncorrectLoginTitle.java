package com.cybertek.tests.day2_getText_getAttribute.Extra_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #2: Facebook incorrect login title verification1.
Open Chrome browser
2.Go to https://www.facebook.com
3.Enter incorrect username
4.Enter incorrect password
5.Verify title changed to:
Expected: “Log into Facebook”
 */
public class FaceBookIncorrectLoginTitle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.findElement(By.name("email")).sendKeys("username@yahoo.com" + Keys.ARROW_DOWN);
        driver.findElement(By.name("pass")).sendKeys("pass" + Keys.ARROW_DOWN);
        driver.findElement(By.name("login")).click();

        String expectedTitle = "Log into Facebook";

        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Facebook login title verification PASSED");
        }else{
            System.out.println("Facebook login title verification FAILED!!");
        }



    }
}
