package com.oopsInheritance;

public class Constructor { //note: constructor classname should be methodsname
Constructor()
{
	//this("hyma");
	System.out.println("zero argument constructor");
}

Constructor(String name)
{
	//this("hyma","janu");
	System.out.println("single argument constructor");

}
Constructor(String name1,String name2)
{
	
System.out.println("Multiple arugmnets constructor");	
}

public static void main(String[] args) {
	
	Constructor obj=new Constructor("hyma");
	//Constructor obj=new Constructor("hyma","janu");
	//Constructor obj=new Constructor();
}
}



