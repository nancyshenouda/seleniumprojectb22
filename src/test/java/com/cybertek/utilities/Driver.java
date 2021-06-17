package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    /**
     * creating the private constructor so this class' object is not reachable from outside.
     */
    private Driver(){}

    /**
     * Making our driver instance private so it is not reachable from outside of the class
     * Also we are making it static because we are going to use it in a static method
     * Also, we need the functionality of static (runs before every thing else)
     */
    private static WebDriver driver;

    // creating a re-usable utility method that will be returning same driver instance every time we call it
    public static WebDriver getDriverMethod(){

        if(driver == null){
            /*
            We read our browser type from the Configuration.properties file using getProperties() method
            we created in ConfigurationReader class
             */
            String browserType = ConfigurationReader.getProperty("browser");
            /*
            Depending on the browser type, out switch statement will determine to open specific type of browser/driver
             */
            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
        return driver;
    }

}
