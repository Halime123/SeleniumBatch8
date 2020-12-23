package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        /*WebDriver driver1=new ChromeDriver();
        driver1.get("https://www.amazon.com/");
        String url1=driver1.getCurrentUrl();
        System.out.println(url1);
        String title1=driver1.getTitle();
        System.out.println(title1);*/
        WebDriver driver=new ChromeDriver();
        driver.get("http://example.com");
        String pageSource=driver.getPageSource();
        System.out.println(pageSource);
    }




}
