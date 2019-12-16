package com.oopsPolymerphism;

public class OverriddingChild extends OverriddingParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//by "referring class" parent class in child by using Parent p=new child() syntax
		OverriddingParent op=new OverriddingChild();
        System.out.println(op.add(10, 20));	//com.oopsPolymerphism.Overriddingparent
        op.add(13, 12); //overriding values to the parent class
        
        //by using "object Class" we can override parent and we can execute from child class
        OverriddingChild obj=new OverriddingChild();
       System.out.println("I am testing overriding from Child");
        obj.add(45, 54);
        System.out.println(obj);

	}
	
}