package basics;

public class SwitchDemo {

	public static void main(String[] args) {

		System.out.println("Starting of main method");
		
		displayWeekName(70);
		
		System.out.println("Ending of main method");
		
	}
	
	// display weekname based on week number 1 --> monday 2 --> tuesday .... 7 --> sunday
	static void displayWeekName(int dayNo){
		
		switch(dayNo) {
			case 1 :
				System.out.println("Today is Monday");
				System.out.println("start of fresh week");
				break;
			case 2 :
				System.out.println("Today is Tuesday");
				break;
			case 3 :
				System.out.println("Today is Wednesday");
				break;
			case 4 : 
				System.out.println("Today is Thursday");
				break;
			case 5 :
				System.out.println("Today is Friday");
				break;
			case 6 :
				System.out.println("Today is Saturday");
				break;
			case 7 :
				System.out.println("Today is Sunday");
				break;
			default :
				System.out.println("Please check input provided");
		}
		
	}

}
