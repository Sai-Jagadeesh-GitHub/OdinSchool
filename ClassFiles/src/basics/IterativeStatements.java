package basics;

public class IterativeStatements {

	public static void main(String[] args) {

		for(int i=10;  i < 3; i++) {
			System.out.println("hi hello "+i);
		}
		
		System.out.println();
		
		int j=10;
		while(j<=3) {
			System.out.println("inside while loop "+j);
		    j++;
		}
		
		System.out.println();
		
		int k=1;
		do {
			System.out.println("value of k in do while loop is "+k);
			k++;
		}while(k<=3);
		
	}

}

/*
for(int i=1;  i <= 3; i++) {
	System.out.println("hi hello");
}

i=1  --> i<=3  --> true  --> {  }  --> i++ --> i=2

i=2 --> 2<=3 ---> true --> {  }  --> i++  --> i=3

i=3 --> 3<=3  --> true  --> {   }  --> i++  --> i=4

i=4 --> 4<=3  --> false -----------------*/