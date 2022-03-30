package basics;

public class IfElseDemo_2 {

	public static void main(String[] args) {

		System.out.println("Starting of main method");
		
		displayGrade(120);
		
		System.out.println("ending of main method");
		
	}
	
	// display grade of student based on marks
	static void displayGrade(int marks){
		
		if(marks > 100) {
			System.out.println("Please check input");
		}else {			
			if(marks > 90) {
				System.out.println("A Grade");
				if(marks > 95) {
					 System.out.println("Have good sleep .. please dont read");
				}else {
					System.out.println("still there is some room to improve");
				}
			}else if(marks > 75) {
				System.out.println("B Grade");
				System.out.println("Try to improve");
			}else if(marks > 60) {
				System.out.println("C Grade");
				System.out.println("Have to improve");
			}else {
				System.out.println("D Grade");
				System.out.println("Concentrate more");
			}
		}
	}

}
