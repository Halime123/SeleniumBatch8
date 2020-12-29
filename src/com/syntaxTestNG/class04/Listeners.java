package com.syntaxTestNG.class04;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    public void onTestStart(ITestResult result){
        System.out.println("Starting test with name"+result.getName());//returns the names of the test method
    }
    public void onTestSuccess(ITestResult result){
        System.out.println("Test passed. We are taking screenshot");
    }
    public void onTestFailure(ITestResult result){
        System.out.println("Test failed we are taking screenshot");
    }
    public void onTestSkipped(ITestResult result){
        System.out.println("Finishing test with name"+result.getName());
    }


}
