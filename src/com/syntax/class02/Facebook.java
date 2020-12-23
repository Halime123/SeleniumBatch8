package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Alex");
        driver.findElement(By.name("lastname")).sendKeys("Kozachok");
        driver.findElement(By.name("reg_email__")).sendKeys("7038886547");
        driver.findElement(By.id("password_step_input")).sendKeys("Kozach27376");
        driver.findElement(By.id("month")).sendKeys("July");
        driver.findElement(By.id("day")).sendKeys("16");
        driver.findElement(By.id("year")).sendKeys("1988");
        driver.findElement(By.id("u_1_3")).click();
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.id("u_1_9")).click();
        driver.quit();
    }

}
