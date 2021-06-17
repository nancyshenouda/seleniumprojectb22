package com.cybertek.tests.NadirAssignments;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment2LoginTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com/user/login");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        WebElement password = driver.findElement(By.id("prependedInput2"));
        WebElement loginButton = driver.findElement(By.id("_submit"));


        // testing the valid UserName and invalid Password (lowerCase)
        userName.sendKeys("StoreManager83" + Keys.ARROW_DOWN);
        password.sendKeys("useruser123" + Keys.ARROW_DOWN);
        loginButton.click();
        Thread.sleep(1000);
        WebElement invalidMessage = driver.findElement(By.xpath("//div[.='Invalid user name or password.']"));
        if(invalidMessage.isDisplayed()){
            System.out.println("invalid password didn't login. Verification Passed");
        }else{
            System.out.println("invalid password can login. Verification Failed!!");
        }

    }
}
