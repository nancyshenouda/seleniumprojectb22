package com.cybertek.tests.Tasks;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
1. Go to http://thedemosite.co.uk/login.php page, check the page whether opened or not
2. Check the following elements on login page;
a. Tab Title = 'Login example page to test the PHP MySQL online system'
b. Header = '4. Login'
c. Status Message = No login attempted
d. Info Message = 'Enter your login details you added on the previous page and test
the login. The success or failure will be shown above.'
e. Username field
f. Password password field
g. Test Login button
3. Perform a successful login and check the status message change
4. Perform a failed login and check the status message change

 */
public class MySQLOnlineSystem {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        String browser = ConfigurationReader.getProperty("browser");
         driver = WebDriverFactory.getDriver(browser);
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         driver.manage().window().maximize();
        driver.get("http://thedemosite.co.uk/login.php");

    }
    @Test
    public void verifyTitle(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Login example page to test the PHP MySQL online system";
        Assert.assertTrue(actualTitle.equals(expectedTitle));

    }
    @Test
    public void verifyHeader(){
        WebElement header = driver.findElement(By.xpath("//p[.='4. Login']"));
        String actualHeader = header.getText();
        String expectedHeader = "4. Login";
        Assert.assertEquals(actualHeader,expectedHeader);
    }
    @Test
    public void VerifyStatusMessage(){
        WebElement statusMsg = driver.findElement(By.xpath("//b[.='**No login attempted**']"));
        String statusMsgText = statusMsg.getText();
        String expectedText = "No login attempted";
        Assert.assertTrue(statusMsgText.contains(expectedText));

    }

    @Test
    public void verifyInfoMessage(){

        WebElement infomsg = driver.findElement(By.xpath("//td[@class='auto-style1']//blockquote//p"));
        String actualInfoMsg = infomsg.getText();
        String expectedInfoMsg = "Enter your login details you added on the previous page and test the login.\nThe success or failure will be shown above.";
        Assert.assertTrue(actualInfoMsg.contains(expectedInfoMsg));
    }

    @Test (priority = 1)
    public void testLogin(){

        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("fdgghgfhgf" + Keys.ARROW_DOWN);
        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
        pass.sendKeys("dfgdfg" + Keys.ARROW_DOWN);
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Test Login']"));
        loginButton.click();

    }
    @Test (priority = 2)
    public void verifyMsgAfterSuccess(){
        WebElement successMessage = driver.findElement(By.xpath("//b[.='**Successful Login**']"));
        String successMessageText = successMessage.getText();
        String expectedMessage = "**Successful Login**";
        Assert.assertEquals(successMessageText,expectedMessage);
    }

//    @AfterMethod
//    public void tearDown(){
//        driver.close();
//    }

}
