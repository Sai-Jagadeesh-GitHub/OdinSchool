package basics;

public class MethodsDemo {

	public static void main(String[] args) {

		System.out.println("Starting of main method");
		
		double r = addNumbers(2, 3.5);
		System.out.println("value received to main method is "+r);
		
		System.out.println("ending of main method");
		
	}
	
	// add 1 integer and 1 decimal value and return decimal value as output
	static double addNumbers(int num1, double num2){
		System.out.println("input received are "+num1+" and "+num2);
		double result = num1 + num2;
		return result;  // return 5.5
	}

}
