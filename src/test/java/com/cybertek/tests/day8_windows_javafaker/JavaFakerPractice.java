package com.cybertek.tests.day8_windows_javafaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){
        Faker faker = new Faker();
        String fullName = faker.name().fullName();
        System.out.println("Full name = " + fullName);
        
        String chuckNorris = faker.chuckNorris().fact();
        System.out.println("chuckNorris = " + chuckNorris);
        
        String funnyName = faker.funnyName().name();
        System.out.println("funnyName = " + funnyName);
        
    }
}
