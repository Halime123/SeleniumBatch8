package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task2 {
    public static String url = "https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.cssSelector("#u_0_2")).click();
        driver.findElement(By.cssSelector("#u_6_b")).sendKeys("Halime");
        driver.findElement(By.cssSelector("#u_6_d")).sendKeys("Cobanli");
        driver.findElement(By.cssSelector("#u_6_g")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("hello");
        WebElement monthButton= (WebElement) driver.findElements(By.id("month"));
        Select month=new Select(monthButton);
        


    }
}