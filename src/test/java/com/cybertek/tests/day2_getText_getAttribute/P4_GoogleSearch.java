package com.cybertek.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #4:	Google	search
1- Open	a	chrome	browser
2- Go	to:	https://google.com
3- Write	“apple”	in	search	box
4- Click	google	search	button
5- Verify	title:
Expected:	Title	should	start	with	“apple”	word
 */
public class P4_GoogleSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Apple" + Keys.ENTER);
        driver.get("https://www.apple.com");

       // 5- Verify	title:
       // Expected:	Title	should	start	with	“apple”	word
        String expectedTitle = "Apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification passed!!");
        }else{
            System.out.println("Title verification failed!!");
        }



    }
}
