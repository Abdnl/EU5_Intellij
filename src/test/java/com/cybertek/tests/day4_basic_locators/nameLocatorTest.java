package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //make browser fullscreen
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen(); //not working properly


        driver.get("http://practice.cybertekschool.com/sign_up");

        //proper way
      //  WebElement fullNameInput = driver.findElement(By.name("full_name"));
      //  fullNameInput.sendKeys("Mike Smith");

         //proper way
        // WebElement emailInput = driver.findElement(By.name("email"));
       // emailInput.sendKeys("mike@smith.com");

       // Thread.sleep(3000);

        //click Sign Up button
       // WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
       // signUpButton.click();

        //2nd way/lazy way

        //Typing Full name
        driver.findElement(By.name("full_name")).sendKeys("Mike Smith");

        //Typing email
        driver.findElement(By.name("email")).sendKeys("mike@smith.com");

        Thread.sleep(3000);

        // lazy way of Clicking
        driver.findElement(By.name("wooden_spoon")).click();





    }
}
