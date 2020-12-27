package com.syntax.class088;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitsHandling {
    public static String url = "http://syntaxtechs.com/selenium-practice/dynamic-data-loading-demo.php";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        WebElement getNewUsersButton=driver.findElement(By.id("save"));
        getNewUsersButton.click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'First Name : ')]")));


        WebElement firstName=driver.findElement(By.xpath("//p[contains(text(),'First Name : ')]"));
        String firstNameText=firstName.getText();
        System.out.println(firstNameText);


    }
}