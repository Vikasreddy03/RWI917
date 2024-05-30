package Methodoverriding;
//Method Over Riding
public class MainClass6 
{
public static void main(String[] args) 
{
	Circle c = new Circle();
	Rectangle r = new Rectangle();
	Triangle t = new Triangle();
	c.dimensions();
	r.dimensions();
	t.dimensions();
}
}
//After the inheritance Process,subclass can change he method Implementation of the inherited method (Seperated copy)
//This process is called Method Over Riding.
//Method Over Riding depends on two factors.
//1.Inheritance must
//2.Subclass should maintenance the same method signature present in super class.
//Method overriding is not mandatory rather it depends on the requirements.
//Super class method it can be over hidden any level of sub class.
//Advantages of Method Over Riding
//1.To makes changes to method implementation of inherited method for a particular subclass without effecting other subclasses.
//2.Abstract
//3.Interface
//4.Polymorphism
//5.Abstraction
