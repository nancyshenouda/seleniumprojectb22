package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractices {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        //2. Go to website: http://practice.cybertekschool.com/javascript_alerts

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test
    public void tc1_information_alert_practice(){
        //3. Click to “Click for JS Alert” button
        WebElement informationAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlert.click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement result = driver.findElement(By.xpath("//p[.='You successfuly clicked an alert']"));

        //5. Verify “You successfully clicked an alert” text is displayed.
        Assert.assertTrue(result.isDisplayed(), "result text is not displayed on the page");
        // We can assert the text itself

        String expectedText = "You successfuly clicked an alert";
        String actualText = result.getText();

        Assert.assertEquals(actualText, expectedText, "Actual text is not as expected");
    }
    @Test
    public void tc2_confirmation_alert_practice(){

        //3. Click to “Click for JS Confirm” button
        WebElement confirmButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        confirmButton.click();
        //4. Click to OK button from the alert

        Alert alert = driver.switchTo().alert();
        alert.accept();
       // 5. Verify “You clicked: Ok” text is displayed.

        WebElement result = driver.findElement(By.xpath("//p[.='You clicked: Ok']"));

        Assert.assertTrue(result.isDisplayed(), "Result text is Not displayed");
    }
}
