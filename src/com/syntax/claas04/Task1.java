package com.syntax.claas04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://18.232.148.34/humanresources/symfony/web/index.php/auth/login");
       driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
      driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Hum@nhrm123");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(" #btnLogin")).click();
        Thread.sleep(2000);
        WebElement logo=driver.findElement(By.tagName("img"));
        boolean logoDisplayed=logo.isDisplayed();
        System.out.println(logoDisplayed);
        driver.quit();


    }
}
