package com.jsp.Methods;

public class DemoMethod 
{

		public void print() {
			System.out.println("Playing Cricket");
		}
		
		public int sum() {
			return 2+78;
		}
		public String printWord(String name) {
			return name;
		}
		
		public static void printNumber(int num) {
			System.out.println(num);
		}
		public static void main(String[] args) {
			DemoMethod demo = new DemoMethod();
			demo.print();
			System.out.println(demo.sum());
			System.out.println(demo.printWord("Vikas Reddy"));
			
			DemoMethod.printNumber(70);
		}
	}

