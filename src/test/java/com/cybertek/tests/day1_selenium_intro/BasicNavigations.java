package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1- setup the browser driver

       WebDriverManager.chromedriver().setup();

        //2- create instance of Selenium webdriver: it opens the browser but empty page

        WebDriver driver = new ChromeDriver();

        //3- get the page
        driver.get("https://www.tesla.com");

        driver.getTitle();
        System.out.println("Current Title: " + driver.getTitle());
        String currentURL =  driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //going back using navigations:
        Thread.sleep(2000); // putting 3 seconds of wait
        driver.navigate().back();

        // driver navigate forward:
        Thread.sleep(2000); // putting 3 seconds of wait
        driver.navigate().forward();

        //refreshing the page:
        driver.navigate().refresh();

        //going to another URL using .to() method:
        driver.navigate().to("https://www.google.com");

        driver.getTitle();
        System.out.println("Current Title: " + driver.getTitle());

        currentURL =  driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        // this method will maximize the browser:
        driver.manage().window().maximize();
        //this function works for mac only:
        driver.manage().window().fullscreen();

        //this method will close the currently open browser
        //it will only close 1 browser and 1 tab
        driver.close();

        //this method will close all the open browsers or tabs in same session
        driver.quit();






    }

}
