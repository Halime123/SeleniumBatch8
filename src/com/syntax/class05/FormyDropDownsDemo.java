package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FormyDropDownsDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/checkbox");
        List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int optionCounts = checkBox.size();
        System.out.println(optionCounts);
        for (WebElement checkBoxOption : checkBox) {

            if (checkBoxOption.isEnabled()) {
                String checkbox = checkBoxOption.getAttribute("value");
                if (checkbox.equalsIgnoreCase("checkbox-2")) {
                    checkBoxOption.click();
                    Thread.sleep(1000);
                   break;
                }
            }


        }

    }
}
