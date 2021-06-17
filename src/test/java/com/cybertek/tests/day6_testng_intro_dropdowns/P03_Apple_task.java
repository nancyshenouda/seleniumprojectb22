package com.cybertek.tests.day6_testng_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P03_Apple_task {
    public static void main(String[] args) throws InterruptedException {

//    1.Open Chrome browser
//    2.Go to https://www.apple.com

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 3.Click to all of the headers one by one
        // a.Mac, iPad, iPhone, Watch, TV, Music, Support
        // Storing 9 web elements including "apple" logo and search and
        List<WebElement> headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        for(int i = 1; i< headerLinks.size()-1; i++){ // starting index 1 to skip the apple button
                                                    // size -1 to skip the search button
           headerLinks.get(i).click();
            Thread.sleep(2000);
            Thread.sleep(3000);


           headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
            // 4.Print out the titles of the each page
            System.out.println("current title in each page: " + driver.getTitle());
            // 5.Print out total number of links in each page
            List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
            System.out.println("total number of links: " + allLinks.size());
            int linksWithNoText = 0;
            int linksWithText = 0;

            for (WebElement each : allLinks) {
                if(each.getText().isEmpty()){
                    linksWithNoText++;
                }else{
                    linksWithText++;
                }
        }
            System.out.println("total number of links without text = " + linksWithNoText);
            System.out.println("total number of links with text  = " + linksWithText);
        }

        // 6.While in each page:
        // a.Print out how many link is missing textTOTAL
        // b.Print out how many link has textTOTAL
    }
}
