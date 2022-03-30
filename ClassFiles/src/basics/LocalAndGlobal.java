package basics;

public class LocalAndGlobal {
	
	static int marks = 80;

	public static void main(String[] args) {

		String course = "html";
		System.out.println(course);
		
		System.out.println(marks);
		
	}
	
	// write a method with name m1 with no input values and no return type
	static void m1(){
		System.out.println(marks);
		//System.out.println(course);
	}

}
