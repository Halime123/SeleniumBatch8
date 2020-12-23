package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



import java.util.List;

public class Task1 {
    public static String url="https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.findElement(By.cssSelector("#u_0_2")).click();
        WebElement daysDD=driver.findElement(By.cssSelector("#month"));
        Select selectMonth=new Select(daysDD);
        List<WebElement> allOptions=selectMonth.getOptions();
        int size=allOptions.size();
        System.out.println(size);
        for (int i = 0; i <size ; i++) {
            String optionText=allOptions.get(i).getText();
            System.out.println(optionText);
            selectMonth.selectByIndex(i);
            Thread.sleep(2000);
        }

    }
}
