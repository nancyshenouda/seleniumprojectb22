package com.cybertek.tests.day4_Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
CSS Practice
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #3: Amazon link number verification
1. Open Chrome browser
2. Go to https://www.amazon.com
3. Enter search term (use cssSelector to locate search box)
4. Verify title equals search term
 */
public class P3_cssSelector_AmazonTask {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

        Thread.sleep(3000);

        amazonSearchBar.sendKeys("wooden spoon" + Keys.ENTER);

        String expectedTitle = "Amazon.com : wooden spoon";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
        System.out.println("Title verification PASSED!");
        }else{
        System.out.println("Title verification FAILED");
}

    }
}
