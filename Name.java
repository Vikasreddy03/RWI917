package com.jsp.multiple_inheritance;
//Multiple Inheritance
public class Name implements Employee, Student
{

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("Test User");
	}

	public static void main(String[] args) 
	{
		Name n= new Name ();
		n.printName();
	}
}
/*
 * Multiple Inheritance is not supported in the case of a class because of ambiguity. But, it is supported 
 * in the case of interfaces because the same method coming from different interfaces in a child class using 
 * multiple inheritance will always have a single definition.
 */


