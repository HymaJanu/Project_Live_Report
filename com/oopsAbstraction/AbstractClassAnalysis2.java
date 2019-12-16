package com.oopsAbstraction;

public abstract class AbstractClassAnalysis2 { //no need of implementation of an interface

	int a=10; //Can have variables
	
	public void login() { //we can have normal methods
		System.out.println("Sucessfull login");
			
	}

	public void resetPassword() { //we can have normal methods
		System.out.println("Reset Password");
		
	}
	
	abstract void add(); //we can have abstract methods

	
public static void main(String[] args)
{
	//"Object class is not allowed" or "Object class is instantiate" in abstract class
	//AbstractClass2 ab=new AbstractClass2(); ----error :Cannot instantiate the type AbstractClass2
}
}

