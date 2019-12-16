package com.oopsInheritance;

public class SigleLevelParentClass {

	
static int noofhouses=10; //we called here varaibles as properties like noofhouses, noofcars
static int noofcars=5;

public static void main(String[] args) {
	
	noofhouses=6; 
	//note:: parent can overwrite his own properties where as child cant overwrite parent properties until child inherits ..child properties can overwrite after inherits within the child class & child class cannot change parents properties even child class inherits
System.out.println(noofhouses);
}
}
