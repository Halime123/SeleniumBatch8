package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.partialLinkText("Register")).click();
        //driver.findElement(By.linkText("<a href=\"register.htm;jsessionid=FF6B15BC6B1A1E0F7052A56D00D164B8\">Register</a>")).click();


        driver.findElement(By.id("customer.firstName")).sendKeys("Halime");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Cobanli");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.street")).sendKeys("Street");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.city")).sendKeys("Henderson");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.state")).sendKeys("NV");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("1234");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("12345");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.ssn")).sendKeys("12345");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.username")).sendKeys("Halime");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.password'")).sendKeys("Test123");
        Thread.sleep(2000);
        driver.findElement(By.id("repeatedPassword")).sendKeys("Test123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input")).click();


    }


}
