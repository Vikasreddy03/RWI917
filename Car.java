package com.jsp.Interface;

//Interface

public class Car implements Vehicle
{
	@Override
	public void type() {
		// TODO Auto-generated method stub
		System.out.println("Car");
	}
public static void main(String[] args)
{
	Vehicle v = new Car();
	v.type();
}
}
/**
 * A class extends to another class. An interface extends another interface. 
 * But, a class also always implements single or multiple interfaces with the 
 * keyword “implements” and all its methods.
 */
