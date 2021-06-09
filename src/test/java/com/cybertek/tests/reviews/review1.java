package com.cybertek.tests.reviews;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class review1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.cybertekschool.com");

        //Wait 5 seconds
        Thread.sleep(5000);

        //To Close the tab/page
        driver.close();
    }
}
