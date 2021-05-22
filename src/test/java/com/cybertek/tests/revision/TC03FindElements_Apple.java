package com.cybertek.tests.revision;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC03FindElements_Apple {
    public static void main(String[] args) throws InterruptedException {
      /*

      1.Open Chrome browser
      2.Go to https://www.apple.com
      3.Click to all of the headers one by one
      a.Mac, iPad, iPhone, Watch, TV, Music, Support
      4.Print out the titles of the each page
      5.Print out total number of links in each page
      6.While in each page:
      a.Print out how many link is missing text TOTAL
      b.Print out how many link has text TOTAL
       */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");

        driver.findElement(By.tagName("mac")).click();
        Thread.sleep(2000);
        String titleMac = driver.getTitle();
        System.out.println("titleMac = " + titleMac);

        driver.findElement(By.tagName("ipad")).click();
        Thread.sleep(2000);
        String titleIpad = driver.getTitle();
        System.out.println("titleIpad = " + titleIpad);

        driver.findElement(By.tagName("iphone")).click();
        Thread.sleep(2000);
        String titleIphone = driver.getTitle();
        System.out.println("titleIphone = " + titleIphone);

        driver.findElement(By.tagName("watch")).click();
        Thread.sleep(2000);
        String titleWatch = driver.getTitle();
        System.out.println("titleWatch = " + titleWatch);

        driver.findElement(By.tagName("tv")).click();
        Thread.sleep(2000);
        String titleTv = driver.getTitle();
        System.out.println("titleTv = " + titleTv);

        driver.findElement(By.tagName("music")).click();
        Thread.sleep(2000);
        String titleMusic = driver.getTitle();
        System.out.println("titleMusic = " + titleMusic);

        driver.findElement(By.tagName("support")).click();
        Thread.sleep(2000);
        String titleSupport = driver.getTitle();
        System.out.println("titleSupport = " + titleSupport);






    }
}
