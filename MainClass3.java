package com.jsp.polymorphism;
//Runtime Polymorphism
public class MainClass3 
{
	public static void sound(Animal a)
	{
		a.noise();
	}
public static void main(String[] args) 
 {
	sound(new Lion());
	sound(new Tiger());
	sound(new Cheetah());
 }
}
