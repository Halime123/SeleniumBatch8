package com.syntax.class077;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvencedWindowHandlle {

    public static String url = "http://syntaxtechs.com/selenium-practice/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement instagramButton=driver.findElement(By.linkText("Follow On Instagram"));
        WebElement facebookButton=driver.findElement(By.linkText("Like us On Facebook"));
        WebElement instagramAndFacebookButton=driver.findElement(By.linkText("Follow Instagram & Facebook"));

        instagramButton.click();
        facebookButton.click();
        instagramAndFacebookButton.click();

        Set<String> allWindowsHandle=driver.getWindowHandles();
        System.out.println(allWindowsHandle.size());
        Iterator<String> it=allWindowsHandle.iterator();
        while (it.hasNext()){
            String childHandle=it.next();
            driver.switchTo().window(childHandle);
            System.out.println(driver.getTitle());

        }
    }
}