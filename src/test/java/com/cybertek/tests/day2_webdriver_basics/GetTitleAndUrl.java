package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {

    public static void main(String[] args) {

        //Task: Open Chrome and navigate to http://practice.cybertekschool.com

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        //Another way
        //driver.navigate().to("http://practice.cybertekschool.com");

        //Getting Tittle with Selenium
        System.out.println(driver.getTitle());

        //Shortcut for creating a variable
        //Alt + Enter + Enter ( After typing driver.getTitle(); )
        // getTitle(); --> gets you the title of the page
        String title = driver.getTitle();

        // To print variable name and value --> soutv + Enter
        System.out.println("title = " + title);

        //Shortcut for creating a variable
        //Alt + Enter + Enter ( After typing driver.getCurrentUrl(); )
        String currentUrl = driver.getCurrentUrl();

        //getCurrentUrl --> get the url from browser
        //soutv + Enter --> To print variable name and value
        System.out.println("currentUrl = " + currentUrl);
        
        //getPageSource();--> gets the source of the page
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);


    }
}
