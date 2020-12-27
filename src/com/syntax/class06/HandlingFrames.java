package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class HandlingFrames {
    public static String url = "http://uitestpractice.com/Students/Switchto";
    //username:password@
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement textBox=driver.findElement(By.id("name"));
        textBox.sendKeys("2020");

        driver.switchTo().defaultContent();
        WebElement alertButton=driver.findElement(By.id("alert"));
        alertButton.click();

        driver.switchTo().frame("iframe_a");
        textBox.clear();
        textBox.sendKeys("abcshdg");

        driver.switchTo().defaultContent();

        WebElement frame=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        driver.switchTo().frame(frame);
        textBox.clear();
        textBox.sendKeys("abschhjhskd");




    }
}
