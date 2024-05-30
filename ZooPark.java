package Methodoverloading;
//Method Over Loading
public class ZooPark 
{
 public static void animals(String name1)
 {
	 System.out.println(name1);
 }
 public static void animals(String name2,String name3)
 {
	 System.out.println("******************");
	 System.out.println(name2);
	 System.out.println(name3);
 }
 public static void animals(String name4,String name5,String name6)
 {
	 System.out.println("******************");
	 System.out.println(name4);
	 System.out.println(name5);
	 System.out.println(name6);
	 
 }
 public static void main(String[] args) 
 {
	animals("Lion");
	animals("Tiger","Cheetah");
	animals("Monkey","Horse","Elephant");
}
}
//Developing two or more methods with the same method name but different arguments list is called Method overloading.
//For overloads methods , we can access specifier, Access Modifier,Run type Argument name.
// Method Overloading Depends on two factors
//1.All the method names must be same.
//2.Argument list should be different from method to method.
//The purpose of method overloading is perform same operation in multiple ways.
//Method over loading provides flexibility to the users that is user can choose , how to perform the operation.