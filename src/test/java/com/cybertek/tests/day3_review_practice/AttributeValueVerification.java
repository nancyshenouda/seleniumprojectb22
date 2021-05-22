package com.cybertek.tests.day3_review_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #4: Facebook header verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Verify “Create a page”link href value contains text:
Expected: “registration_form”
 */
public class AttributeValueVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement page = driver.findElement(By.linkText("Create a Page"));

        String actualPage = page.getAttribute("href");
        String expectedPage = "registration_form";

        if(actualPage.contains(expectedPage)){
            System.out.println("page verification PASSED");
        }else{
            System.out.println("page verification FAILED");
        }

    }
}
