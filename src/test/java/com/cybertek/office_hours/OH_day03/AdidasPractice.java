package com.cybertek.office_hours.OH_day03;

import com.cybertek.utilities.OfficeHoursUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
In this task we will handle alerts, we will create a method that can be used in our test case for repeated actions. Try to stick to DRY (don't repeat yourself) concept.
If something is repeating try to create a solution for that.
 You have to implement the following Web automated checks over our (Adidas)
 DEMO ONLINE SHOP: https://www.demoblaze.com/index.html
• Customer navigation through product categories: Phones, Laptops and Monitors
• Navigate to "Laptop" → "Sony vaio i5" and click on "Add to cart". Accept pop up confirmation.
• Navigate to "Phones" → "Samsung galaxy s6" and click on "Add to cart". Accept pop up confirmation.
• Navigate to "Monitors" → "Apple monitor 24" and click on "Add to cart". Accept pop up confirmation.
• Navigate to "Cart" → Delete "Apple monitor 24" from cart.
• Click on "Place order".
• Fill in all web form fields.
• Click on "Purchase"
• Capture and log purchase Id and Amount.
• Assert purchase amount equals expected.
• Click on "Ok"
 */
public class AdidasPractice {

    WebDriver driver;

    @BeforeMethod

    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.demoblaze.com/index.html");
    }

    @Test
    public void adidasTest() throws InterruptedException {

        OfficeHoursUtils.productHeader(driver,"Laptops", "Sony vaio i5");
        OfficeHoursUtils.productHeader(driver,"Phones", "Samsung galaxy s6");
        OfficeHoursUtils.productHeader(driver,"Monitors", "Apple monitor 24");
        OfficeHoursUtils.productRemover(driver,"Apple monitor 24");

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
