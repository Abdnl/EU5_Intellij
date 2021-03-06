package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //maximize the window
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        //Send keys to fullname
        WebElement fullNameInput = driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("Mike Smith With TagName");

        //Short way
        //driver.findElement(By.tagName("input")).sendKeys("Mike Smith With TagName");

        //Send keys to email
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("mike@smith.com");

        Thread.sleep(3000);

        //Short way to click on Sign Up button
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(3000);

        driver.quit();






    }
}
