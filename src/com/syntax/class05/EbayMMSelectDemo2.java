package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EbayMMSelectDemo2 {
    public static String url = "https://www.ebay.com/";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement multiEbay = driver.findElement(By.id("gh-cat"));
        Select select= new Select(multiEbay);
        List<WebElement> allOptions=select.getOptions();
        for (WebElement options:allOptions) {
            String option=options.getText();
            select.selectByVisibleText(option);
            System.out.println(option);
            Thread.sleep(2000);
        }
    }
}
