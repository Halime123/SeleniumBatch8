package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBasedAlertDemo1 {
    public static String url = "http://uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement alert=driver.findElement(By.id("alert"));
        alert.click();
        Thread.sleep(2000);
        Alert simpleAlert=driver.switchTo().alert();//accept,dismiss,getText,sendKeys
        simpleAlert.accept();//click ok.


        WebElement confirmAlert=driver.findElement(By.id("confirm"));
        confirmAlert.click();
        Thread.sleep(2000);
        Alert conAlert=driver.switchTo().alert();
        String conAlertText=conAlert.getText();
        System.out.println(conAlertText);
        conAlert.dismiss();

        WebElement promptAlertbutton=driver.findElement(By.id("prompt"));
        promptAlertbutton.click();
        Thread.sleep(2000);
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Syntax techs");
        promptAlert.accept();




    }
}
