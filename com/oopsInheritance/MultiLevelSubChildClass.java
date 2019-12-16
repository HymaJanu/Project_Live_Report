package com.oopsInheritance;
public class MultiLevelSubChildClass extends MultiLevelChildClass{//yes we can child class to subchild class
//public class MultiLevelSubChildClass extends MultiLevelPrentClass{ //yes we can access direct parent class properties to subchild class as well 
	
	public static void main(String[] args) {
		
System.out.println(noofhouses);//parent class porperties ...& i have change this value in child class as 8 in class level and i have overwitted as 8 in method level it wont accepted method level 
//output is childclass level as 8
System.out.println(name); //child class properties ..both child & parent class porperties are accessing or inherits in subchild class
	}

}
