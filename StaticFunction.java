package com.ajith;



public class StaticFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnotherClass obj=new AnotherClass();
		AnotherClass obj1=new AnotherClass();
		
		System.out.println(obj.integer);
		System.out.println(obj1.integer);
		
		obj.integer=obj.integer+1;
		
		System.out.println(obj.integer);
		System.out.println(obj1.integer);

	}

}
