package com.cybertek.tests.day9_waits;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitExample {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //It will wait to findElement method till opens or up to 30 secs max.
        //We will set ImplicitWait in Before Method
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        //Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void  test1(){

        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");

        WebElement element = driver.findElement(By.cssSelector("#finish"));

        System.out.println(element.getText());

    }


}
