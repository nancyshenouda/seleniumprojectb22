package com.cybertek.tests.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #4: Facebook header verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Verify “Create a page” link href value contains text:
Expected: “registration_form”
 */
public class TC4FacebookHeaderVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebElement href = driver.findElement(By.linkText("Create a Page"));
        String hrefValue = href.getText();
        String expectedValue = "registration_form";

        if(hrefValue.contains(expectedValue)){
            System.out.println("Registration form verification Passed!");
        }else {
            System.out.println("Registration form verification Failed!!!");
        }

    }
}
