package com.syntaxTestNG.class01;

import org.testng.annotations.*;

public class PreAndPostConditionAnnotaions {
    @BeforeClass
    public void beforeClass(){
        System.out.println("Iam a before class");
    }
    @Test
    public void testMethod(){
        System.out.println("I am a test method");
    }
    @Test
    public void testMethod2(){
        System.out.println("Iam a second test method");
    }
    @Test
    public void testMethod3(){
        System.out.println("Iam a third method");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am a before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am a after method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Iam a after class");
    }

}
