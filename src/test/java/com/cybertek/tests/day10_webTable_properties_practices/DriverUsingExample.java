package com.cybertek.tests.day10_webTable_properties_practices;

import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class DriverUsingExample {

    @Test
    public void how_to_use_driver(){
        Driver.getDriverMethod().get("http://practice.cybertekschool.com/tables#edit");
    }
}
