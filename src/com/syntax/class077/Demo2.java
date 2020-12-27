package com.syntax.class077;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Demo2 {
    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "/Users/punchcode/eclipse-workspace/SeleniumTesting/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle(); // getting current window handle
        System.out.println(mainPageHandle);
        WebElement newTabButton = driver.findElement(By.xpath("//button[text()='New Tab']"));
        WebElement newWindowButton = driver.findElement(By.xpath("//button[@id='windowButton']"));
        WebElement newWindowMessage = driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
        newTabButton.click();
        Set<String> allWindowHandles = driver.getWindowHandles(); // will automatically return LInkedHashSet
        System.out.println(allWindowHandles.size());
        Iterator<String> it = allWindowHandles.iterator();
        String childWindow_1 = "";
        while (it.hasNext()) { // start iterating through handles
            String handle = it.next(); // get the next handle
            if (!handle.equals(mainPageHandle)) { // set a condition
                childWindow_1 = handle;
                String title = driver.getTitle();
                System.out.println(title);
                System.out.println(title.isEmpty());
            }
        }
        driver.switchTo().window(childWindow_1);
        Thread.sleep(2000);
        WebElement newTabText = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
        String textFromNewTab = newTabText.getText();
        System.out.println(textFromNewTab);
        driver.close();
        driver.switchTo().window(mainPageHandle);
        newWindowButton.click();
        allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        it = allWindowHandles.iterator();
        String childWindow_2 = "";
        while (it.hasNext()) {
            String handle = it.next();
            if (!handle.equals(mainPageHandle)) {
                childWindow_2 = handle;
                String title = driver.getTitle();
                System.out.println(title);
                System.out.println(title.isEmpty());
            }
        }
        driver.switchTo().window(childWindow_2);
        Thread.sleep(2000);
        WebElement newWindowText = driver.findElement(By.xpath("//h1[contains(text(), 'This is a sample page')]"));
        String textFromNewWindow = newWindowText.getText();
        System.out.println(textFromNewWindow);
        driver.close();
        Thread.sleep(2000);
        driver.switchTo().window(mainPageHandle);
        Thread.sleep(1000);
        newWindowMessage.click();
        allWindowHandles = driver.getWindowHandles(); // will automatically return LInkedHashSet
        System.out.println(allWindowHandles.size());
        it = allWindowHandles.iterator();
        String childWindow_3 = "";
        while (it.hasNext()) {
            String handle = it.next();
            if (!handle.equals(mainPageHandle)) {
                childWindow_3 = handle;
                String title = driver.getTitle();
                System.out.println(title);
                System.out.println(title.isEmpty());
            }
        }
        driver.switchTo().window(childWindow_3);
        Thread.sleep(2000);
    }
}