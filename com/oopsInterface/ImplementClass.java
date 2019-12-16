package com.oopsInterface;

public class ImplementClass implements Interface,Interace2TestforMultipleInheritence{
	//for testing purpose...MultipleInheritence can be "implemented" by comma(,) operator in a class if both are interfaces only
	//instead of "implements" we cant replace with "extends" keyword ...that means class cannot extends two interface throw error..only implement is used
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******By object***********");
		//able to create object ?? Yes ....from this we can clearly say overriding happens with child class
		ImplementClass IC=new ImplementClass(); 
		IC.login();
		IC.forgetPassword();
		
		System.out.println("*******Refereance from parent class***********");
		//able to reference to parent class ?? Yes
		Interface p=new ImplementClass();
		p.resetPassword();
		p.sinUp(); //throws error if signup comment in parent ..from this we can clearly say overriding happens with parent class reference

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Sucessfull login");
		
	}

	@Override
	public void resetPassword() {
		// TODO Auto-generated method stub
		System.out.println("Reset Password");
		
	}

	@Override
	public void sinUp() {
		// TODO Auto-generated method stub
		System.out.println("Sin Up");
		
	}

	@Override
	public void forgetPassword() {
		// TODO Auto-generated method stub
		System.out.println("Forget Password");
		
	}

}
