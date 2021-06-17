package com.cybertek.tests.Tasks.smart_bear_practice;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearTasks {
    WebDriver driver;

    @BeforeClass
    public void setup(){
        String browser = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    @BeforeMethod
    public void task1_login(){
        SmartBearUtils.loginToSmartBear(driver);
    }

   @Test
    public void task2_print_links(){
       //    6.Print out count of all the links on landing page
       List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
       System.out.println("count of links = " + allLinks.size());
//    7.Print out each link text on this page
       for(WebElement each : allLinks) {
           System.out.println(each.getText());
       }
   }
   @Test
    public void task3_orderVerification(){
       WebElement viewAllOrders = driver.findElement(By.xpath("//a[.='View all orders']"));
       viewAllOrders.click();

       WebElement susanNameCell = driver.findElement(By.xpath("//table//tbody//tr//td[.='Susan McLaren']"));
       WebElement susanDateCell = driver.findElement(By.xpath("//table//tbody//tr//td[.='Susan McLaren']/../td[5]"));

       String actualSusanDateCellText = susanDateCell.getText();
       String expectedDateCell = "01/05/2010";
       Assert.assertEquals(actualSusanDateCellText,expectedDateCell);
   }
   @Test
    public void task4_verifyOrder(){
        SmartBearUtils.verifyOrder(driver,"Paul Brown");
   }
   @Test
   public void task5_printNamesAndCities(){
        SmartBearUtils.printNamesAndCities(driver);
   }

   @AfterClass
   public void tearDown(){
        driver.close();
   }
    }

