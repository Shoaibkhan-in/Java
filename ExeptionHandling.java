class NotEligible extends Exception{
	public NotEligible() {
		System.out.println("Youre Not eligible for voting");
	}
}
public class ExeptionHandling {
	public static void main(String[] args) throws NotEligible {
		// Try And Catch In Exception Handling
		try {
		int a=5;
		int b=0;
		int div=a/b;
		
		System.out.println("The Div Of Two No Is"+div);
		}
		catch(ArithmeticException ae){
			System.out.println("cannot divide by zero");
		}
		System.out.println("The Name of the student is ");
		try {
			int[] marks= {67,4,3,6,7};
			System.out.println("The Array Index Is "+marks[10]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("The Array Indexing is Wrong");
		}

	}
}
