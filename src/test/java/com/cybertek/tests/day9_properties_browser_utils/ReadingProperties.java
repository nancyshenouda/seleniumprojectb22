package com.cybertek.tests.day9_properties_browser_utils;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file() throws IOException {

        //1- Create Object of Properties class ( coming from java lib)
        Properties properties = new Properties();

        //2- Open the file using FileInputStream
        // we are trying to open a file, so we need the path
        FileInputStream file = new FileInputStream("configuration.properties");

        //3- load properties object with our file into the properties object

        properties.load(file);

        //4- reading from configuration.properties. We pass the key inside .getProperties method
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
    }

    @Test
    public void using_properties_method(){
        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"env\") = " + ConfigurationReader.getProperty("env"));
    }

}
