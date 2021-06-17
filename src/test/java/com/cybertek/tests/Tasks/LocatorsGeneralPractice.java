package com.cybertek.tests.Tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsGeneralPractice {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        driver.manage().window().maximize();

        WebElement autocomplete = driver.findElement(By.linkText("Autocomplete"));
        autocomplete.click();

        WebElement home = driver.findElement(By.className("nav-link"));
        home.click();
        WebElement dragDrop = driver.findElement(By.partialLinkText("Drag"));
        dragDrop.click();

        WebElement colomnA = driver.findElement(By.id("column-a"));
        colomnA.click();
        driver.navigate().back();

        WebElement checkBoxes = driver.findElement(By.cssSelector("a[href='/checkboxes']"));
        checkBoxes.click();
        WebElement box1 = driver.findElement(By.xpath("//input[@id='box1']"));
        box1.click();
        driver.quit();

    }
}
