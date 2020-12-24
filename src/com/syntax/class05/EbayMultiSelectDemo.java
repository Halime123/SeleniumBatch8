package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class EbayMultiSelectDemo {
    public static String url="https://www.ebay.com/";

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement multiEbay=driver.findElement(By.id("gh-cat"));
        Select categories=new Select(multiEbay);
        List<WebElement> optionsList=categories.getOptions();
        Iterator<WebElement> it=optionsList.iterator();
        while(it.hasNext()){
            WebElement option=it.next();
            String optionText=option.getText();
            System.out.println(optionText);
        }

    }
}
