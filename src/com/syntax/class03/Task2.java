package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        driver.findElement(By.id("btn_basic_example")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.container-fluid div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.row div.board div.tab-content div.tab-pane.fade.active.in:nth-child(2) div.list-group:nth-child(4) > a.list-group-item:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#user-message")).sendKeys("Hello");
        Thread.sleep(2000);


    }
}
