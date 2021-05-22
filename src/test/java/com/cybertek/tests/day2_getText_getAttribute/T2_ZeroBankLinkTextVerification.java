package com.cybertek.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #2: Zero Bank link text verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify link text from top left:
Expected: “Zero Bank”
4. Verify link href attribute value contains:
Expected: “index.html”
 */
public class T2_ZeroBankLinkTextVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify link text from top left:
        //Expected: “Zero Bank”
        WebElement zeroBankLink = driver.findElement(By.className("brand"));
        String actualLink=zeroBankLink.getText();
        String expectedLink= "Zero Bank";

        if(actualLink.equals(expectedLink)){
            System.out.println("Link text verification passed");

        }else{
            System.out.println("Link text verification Failed!");
        }
        //4. Verify link href attribute value contains:
        //Expected: “index.html”
        String actualHref = zeroBankLink.getAttribute("href");

        String expectedHref= "index.html";

        if(actualHref.contains(expectedHref)){
            System.out.println("href verification passed");

        }else{
            System.out.println("href verification Failed!");
        }
    }
}
