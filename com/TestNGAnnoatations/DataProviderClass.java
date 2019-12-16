package com.TestNGAnnoatations;

import org.omg.CORBA.ObjectHolder;
import org.testng.annotations.DataProvider;
 
public class DataProviderClass 
{
    @DataProvider(name = "data-provider")
    public static Object[][] dataProviderMethod() 
    {
    	
    	//first way
    //return new Object[][] { { "Username","Password" }, { "Username1","Password1" },{"Username2","Password2"}};
    	
    	//second way
//    return new Object[][] {
//    new Object[] {"Username","Password"},
//    new Object[] {"Username1","Password1"},
//    new Object[] {"Username2","Password2"},
//    };
    	
    	//third way
    	Object[][] login= new Object[3][2];
    	//1st row
    	login[0][0]="Username";
    	login[0][1]="password";
    	//2nd row
    	login[1][0]="Username1";
    	login[1][1]="password1";
    	
    	//3rd row
    	login[2][0]="Username2";
    	login[2][1]="password2";
    	return login;
    }
    	
    	 @DataProvider(name = "data-provider1")
    	    public static Object[][] dataProviderMethod1() 
    	    {
    		 Object[][] login= new Object[3][2];
    	    	//1st row
    	    	login[0][0]="Username4";
    	    	login[0][1]="password4";
    	    	//2nd row
    	    	login[1][0]="Username5";
    	    	login[1][1]="password5";
    	    	
    	    	//3rd row
    	    	login[2][0]="Username6";
    	    	login[2][1]="password6";
    	    	return login;
    	    }
    	    
    }
