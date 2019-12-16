package com.TestNGAnnoatations;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class AlwaysRun {
	
	@Test(alwaysRun=true)//false and true functionality are same ..both output got printed
	public static void p1()
	{
		System.out.println("AlwaysRun when true");
	}
	
	@Test(alwaysRun=false)
	public static void p2()
	{
		System.out.println("AlwaysRun when flase");
	}
	
	@Test(alwaysRun=true) 
	public static void always()
	{
		int a=2;
		int b=3;
		assertEquals(a,b); 
		//even it got failed but no failed or error meessage is dispalyed and no output statement got printed
		System.out.println("Hyma");
	}
	@Test(alwaysRun=false)
	public static void run()
	{
		int a=3;
		int b=3;
		assertEquals(a,b);
		System.out.println("HymaJanu");
	}


}
