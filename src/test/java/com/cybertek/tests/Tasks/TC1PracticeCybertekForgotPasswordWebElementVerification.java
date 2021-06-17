package com.cybertek.tests.Tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)

 */
public class TC1PracticeCybertekForgotPasswordWebElementVerification {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

//        a. “Home” link
        WebElement home = driver.findElement(By.cssSelector("a[class='nav-link']"));
//        b. “Forgot password” header
        WebElement pass = driver.findElement(By.xpath("//h2"));
//        c. “E-mail” text
       WebElement email =  driver.findElement(By.cssSelector("label[for='email']"));
//        d. E-mail input box
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
//        e. “Retrieve password” button
        WebElement retreievePass = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
//        f. “Powered by Cybertek School” text
        WebElement PoweredLink = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
//        4. Verify all WebElements are displayed.

        System.out.println(home.isDisplayed());
        System.out.println(pass.isDisplayed());
        System.out.println(email.isDisplayed());
        System.out.println(emailInput.isDisplayed());
        System.out.println(retreievePass.isDisplayed());
        System.out.println(PoweredLink.isDisplayed());



    }
}
