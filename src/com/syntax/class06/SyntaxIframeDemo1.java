package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;

public class SyntaxIframeDemo1 {
    public static String url = "http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame("FrameOne");
        WebElement frameHeader=driver.findElement(By.xpath("//a[text()='SYNTAX TECHNOLOGIES ']"));
       boolean isHeaderDisplayed=frameHeader.isDisplayed();
        System.out.println(isHeaderDisplayed);
    }
}
