package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");   //Navigate to another website

        Thread.sleep(3000);

        //Navigate to another website with different Selenium method
        driver.navigate().to("https://www.facebook.com");

        //Wait 3 seconds here and then move on
        Thread.sleep(3000);

        //goes back to previous page
        driver.navigate().back();


        Thread.sleep(3000);

        //goes to forward again
        driver.navigate().forward();

        //Refreshes the page
        driver.navigate().refresh();





    }
}
