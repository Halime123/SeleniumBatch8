package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class HandlingException {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        String url="http://syntaxtechs.com/selenium-practice/dynamic-data-loading-demo.php";
        driver.navigate().to(url);
        WebElement getNewUserButton=driver.findElement(By.id("save"));
        getNewUserButton.click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'First Name:')]")));

        WebElement firstNmae=driver.findElement(By.xpath("//p[contains(text(),'First Name:')]"));
        String firstText=firstNmae.getText();
        System.out.println(firstText);
    }
}
