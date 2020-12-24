package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        List<WebElement> allLinks=driver.findElements(By.tagName("select"));
        System.out.println(allLinks.size());
        for (WebElement links:allLinks) {
            String fullLinks=links.getAttribute("aria-label");
            String linkText=links.getText();
            if(!linkText.isEmpty()){
                System.out.println(linkText+" "+fullLinks);
            }

        }
    }
}
