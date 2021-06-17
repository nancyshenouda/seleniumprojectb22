package com.cybertek.utilities;

import org.openqa.selenium.WebDriver;

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

    public static WebDriver getDriverMethod(){

    }

}
