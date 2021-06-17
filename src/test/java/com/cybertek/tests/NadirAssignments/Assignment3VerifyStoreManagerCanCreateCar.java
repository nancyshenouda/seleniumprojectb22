package com.cybertek.tests.NadirAssignments;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Assignment3VerifyStoreManagerCanCreateCar {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com/user/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void login_test() throws InterruptedException {
        WebElement userName = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userName.sendKeys("StoreManager83" + Keys.ARROW_DOWN);
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123" + Keys.ARROW_DOWN);
        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();
        Thread.sleep(1000);


        // finding Web element fleet
        WebElement fleet = driver.findElement(By.xpath("//i[@class='fa-asterisk menu-icon']/.."));
        fleet.click();
        Thread.sleep(1000);
        // finding Web element vehicle
        WebElement vehicle = driver.findElement(By.xpath("//a[@href='entity/Extend_Entity_Carreservation']"));
        vehicle.click();
        Thread.sleep(2000);

        // finding Web element create car
        WebElement createCarButton = driver.findElement(By.xpath("//a[@title='Create Car']"));
        createCarButton.click();

        WebElement vehicleModel = driver.findElement(By.xpath("//button[.='Add'][1]"));
        vehicleModel.click();
        Thread.sleep(1000);

        // verify if the adding vehicle model option is displayed
        WebElement optionsTable = driver.findElement(By.xpath("//span[.='Select VehiclesModel']"));
        Assert.assertTrue(optionsTable.isDisplayed());

        //choosing XF model
        WebElement xfSelect = driver.findElement(By.xpath("//tbody[@class='grid-body']//tr[1]//td[1]"));
        xfSelect.click();
        WebElement selectButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        selectButton.click();
        Thread.sleep(1000);

        WebElement vehicleMake = driver.findElement(By.xpath("(//button[@class='btn btn-medium add-btn'])[2]"));
        vehicleMake.click();
        Thread.sleep(1000);

        //Select vehicle make (Toyota)
        WebElement vehicleMakeSel = driver.findElement(By.xpath("(//input[@tabindex='-1'])[2]"));
        vehicleMakeSel.click();
        Thread.sleep(1000);

        //Click on the select button
        WebElement selectButton2 = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])"));
        selectButton2.click();
        Thread.sleep(1000);
    }


    @AfterMethod
    public void teardown() {
        driver.close();
    }

}
