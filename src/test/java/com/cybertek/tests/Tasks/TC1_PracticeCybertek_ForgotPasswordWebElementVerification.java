package com.cybertek.tests.Tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1_PracticeCybertek_ForgotPasswordWebElementVerification {
    public static void main(String[] args) {

//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/forgot_password
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
//        3. Locate all the WebElements on the page using XPATH locator only (total of 6)
//        a. “Home” link
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
//        b. “Forgot password” header
        WebElement forgotPass = driver.findElement(By.xpath("//div//h2"));
//        c. “E-mail” text
        WebElement emailText = driver.findElement(By.xpath("//label[@for='email']"));
//        d. E-mail input box
        WebElement emailBox = driver.findElement(By.xpath("//input[@name='email']"));
//        e. “Retrieve password” button
        WebElement retreivePass = driver.findElement(By.xpath("//button[@id='form_submit']"));
//         f. “Powered byCybertek School” text
        WebElement poweredByCybertek = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

//     4- verify all web elements are displayed.
        System.out.println(homeLink.isDisplayed());
        System.out.println(forgotPass.isDisplayed());
        System.out.println(emailText.isDisplayed());
        System.out.println(emailBox.isDisplayed());
        System.out.println(retreivePass.isDisplayed());
        System.out.println(poweredByCybertek.isDisplayed());
    }
}
