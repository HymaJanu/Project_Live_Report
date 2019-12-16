package com.oopsInheritance;

public class ConstructorInInheritance extends Constructor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor obj=new Constructor(); //super calls empty arguments from parent class if arguments passed
		//	Constructor obj=new Constructor(); 
		//without argumemts & if "parent class" not having zero arguments methods it will return error as 
		//Implicit super constructor Constructor() is undefined for default constructor. Must define an explicit constructor
	}
	

}
