package com.cybertek.tests.revision;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #3: PracticeCybertek/ForgotPassword URL verification
1.Open Chrome browser
2.Go to http://practice.cybertekschool.com/forgot_password
3.Enter any email into input box
4.Click on Retrieve password
5.Verify URL contains:
Expected: “email_sent”
6.Verify textbox displayed the content as expected.
Expected: “Your e-mail’s been sent!”
 */
public class TC3PracticeCybertekForgotPassword {
    public static void main(String[] args) {

        WebDriverFactory.getDriver("chrome");
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.findElement(By.name("email")).sendKeys("shenouda.nancy@yahoo.com");
        driver.findElement(By.id("form_submit")).click();

        String urlText = driver.getCurrentUrl();

        String expectedUrlText = "email_sent";

        if(urlText.contains(expectedUrlText)){
            System.out.println("Url Text verification Passed!");
        }else {
            System.out.println("Url Text verification Failed!!!");
        }

        WebElement text = driver.findElement(By.tagName("h4"));
        String actualText = text.getText();
        String expectedText = "Your e-mail's been sent!";

        if(actualText.equals(expectedText)){
            System.out.println("Text verification Passed!");
        }else {
            System.out.println("Text verification Failed!!!");
        }
    }
}
