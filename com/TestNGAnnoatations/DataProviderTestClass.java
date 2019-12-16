package com.TestNGAnnoatations;

import org.testng.annotations.Test;

public class DataProviderTestClass 
{
    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
    public void testMethod(String username,String password) 
    {
        System.out.println("UserData is : " + username);
        System.out.println("PasswordData is: " + password);
    }
    @Test(dataProvider = "data-provider1", dataProviderClass = DataProviderClass.class)
    public void testMethod1(String username,String password) 
    {
        System.out.println("UserData is : " + username);
        System.out.println("PasswordData is: " + password);
    }
}