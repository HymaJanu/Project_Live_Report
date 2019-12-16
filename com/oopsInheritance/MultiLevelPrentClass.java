package com.oopsInheritance;

public class MultiLevelPrentClass{
	//public class MultiLevelPrentClass extends MultiLevelChildClass{ //multilevelparent inconsistent in parent class

	static int noofhouses=10; //we called here varaibles as properties like noofhouses, noofcars
	static int noofcars=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(noofcars);
		//System.out.println(name); // we caant access child class in parent class

	}

}
