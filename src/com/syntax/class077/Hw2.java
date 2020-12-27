package com.syntax.class077;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hw2 {
    public static String url="http://www.uitestpractice.com/Students/Contact";
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "/Users/punchcode/eclipse-workspace/SeleniumTesting/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("This is a Ajax link")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement text = driver.findElement(By.xpath("//div[@class='ContactUs']//p"));
        String textOf = text.getText();
        System.out.println(textOf);
        driver.quit();
    }
}
