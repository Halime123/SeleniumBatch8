package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class hw1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        String url="https://demoqa.com/browser-windows";
        driver.get(url);
        String mainPageHandle=driver.getWindowHandle();
        System.out.println(mainPageHandle);
        WebElement newWindow=driver.findElement(By.id("windowButton"));
        newWindow.click();
        Set<String> window=driver.getWindowHandles();
        System.out.println(window.size());
        Iterator<String> it=window.iterator();
        mainPageHandle=it.next();
        String childHandle=it.next();
        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(mainPageHandle);


    }
}
