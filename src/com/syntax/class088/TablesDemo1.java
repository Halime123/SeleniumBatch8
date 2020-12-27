package com.syntax.class088;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Iterator;
import java.util.List;

public class TablesDemo1 {
    public static String url = "https://the-internet.herokuapp.com/tables";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);

        List<WebElement> rowData=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println(rowData.size());
        for (int i = 0; i <rowData.size() ; i++) {
            String rowText=rowData.get(i).getText();
            System.out.println(rowText);


        }
        Iterator<WebElement> rows=rowData.iterator();
        while (rows.hasNext()){
            WebElement row=rows.next();
            String rw=row.getText();
            System.out.println(rw);
        }


        List<WebElement> colsData=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
        System.out.println(colsData.size());
        Iterator<WebElement> cols=colsData.iterator();
        while (cols.hasNext()){
            WebElement col=cols.next();
            String cl=col.getText();
            System.out.println(cl);
        }

    }
}