package com.syntaxTestNG.class02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnDemo {
    @Test(priority = 1)
    public void login() {
        System.out.println("test1");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "login")//when only login, following test case will
                                        //executed
    public void addEmployee() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }
}

