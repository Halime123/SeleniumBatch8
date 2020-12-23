package com.syntax.review03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertReview {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        String url="https://the-internet.herokuapp.com/";
        driver.get(url);
        driver.findElement(By.xpath("//a[contains(text(),'JavaScript Alerts')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        Alert alert=driver.switchTo().alert();

        String expectedText="I am a JS Alert";
        String alertTextFromApplication=alert.getText();
        if(expectedText.equals(alertTextFromApplication)){
            System.out.println("Right one");
        } else{
            System.out.println("not right one");
        }
        alert.accept();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        alert=driver.switchTo().alert();
        alert.dismiss();


    }


}
