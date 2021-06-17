package com.cybertek.tests.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC#5: Basic login authentication
1-Open a chrome browser
2-Go to: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3-Verify title equals:
Expected: Web Orders Login
4-Enter username: Tester
5-Enter password: test
6-Click “Sign In” button
7-Verify title equals:
Expected: Web Orders
 */
public class TC5BasicLoginAuthentication {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Web Orders Login";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed!");
        }else {
            System.out.println("Title verification Failed!!!");
        }

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester" + Keys.ARROW_DOWN);
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ARROW_DOWN);
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Web Orders";

        if(actualTitle2.equals(expectedTitle2)){
            System.out.println("Title2 verification Passed!");
        }else {
            System.out.println("Title2 verification Failed!!!");
        }
    }
}
