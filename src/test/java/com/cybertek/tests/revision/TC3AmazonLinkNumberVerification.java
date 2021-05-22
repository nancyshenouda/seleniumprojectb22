package com.cybertek.tests.revision;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC3AmazonLinkNumberVerification {
    public static void main(String[] args) throws InterruptedException {

        /*
        TC #3: Amazon link number verification
        1. Open Chrome browser
        2. Go to https://www.amazon.com
        3. Enter search term (use cssSelector to locate search box)
        4. Verify title contains search term
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        WebElement search = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

        Thread.sleep(3000);

        search.sendKeys("wooden spoons" + Keys.ENTER);
        String expectedSearch = "wooden spoons";
        String searchText = driver.getTitle();

        if(searchText.contains(expectedSearch)){
            System.out.println("search title verification Passed!");
        }else {
            System.out.println("search title verification Failed!!!");
        }

    }
}
