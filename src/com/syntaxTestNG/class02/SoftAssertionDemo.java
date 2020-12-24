package com.syntaxTestNG.class02;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SoftAssertionDemo {
    //As an admin, I should be able to login into HRMS.
    //logo displayed
    //users successfully logged in

    WebDriver driver;
    @BeforeMethod
    public void openAndNavigate ( ) {
        //System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        driver = new ChromeDriver( );
        driver.get ( "http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login" );
        driver.manage ( ).window ( ).maximize ( );
        driver.manage ( ).timeouts ( ).implicitlyWait ( 15, TimeUnit.SECONDS );
    }

    @AfterMethod
    public void closeBrowser ( ) {
        driver.quit ( );
    }
    @Test
    public void logoValidLogin(){
        WebElement element=driver.findElement(By.xpath("//*[@id='divLogo']/img"));
        SoftAssert softAssert =new SoftAssert();
        softAssert.assertTrue(element.isDisplayed(),"Logo is not displayed");
        String username="Admin";
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        WebElement welcomeText=driver.findElement(By.cssSelector("a#welcome"));
        softAssert.assertTrue(welcomeText.isDisplayed(),"Welcome message is not displayed");
        softAssert.assertEquals(welcomeText.getText(),"Welcome "+username);

}}
