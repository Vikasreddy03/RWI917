package FinalKeyword;

public class FinalVariable {
	 
	final int speedLimit=90;
	void run() {
		speedLimit=400;//compile time error
	}
	public static void main(String[] args) {
		FinalVariable b=new FinalVariable();
		b.run();
		
		}
}

//3) Java final variable
//If you make any variable as final, you cannot change the value of final variable(It will be constant).