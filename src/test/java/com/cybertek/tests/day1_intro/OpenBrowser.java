package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {


    public static void main(String[] args) {

//        //We have to enter this line ever time we want to open Chrome Browser
//        WebDriverManager.chromedriver().setup();
//
//        //WebDriver represents the browser
//        //We are creating driver for Chrome browser
//        //new ChromeDriver()--> this part will open a Chrome browser
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://cybertekschool.com");   // .get(url) method used to navigate to a website


        //this line will allow selenium to automate Firefox browser
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.amazon.com");



    }
}
