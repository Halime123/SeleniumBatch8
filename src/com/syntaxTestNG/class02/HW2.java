package com.syntaxTestNG.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class HW2 {
    WebDriver driver;
    @BeforeMethod
    public void openAndNavigateBrowser(){
        driver=new ChromeDriver();
        driver.navigate().to("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test
    public void loginToApplication(){
        SoftAssert softAssert =new SoftAssert();
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton=driver.findElement(By.id("btnLogin"));
        loginButton.click();
        WebElement pimButton=driver.findElement(By.xpath("//b[contains(text(),'PIM')]"));
        pimButton.click();
        WebElement addEmployee=driver.findElement(By.xpath("//a[text() = 'Add Employee']"));
        addEmployee.click();
        //WebElement fullName=driver.findElement(By.xpath("//label[contains(text(),'Full Name')]"));
        //softAssert.assertTrue(fullName.isDisplayed());


        WebElement employeeID=driver.findElement(By.xpath("//label[contains(text(),'Employee Id')]"));
        softAssert.assertTrue(employeeID.isDisplayed());

        WebElement photograph=driver.findElement(By.xpath("//label[contains(text(),'Photograph')]"));
        softAssert.assertTrue(photograph.isDisplayed());

        WebElement firstName=driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("Halime");

        WebElement lastName=driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("Cobanli");

        WebElement addPhoto=driver.findElement(By.xpath("//input[@id='photofile']"));
        addPhoto.click();

        driver.findElement(By.xpath("//input[@id='btnSave']")).click();

        String expectedFullName="Halime Cobanli";
        String fullNmae=driver.findElement(By.xpath("//h1[text()='Halime Cobanli']")).getText();
        softAssert.assertTrue(expectedFullName.equals(fullNmae));







    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }


}
