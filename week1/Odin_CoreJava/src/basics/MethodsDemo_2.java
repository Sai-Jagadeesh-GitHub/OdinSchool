package basics;

public class MethodsDemo_2 {

	// ((a+b) * (c+d))/e 
	
	public static void main(String[] args) {

		System.out.println("starting  of main method");
		
		int a = 2;
		int b = 3;
		int c = 4;
		int d = 5;
		int e = 6;
		
		int r1 = addNumbers(a, b);
		int r2 = addNumbers(c, d);
		int r3 = multiplyNumbers(r1,  r2);
		
		double finalResult = division(r3, e);
		
		System.out.println("final result of operation is "+finalResult);
		System.out.println("ending of main method");
		
	}
	
	static int addNumbers(int num1, int num2){
		 System.out.println("input received to addNumbers method are "+num1+" and "+num2);
		 int result = num1 + num2;
		 return result;
	}

	static int multiplyNumbers(int num1, int num2){
		System.out.println("input received to multiplyNumbers method are "+num1+" and "+num2);
		int result = num1 * num2;
		return result;
	}
	
	static double division(int num1, int num2){
		System.out.println("input recieved to division are "+num1+" and "+num2);
		double result = num1/num2;
		return result;
	}
	
	
}
