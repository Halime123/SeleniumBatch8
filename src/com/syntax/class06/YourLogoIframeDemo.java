package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YourLogoIframeDemo {

    public static String url = "http://automationpractice.com/index.php";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement addToTheCart=driver.findElement(By.xpath("//span[@class='price product-price']"));
        boolean checkbox=addToTheCart.isEnabled();
        System.out.println(checkbox);

        Thread.sleep(2000);
    }
}