package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
Task#3:
•Create a new class under ‘utilities’package named “LibraryUtilities”
•Move loginToLibrary method from the same java class to “LibraryUtilities”
•Overcome the challenge so it works when you call from the other class.
 */
public class LibraryUtils {

    public static void loginLibrary(WebDriver driver){
        // 3.Enter username: “”
        WebElement inputUserName = driver.findElement(By.xpath("//input[@id='inputEmail']"));
        inputUserName.sendKeys("student12@library " + Keys.ARROW_DOWN);
        //4.Enter password: “”
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='inputPassword']"));
        inputPassword.sendKeys("UC0LC9Hj" + Keys.ARROW_DOWN);
        //5.Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
    }
}
