package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
    public static  String url="http://syntaxtechs.com/selenium-practice/dynamic-elements-loading.php";

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to(url);
        WebElement startButton =driver.findElement(By.id("startButton"));
        startButton.click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //h4[contains(text(),'Welcome Syntax Technologies')]")));

        WebElement start=driver.findElement(By.xpath("//h4[contains(text(),'Welcome Syntax Technologies')]"));
        String welcome=start.getText();
        System.out.println(welcome);
    }
}
