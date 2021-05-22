package com.cybertek.tests.revision;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #2: Zero Bank link text verification
1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Verify link text from top left:
Expected: “Zero Bank”
4.Verify link href attribute value contains:
Expected: “index.html”
 */
public class TC2ZeroBankLinkTextVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement href = driver.findElement(By.className("brand"));
        String hrefText = href.getText();
        String expectedHref= "Zero Bank";


        if(hrefText.equals(expectedHref)){
            System.out.println("href text verification Passed!");
        }else {
            System.out.println("href text verification Failed!!!");
        }


        String hrefAttributeText = href.getAttribute("href");
        String expectedHref2 = "index.html";

        if(hrefAttributeText.contains(expectedHref2)){
            System.out.println("href link verification Passed!");
        }else {
            System.out.println("href link verification Failed!!!");
        }

    }
}
