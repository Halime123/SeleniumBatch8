package com.syntax.class088;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskImplicitWaits {
    public static String url = "http://syntaxtechs.com/selenium-practice/dynamic-data-loading-demo.php";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        WebElement startButton=driver.findElement(By.id("startButton"));
        startButton.click();

        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Welcome')]")));

        WebElement welcome=driver.findElement(By.xpath("//*[contains(text(), 'Welcome')]"));
        System.out.println(welcome);

    }
}