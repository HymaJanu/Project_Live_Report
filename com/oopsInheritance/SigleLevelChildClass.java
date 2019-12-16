package com.oopsInheritance;

public class SigleLevelChildClass extends SigleLevelParentClass{

	//by using extends keyword we directly inherit parent class properties, without using object class we are using "extends"
	public static void main(String[] args) {
		
System.out.println(noofhouses);
System.out.println(noofcars); //----10

noofhouses=8; //overite properties value as 8 after inherit those properties from parent class
System.out.println(noofhouses);
	}

}
