package basics;

public class Switch_String {
	
	
	static void displayCourseInfo(String course){
		
		switch(course) {
			case "Java" :
				System.out.println("Java is a server side programming language");
				System.out.println("We use java to build desktop or web applications");
				System.out.println("Java is robust due to its exception handling ");
				break;
			case "SQL" :
				System.out.println("SQL stands for Structured Query Language");
				System.out.println("We use SQL to communicate with database");
				System.out.println("SQL keyword may change with respect to database vendors");
				break;
			case "HTML" :
				System.out.println("HTML stands for Hyper Text Mark up Language");
				System.out.println("We use HTML to develop static web pages");
				System.out.println("Using HTML we communicate with browser");
				break;
			default :
				System.out.println("Please check input provided");
		}
		
	}


	public static void main(String[] args) {

		System.out.println("Starting of main method");
		
		displayCourseInfo("SQL");
		
		System.out.println("Ending of main method");
		
	}

}
