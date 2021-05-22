package com.cybertek.tests.revision;

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
public class TC3FacebookHeaderVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebElement header = driver.findElement(By.className("_8eso"));
        String actualHeader = header.getText();

        String expectedHeader = "Connect with friends and the world around you on Facebook.";

        if(actualHeader.equals(expectedHeader)){
            System.out.println("Facebook header verification Passed!");
        }else {
            System.out.println("Facebook header verification Failed!!!");
        }


    }
}
