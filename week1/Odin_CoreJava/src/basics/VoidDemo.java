package basics;

public class VoidDemo {

	public static void main(String[] args) {

		System.out.println("starting of main method");
		
		addNumbers(3, 5);
		
		System.out.println("ending of main method");
		
	}
	
	// add given 2 input integer values and display the result
	static void addNumbers(int num1, int num2){
		System.out.println("input received are "+num1+" and "+num2);
		int result = num1+num2;
		System.out.println("result is "+result);
	}

}
