package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Halime");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Cobanli");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("HC123456");
        Thread.sleep(2000);
        driver.findElement(By.id("password_step_input")).sendKeys("HalimeCobanli");
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
