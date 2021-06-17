package com.cybertek.tests.Tasks;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC01FindElements_Apple {
    public static void main(String[] args) {

        /*
        1.Open Chrome browser
        2.Go to https://www.apple.com
        3.Click to iPhone
        4.Print out the texts of all links
        5.Print out how many link is missing text
        6.Print out how many link has text
        7.Print out how many total link
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");

        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']")).click();
        List<WebElement> links = driver.findElements(By.xpath("//body//a"));

        int linksWithNoText = 0;
        int linksWithText = 0;
        for(WebElement each : links){
            String linksTexts = each.getText();

            if(linksTexts.isEmpty()){
                linksWithNoText++;
            }else{
                linksWithText++;
            }
        }
        System.out.println("linksWithText = " + linksWithText);
        System.out.println("linksWithNoText = " + linksWithNoText);
        System.out.println("total links  = " + links.size());
    }
}
