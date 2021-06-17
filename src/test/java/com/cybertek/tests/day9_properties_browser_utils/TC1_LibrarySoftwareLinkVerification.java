package com.cybertek.tests.day9_properties_browser_utils;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.LibraryUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC1_LibrarySoftwareLinkVerification {
    /*

the links on landing page
7.Print out each link text on this page
     */
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        // 1.Open browser
        // 2.Go to website: http://library2.cybertekschool.com/login.html
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.get("http://library2.cybertekschool.com/login.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    /*
    Task#2:•Create a method called loginToLibrary
    in the same java class with the @Test•
    This method simply logs in to Library app when you call it.
     */

    @Test
    public void login_link_count_test() throws InterruptedException {
       //  loginMethod calling login to library app
        LibraryUtils.loginLibrary(driver);

        //6.Print out count of all the links on landing page
        BrowserUtils.sleep(2);
        List<WebElement> links = driver.findElements(By.xpath("//body//a"));

        System.out.println("links count = " + links.size());
        //7.Print out each link text on this page
        for( WebElement each : links){
            System.out.println(each.getText());
        }

    }
}
