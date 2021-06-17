package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        //2. Go to website: http://practice.cybertekschool.com/iframe

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");
    }
    @Test
    public void iframe_test(){
        // 1- changing to iframe by index: we pass index number
        //driver.switchTo().frame(0);
        // 2- changing to iframe by web element. we find and locate web element this pass it
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
        driver.switchTo().frame(iframe);
        //4. Assert: “Your content goes here.” Text is displayed.
        WebElement yourContentGoesHere = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoesHere.isDisplayed());

        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
        driver.switchTo().defaultContent();

        WebElement iframeHeader = driver.findElement(By.tagName("h3"));
        //String iframeHeaderText = iframeHeader.getText();
        //String expectedText = "An iFrame containing the TinyMCE WYSIWYG Editor";
        Assert.assertTrue(iframe.isDisplayed());
    }
}
