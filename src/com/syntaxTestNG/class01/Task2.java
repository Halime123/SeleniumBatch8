package com.syntaxTestNG.class01;

import org.testng.annotations.*;

public class Task2 {
    @BeforeClass
    public void beforeClass(){
        System.out.println("excute me first");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("excute me after class");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("excute me after test");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("excute me last");
    }
    @Test
    public void test1(){
        System.out.println("Iam a test1");
    }
    @Test
    public void test2(){
        System.out.println("Iam a test2");
    }
}
