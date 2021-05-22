package com.cybertek.tests.day4_Practice;
/*
TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cybertek School” text
4. Verify all WebElements are displayed.
 */

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_Cybertek {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");

       // driver.findElement(By.cssSelector("a.nav-link"));// same step as the below one
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //b. “Forgot password” header
        WebElement forgotPassHeader = driver.findElement(By.tagName("h2"));

        //c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));

        //d. E-mail input box
        WebElement emailInputBox = driver.findElement(By.cssSelector("input[name='email']"));

        //e. “Retrieve password” button
        WebElement retrievePassButton = driver.findElement(By.cssSelector("button[id='form_submit']"));

        //f. “Powered by Cybertek School” text
        WebElement poweredByCybertek = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        //4. Verify all WebElements are displayed.

        System.out.println("homeLink is displayed " + homeLink.isDisplayed());
        System.out.println("poweredByCybertek is displayed = " + poweredByCybertek.isDisplayed());
        System.out.println("forgotPassHeader is displayed = " + forgotPassHeader.isDisplayed());
        System.out.println("emailInputBox is displayed = " + emailInputBox.isDisplayed());
        System.out.println("retrievePassButton is displayed " + retrievePassButton.isDisplayed());
    }
}
