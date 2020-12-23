package com.syntax.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();// chrome browersi calistirmak icin,
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id='zg_banner_text_wrapper']")).getText();

        System.out.println("Title is ;"+ driver.findElement(By.xpath("//*[@id='zg_banner_text_wrapper']")).getText());
       // driver.close();
    }

}
