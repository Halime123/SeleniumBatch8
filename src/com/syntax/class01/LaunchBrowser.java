package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxtechs.com/");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);



    }
}
