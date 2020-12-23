package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class WebTables {
    public static void main(String[] args) {
        String url="http://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";
            WebDriver driver=new ChromeDriver();

         driver.navigate().to(url);
        List<WebElement> data=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(data.size());
        //System.out.println(data);
        Iterator<WebElement> it=data.iterator();
        while(it.hasNext()){
            WebElement row=it.next();
            String rowText=row.getText();
            System.out.println(rowText);
        }
    }
}
