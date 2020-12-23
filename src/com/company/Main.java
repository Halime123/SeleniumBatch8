package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello");
        WebDriver obj=new ChromeDriver();
        obj.get("https:/www.google.com");
    }
}
