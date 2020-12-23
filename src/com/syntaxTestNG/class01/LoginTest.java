package com.syntaxTestNG.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;
    @BeforeMethod
    public void openAndNavigate(){
        driver=new ChromeDriver();
        driver.get("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Test
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
    @Test
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
