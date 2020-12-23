package com.syntax.claas04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://18.232.148.34/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//span[contains(text(),'Password")).sendKeys(" ");
        driver.findElement(By.cssSelector("#btnLogin")).click();
        Thread.sleep(2000);
        WebElement logo=driver.findElement(By.cssSelector("span#spanMessage"));
        if(logo.isDisplayed()){
            System.out.println("Logo is displayed");
        }else{
            System.out.println("Logo is not displayed");
        }

        driver.quit();
    }
}
