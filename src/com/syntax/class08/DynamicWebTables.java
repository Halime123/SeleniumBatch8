package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicWebTables {
    public static void main(String[] args) {
        String url="http:secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
        WebDriver driver=new ChromeDriver();
        driver.navigate().to(url);
        WebElement userName=driver.findElement(By.xpath("//input[contains(@name, 'username')]"));
        userName.sendKeys("Tester");
        WebElement password=driver.findElement(By.xpath("//input[@type = 'password']"));
        password.sendKeys("test");
        WebElement loginButton=driver.findElement(By.xpath("//input[@value = 'Login']"));
        loginButton.click();
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContentorderGrid']/tbody/tr"));
        for (int i = 0; i <rows.size() ; i++) {
            String rowText=rows.get(i).getText();
            System.out.println(rowText);

        }


    }


}
