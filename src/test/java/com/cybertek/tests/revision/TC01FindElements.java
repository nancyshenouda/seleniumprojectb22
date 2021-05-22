package com.cybertek.tests.revision;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC01FindElements {
    public static void main(String[] args) {

        /*
        TC #0: FINDELEMENTS
        1.Open Chrome browser
        2.Go to https://www.merriam-webster.com/
        3.Print out the texts of all links
        4.Print out how many link is missing text
        5.Print out how many link has text
        6.Print out how many total link
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.merriam-webster.com/");

        List<WebElement> links = driver.findElements(By.xpath("//body//a"));

        int linksWithoutText=0;
        int linksWithText = 0;
        for( WebElement each : links){
            String textOfEachLink = each.getText();

            if(textOfEachLink.isEmpty()){
                linksWithoutText++;
            }else{
                linksWithText++;
            }
        }
        System.out.println("number of links without texts = "+ linksWithoutText);
        System.out.println("number of links with texts = " + linksWithText);
        System.out.println("total links  = " + links.size());

        }
    }

