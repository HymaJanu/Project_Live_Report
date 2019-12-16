package com.oopsPolymerphism;

public class Overloading { //same method names,same arguments with data types but different return types within a "class" ..overloading

	public static void main(String[] args) {
		Overloading ol=new Overloading();
		ol.add(10, 20);
		ol.add(1, 2, 3);
		//ol.add("Hyma", "Raj", "Xander", "janu");----datatype mismatch where argument datatypr is int so we need to pass integer values only
		ol.add(10, 20, 30, 40);
	}
	 void add(int a,int b)
	{
		System.out.println("Print two arguments with void return type");
		System.out.println(a+b);
	}
	public int add(int a,int b,int c)
	{
		System.out.println("Print Three arguments with integer return type");
		System.out.println(a+b);
		System.out.println(a+b+c);
		return a+b+c;
	}
		protected String add(int a,int b,int c,int d)
	{
		System.out.println("Print four arguments with string return type");
		System.out.println(a+b);
		System.out.println(a+b+c+d);
		return String.valueOf(a+b+c+d);
	}
	
}
