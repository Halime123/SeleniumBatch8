package com.syntax.class077;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DemoqaBrowserWindowDemo1 {
    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement newTabButton=driver.findElement(By.id("tabButton"));
        newTabButton.click();
        String newTabText=newTabButton.getText();
        System.out.println(newTabText);
        String firstTitle=driver.getTitle();
        System.out.println(firstTitle);


        WebElement newWindowButton=driver.findElement(By.id("windowButton"));
        newWindowButton.click();
        String newWindowText=newWindowButton.getText();
        System.out.println(newWindowText);
        String secondTitle=driver.getTitle();
        System.out.println(secondTitle);


        WebElement newWindowMessageButton=driver.findElement(By.id("messageWindowButton"));
        newWindowMessageButton.click();
        String newWindowMessageText=newWindowMessageButton.getText();
        System.out.println(newWindowMessageText);
        String thirdTitle=driver.getTitle();
        System.out.println(thirdTitle);

        String mainPageTitle=driver.getTitle();
        System.out.println(mainPageTitle);


    }

}