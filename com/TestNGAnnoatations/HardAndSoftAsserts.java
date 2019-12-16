package com.TestNGAnnoatations;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAsserts {
	SoftAssert sa=new SoftAssert();
	
	//HardAssertation
	@Test()
	public void hardassert1()
	
	{
		int a=2;
		int b=3;
		assertEquals(a,b);
		System.out.println("hardassert is inCorrect"); 
		//when test case failed in Hardassert ...it wont print ..when actual is not equals to expected ..
	}
	
	@Test()
public void hardassert2()
	
	{
		int a=3;
		int b=3;
		assertEquals(a,b);
		System.out.println("hardassert is Correct");
	}
	
	//SoftAssertation
	@Test()
	public void softassert1()
	
	{
		int a=2;
		int b=3;
		sa.assertEquals(a,b);
		System.out.println("softassert is inCorrect");
		//when test case failed in softassert ...it will print ..when actual is not equals to expected ...even though test case is failed
	}
	
	@Test()
public void softassert2()
	
	{
		int a=3;
		int b=3;
		sa.assertEquals(a,b);
		System.out.println("softassert is Correct");
	}
	
	
}
