package com.syntax.claas04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());
        for (WebElement link:allLinks
        ) {
            String fullLink=link.getAttribute("href");
            String linkText=link.getText();

            if(!linkText.isEmpty()){
                System.out.println(linkText+" "+fullLink);
            }

        }
    }
}
