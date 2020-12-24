package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FormyDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/");
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());
        for (WebElement links:allLinks) {
            String fullLinks=links.getAttribute("href");
            String texts=links.getText();
            System.out.println(texts);
        }
    }
}
