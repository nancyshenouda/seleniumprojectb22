package com.cybertek.tests.day4_Practice;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
TC#5: Basic login authentication
1-Open a chrome browser
2-Go to: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx3-Verify
title equals:
Expected: Web Orders Login
4-Enter username: Tester
5-Enter password: test
6-Click “Sign In” button
7-Verify title equals:
Expected: Web Orders
 */
public class Task5BasicLoginAuthentication {
    public static void main(String[] args) {
        //TC #5: Basic login authentication
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("safari");

        // 2- Go to:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        // 3- Verify title equals:
        //Expected: Web Orders Login
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Login page title verification PASSED!");
        }else {
            System.out.println("Login page title verification FAILED!!!");
        }
        // 4- Enter username: Tester
        WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUsername.sendKeys("Tester");

        // 5- Enter password: test
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys("test");

        // 6- Click “Sign In” button
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        // 7- Verify title equals:
        //Expected: Web Orders
        String expectedHomePageTitle = "Web Orders";
        String actualHomePageTitle = driver.getTitle();


    }

}
