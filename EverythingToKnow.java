import java.util.*;

public class EverythingToKnow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the no to get the day");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		// for n=1-monday and so on according to days
		
		switch(n) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		default:
			System.out.println("Friday-sunday");
			break;
		}

}
}