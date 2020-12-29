package com.syntaxTestNG.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class LoginTest extends CommonMethods {
    WebDriver driver;
    @BeforeMethod
    public void openAndNavigate() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(5000);

    }
    @Test(groups = "smoke")
    public void validAdminLogin(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        WebElement welcomeMessage = driver.findElement(By.cssSelector("a#welcome"));
        if (welcomeMessage.isDisplayed()){
            System.out.println("Test pass");
        }else {
            System.out.println("Test fail");
        }

    }
    @Test(groups = "regression")
    public void testTitle(){
        String expectedTitle="Human Management System";
        String actualTitle=driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title is valid");
        }else{
            System.out.println("Title is not matched");
        }
    }
    @AfterMethod
    public void close(){
        driver.close();
    }
}
