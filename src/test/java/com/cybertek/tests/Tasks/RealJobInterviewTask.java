package com.cybertek.tests.Tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/*
REAL JOB INTERVIEW TASK




        5. Check the tickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18.'
        6. Submit the form by clicking the JOIN NOW button
        7. Validate that a validation message with text ‘ This field is required’ appears under the date of
        birth box

 */
public class RealJobInterviewTask {
    public static void main(String[] args) {
        //1. Navigate to: https://moneygaming.qa.gameaccount.com/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://moneygaming.qa.gameaccount.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        //2. Click the JOIN NOW button to open the registration page
        WebElement joinNowButton = driver.findElement(By.xpath("//a[@class='newUser green']"));
        joinNowButton.click();

       // 3. Select a title value from the dropdown
        Select select = new Select(driver.findElement(By.xpath("//select[@id='title']")));
        select.selectByValue("Select:");
        select.selectByVisibleText("Ms");

        //4. Enter your first name and surname in the form

    }
}
