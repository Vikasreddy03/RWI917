package com.jsp.encapsulation;

public class Test 
{
public static void main(String[] args) 
{
	Refrigerator rf = new Refrigerator();
	System.out.println(rf.getName());
	System.out.println(rf.getProductId());
	rf.setName("Samsung");
	rf.setProductId(199);
	System.out.println(rf.getName());
	System.out.println(rf.getProductId());
}
}
