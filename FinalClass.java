package FinalKeyword;

final class FinalClass 
{
	
}
class FinalClass1 extends FinalClass {
	void run() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]) {
		FinalClass1 fs = new FinalClass1();
		fs.run();
	}

}

//compile time error

//Final Keyword in java -- The final keyword in java is used to restrict the user. The java final keyword can be used in many context. 
//Final can be:
//variable
//method
//class

//1) Java final class
//If you make any class as final, you cannot extend it.



