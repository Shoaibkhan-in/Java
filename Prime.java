import java.util.*;
public class Prime {
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter How Many number you want to enter in array");
		n=sc.nextInt();
		int a[]=new int[n];
		boolean f=true;
		System.out.println("Enter the Data In Array To sort Prime Numbers");
		for (int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=2; j<a[i]-1; j++) {
				if(a[i]%j==0) {
					f=false;
					break;
				}
			}
			if(f) {
				System.out.println(a[i]);
			}
			f=true;
		}
	}
}