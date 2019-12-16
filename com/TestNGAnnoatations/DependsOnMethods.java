package com.TestNGAnnoatations;

import org.testng.annotations.Test;

public class DependsOnMethods{

@Test(dependsOnMethods="depends") //imp --**dependencies on other test case***
public static void method()
{
	int a=20;
	int b=10;
	System.out.println(a+b);
}
//@Test(enabled=false,priority=1(priority is not mandatory) 
//failed because enabled =false ..dependency method got failed..as this testcase ignore
@Test(enabled=true)
//it got executed and so dependency method is also got executed
public static void depends() 
{
	int a=20;
	int b=30;
	System.out.println(a+b);
}
}
