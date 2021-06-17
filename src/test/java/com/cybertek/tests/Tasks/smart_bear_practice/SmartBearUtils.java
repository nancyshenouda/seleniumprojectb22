package com.cybertek.tests.Tasks.smart_bear_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtils {

    public static void loginToSmartBear(WebDriver driver){
        //1.Open browser
        //2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester" + Keys.ARROW_DOWN);

        WebElement pass = driver.findElement(By.id("ctl00_MainContent_password"));
        pass.sendKeys("test" + Keys.ARROW_DOWN);

        WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();

    }
    /*
    PRACTICE #4: Method: verifyOrder
    •Create a method named verifyOrder in SmartBearUtils class.
    •Method takes WebDriver object and String(name).
    •Method should verify if given name exists in orders.
    •This method should simply accepts a name(String), and assert whether given name is in the list or not.
    •Create a new TestNG test to test if the method is working as expected.

     */
    public static void verifyOrder(WebDriver driver, String name){

        List<WebElement> allNames = driver.findElements(By.xpath("//table//tbody//td//tr//td[2]"));
        for(WebElement each: allNames){
            Assert.assertTrue(allNames.contains(each));
        }

    }
    /*
    Practice #5: Method: printNamesAndCities
    •Create a method named printNamesAndCities in SmartBearUtils class.
    •Method takes WebDriver object.
    •This method should simply print all the names in the List of All Orders.
    •Create a new TestNG test to test if the method is working as expected.
    •Output should be like:•Name1: name , City1: city•Name2: name , City2: city
     */
public static void printNamesAndCities(WebDriver driver){
    List<WebElement> allNames = driver.findElements(By.xpath("//table//tbody//td//tr//td[2]"));
    List<WebElement> allCities = driver.findElements(By.xpath("//table//tbody//td//tr//td[7]"));

    for(int i=1;i<allNames.size();i++){
        System.out.println("Name" + i + ": " + allNames.get(i).getText() + ", City " + i + ": " + allCities.get(i).getText());
    }
}
    }


