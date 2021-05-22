package com.cybertek.tests.day5_findelements_practice;

/*
TC #0: FINDELEMENTS
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password
3. Print out the texts of all links
4. Print out how many total link
 */
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
public class P0_FindElements_Practice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // If a web element is not found, this will wait UP TO given seconds
        // If web element is located before 15 seconds, it will move on
       // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // we need to create a locator that return all the links on the page (//body//a)
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        //3. Print out the texts of all links
        for( WebElement each : listOfLinks){
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));

        }
        //4. Print out how many total link

       int numberOfLinks = listOfLinks.size();
        System.out.println("Number of links = " + numberOfLinks);


    }
}
