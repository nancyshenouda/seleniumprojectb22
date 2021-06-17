package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowsPractice {
    /*
    TC	#	:	Window	Handle practice
1. Create	a	new	class	called:	WindowHandlePractice
     */
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //2. Create	new	test	and	make	set	ups
        //3. Go	to	:	http://practice.cybertekschool.com/windows

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");
    }
    @Test
    public void windowsHandleTest(){
        // printing out our main window handle:
        // storing the window handle into a String is a useful practice for future use
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        //4. Assert:	Title	is	“Practice”
        Assert.assertEquals(driver.getTitle(),"Practice");
        //5. Click	to:	“Click	Here” text
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();
        //6. Switch	to	new	Window.

        for( String eachWindow : driver.getWindowHandles()){
            driver.switchTo().window(eachWindow);
            System.out.println("current title while switching: " + driver.getTitle());
        }

        //7. Assert:	Title	is	“New	Window
        String actualTitleAfterClick = driver.getTitle();
        System.out.println("title after switch: " + actualTitleAfterClick);
        Assert.assertTrue(actualTitleAfterClick.equals("New Window"));
    }


}
