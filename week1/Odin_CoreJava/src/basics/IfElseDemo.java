package basics;

public class IfElseDemo {

	public static void main(String[] args) {

		System.out.println("starting of main method");
		
		displayDesignation(7);
		
		System.out.println("ending of main method");
		
	}
	
	static void displayDesignation(int experience){
		if(experience <= 4) {
			System.out.println("I am working as Junior Level Software Engineer");
		} else if(experience <= 8) {
			System.out.println("I am working as Software Engineer");
		} else if(experience <= 12) {
			System.out.println("I am working as Senior Level Software Engineer");
		}else {
			System.out.println("I am working as Manager");
		}
	}

}

/*
if(condition) {
	  //
	//
}else {
	
}*/