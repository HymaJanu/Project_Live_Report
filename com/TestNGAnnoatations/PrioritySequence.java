package com.TestNGAnnoatations;

import org.testng.annotations.Test;

public class PrioritySequence {

		@Test(priority=1)
		public static void p2() //p2..it got printed first with priority
		{
			int a=20;
			int b=10;
			System.out.println(a+b);
		}
		@Test(priority=2)
		public static void p1()
		//p1..it got printed first without priority num as it consider aplhabets
		{
			int a=20;
			int b=30;
			System.out.println(a+b); 
		}
		@Test(priority=3)
		public static void p3() 
		{
			int a=50;
			int b=30;
			System.out.println(a+b);
		}
	
}
