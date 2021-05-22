package com.cybertek.tests.day3_review_practice;

/*
TC #2: Facebook incorrect login title verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Enter incorrect username
4.Enter incorrect password
5.Verify title changed to:
Expected: “Log into Facebook”
 */
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookIncorrectLoginVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("user@gmail.com" + Keys.ARROW_DOWN);
        driver.findElement(By.id("pass")).sendKeys("pass" + Keys.ARROW_DOWN);
        driver.findElement(By.name("login")).click();

        String expectedTitle = "Log into Facebook";
        //System.out.println("expectedTitle = " + expectedTitle);

        Thread.sleep(5000);
        String actualTitle = driver.getTitle();
        //System.out.println("actualTitle = " + actualTitle);
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Facebook login title verification PASSED");
        }else{
            System.out.println("Facebook login title verification FAILED");
        }




    }
}
