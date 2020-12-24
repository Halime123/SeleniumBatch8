package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDemo1 {
    public static String url = "http://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement multiselectDD=driver.findElement(By.id("multi-select"));
        Select select=new Select(multiselectDD);
        Boolean isMultiple=select.isMultiple();
        System.out.println(isMultiple);
        if(isMultiple){
            List<WebElement> options=select.getOptions();
            for (WebElement option:options) {
                String optionText=option.getText();
                select.selectByVisibleText(optionText);
                Thread.sleep(2000);
            }
            select.deselectAll();
        }

        }
    }

