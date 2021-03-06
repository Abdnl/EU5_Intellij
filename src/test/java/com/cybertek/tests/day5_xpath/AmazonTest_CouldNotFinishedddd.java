package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest_CouldNotFinishedddd {

    /*
    go to Amazon
    search for Java
    click search button
    verify 1-48 of 304 results for "Java"
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();  ////maximize the window

        driver.get("https://www.amazon.com");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        searchBox.sendKeys("Java");

        Thread.sleep(3000);

        //Click search button 2 ways
        //driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

        driver.findElement(By.xpath("//input[@value='Go']")).click();

        WebElement result = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));

        String resultText = result.getText();

        System.out.println("resultText = " + resultText);

        String expectedResult = "1-48 of over 4,000 results for";

        if (expectedResult.equals(resultText)){

            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
            System.out.println("expectedResult = " + expectedResult);
            System.out.println("resultText = " + resultText);


        }

        Thread.sleep(5000);

        driver.quit();

        //navigate to amazon.com and search for "java"
        //span[.='"java"']/../span[1]


    }
}
