package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
    public static String url="http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement simpleAlertButton=driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        WebElement confirm=driver.findElement(By.id("confirm"));
        Thread.sleep(2000);
        Alert con=driver.switchTo().alert();

        String conText=con.getText();
        System.out.println(conText);
        con.dismiss();
        WebElement promptAll=driver.findElement(By.id("prompt"));
        promptAll.click();
        Thread.sleep(2000);
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Syntax techs");
        promptAlert.accept();

    }
}
