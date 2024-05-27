import java.util.*;
public class Loops {

	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			System.out.println(i);
		}
		int j=100;
		while(j>0) {
			System.out.println(j);
			j=j-1;
		}
		do {
			System.out.println(j);
			j--;
		}while(j>0);
		Scanner sc=new Scanner(System.in);
		int number=0;
		do {
			System.out.println("Enter the number");
			number=sc.nextInt();
			System.out.println(number);
		}while(number>=0);
		//break and continue
		int k=0;
		while(true) {
			
			k=k+1;
			System.out.println(k);
			if(k==5) {
				System.out.println("you have reached to 5");
				continue;
			}
			if(k==100) {
				System.out.println("You have reached to mark 100");
				break;
			}
		}
	}
}
