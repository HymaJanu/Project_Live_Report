package com.oopsInheritance;

public class MultiLevelChildClass extends MultiLevelPrentClass{ //in parent class we have properties where we can inherit and use the properties in child class
	
	//public class MultiLevelChildClass extends MultiLevelSubChildClass{ //in subchild we wont have any properties to inherit in child class

	static String name="Hyma";
	static int noofhouses=8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(noofhouses); //this output value inherits from parent
		noofhouses =7;
		System.out.println(noofhouses); //this output value overwritted withih the child class
		System.out.println(name); 
	}

}
