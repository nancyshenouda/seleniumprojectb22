package com.cybertek.tests.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #1: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
 */
public class TC1ZeroBankHeaderVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement actualHeader= driver.findElement(By.tagName("h3"));
        String actualHeaderText = actualHeader.getText();
        String expectedHeader = "Log in to ZeroBank";

        if(actualHeaderText.equals(expectedHeader)){
            System.out.println("Header verification Passed!");
        }else {
            System.out.println("Header verification Failed!!!");
        }

    }
}
