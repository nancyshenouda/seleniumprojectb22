package com.cybertek.utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.testng.Assert;


public class OfficeHoursUtils {

    static String userName = "nancyDemo";
    static String password="nancy123";

    public static WebElement userNameBox(WebDriver driver){
        return driver.findElement(By.name("username"));
    }
    public static WebElement passwordBox(WebDriver driver){
        return driver.findElement(By.name("password"));
    }
    WebDriver driver;
    public static void productHeader(WebDriver driver, String category, String product) throws InterruptedException {


        WebElement laptops = driver.findElement(By.xpath("//a[.='" + category + "']"));
        laptops.click();
        BrowserUtils.sleep(1);
        // Navigate to "Laptop" → "Sony vaio i5" and click on "Add to cart". Accept pop up confirmation.
        WebElement sonyVaio = driver.findElement(By.xpath("//a[.='" + product + "']"));
        sonyVaio.click();
        BrowserUtils.sleep(1);
        WebElement addCart = driver.findElement(By.xpath("//a[.='Add to cart']"));
        addCart.click();
        BrowserUtils.sleep(1);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        BrowserUtils.sleep(1);

        WebElement home = driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
        home.click();
    }

    public static void productRemover(WebDriver driver, String product) throws InterruptedException {
        //     //tbody//tr//td[.='Apple monitor 24']/..//td[.='Delete']/a
        driver.findElement(By.xpath("//a[.='Cart']")).click();
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath("//tbody//tr//td[.='"+product+"']/..//td[.='Delete']/a")).click();
        BrowserUtils.sleep(3);

        driver.findElement(By.xpath("//button[.='Place Order']")).click();

        Faker faker = new Faker();
        driver.findElement(By.id("name")).sendKeys(faker.name().fullName());
        driver.findElement(By.id("country")).sendKeys(faker.country().name());
        driver.findElement(By.id("city")).sendKeys(faker.country().capital());
        driver.findElement(By.id("card")).sendKeys(faker.finance().creditCard());
        driver.findElement(By.id("month")).sendKeys(String.valueOf(faker.number().numberBetween(1,12)));
        driver.findElement(By.id("year")).sendKeys(String.valueOf(faker.number().numberBetween(2022,2030)));
        driver.findElement(By.xpath("//button[.='Purchase']")).click();
        BrowserUtils.sleep(1);
        String confirmation = driver.findElement(By.xpath("//p[@class='lead text-muted ']")).getText();
        System.out.println("confirmation = " + confirmation);

        String[] confirmationArray = confirmation.split("\n");
        String orderID = confirmationArray[0];
        System.out.println("orderID = " + orderID);
        int actualAmmount = Integer.parseInt(confirmationArray[1].split(" ")[1]);
        System.out.println("actualAmmount = " + actualAmmount);
        int expectedAmount = 1150;

        Assert.assertEquals(actualAmmount,expectedAmount);
    }
    public static void addUserTest(WebDriver driver, String url){
        driver.get(url);
        userNameBox(driver).sendKeys(userName);
        passwordBox(driver).sendKeys(password);
        driver.findElement(By.xpath("//input[@name='FormsButton2']")).click();

    }

    public static boolean positiveLoginTest(WebDriver driver, String url){

        driver.get(url);
        userNameBox(driver).sendKeys(userName);
        passwordBox(driver).sendKeys(password);
        driver.findElement(By.xpath("//input [@value='Test Login']")).click();
        WebElement successMessage = driver.findElement(By.xpath("//b[.='Successful Login']"));
        return successMessage.isDisplayed();

    }
    public static boolean negativeLoginTest(WebDriver driver, String url){
        driver.get(url);
        userNameBox(driver).sendKeys(userName.substring(1));
        passwordBox(driver).sendKeys(password);
        driver.findElement(By.xpath("//input [@value='Test Login']")).click();
        WebElement failedMessage = driver.findElement(By.xpath("//b[.='**Failed Login**"));
        return failedMessage.isDisplayed();
    }
    }
