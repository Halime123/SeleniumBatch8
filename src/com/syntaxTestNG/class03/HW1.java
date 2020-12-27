package com.syntaxTestNG.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HW1 {
    WebDriver driver;

    @BeforeMethod()
    public void openAndNavigate() {
        driver = new ChromeDriver();
        driver.navigate().to("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterMethod()
    public void closeBrowser() {
        driver.quit();
    }
    @Test(dataProvider ="loginData", groups = "regression")
    public void multipleLogin(String username, String password) throws InterruptedException {
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(By.id("btnLogin")).click();
        WebElement welcomeMessage = driver.findElement(By.cssSelector("a#welcome"));
        Thread.sleep(3000);
        Assert.assertTrue(welcomeMessage.isDisplayed(), "Welcome message is not displayed");
    }
    @DataProvider
    public Object[][] loginData() {
        String[][] data = new String[5][2];
        data[0][0] = "Emine";
        data[0][1] = "Syntax123!";
        data[1][0] = "Selma";
        data[1][1] = "Syntax123!";
        data[2][0] = "Gunel";
        data[2][1] = "Syntax123!";
        data[3][0] = "Ayse";
        data[3][1] = "Syntax123!";
        data[4][0] = "Fatma";
        data[4][1] = "Syntax123!";

        return data;
    }

}