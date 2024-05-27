
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		boolean f=true;
		for (int i=0; i<10; i++) {
			a[i]=Integer.parseInt(args[i]);
		}
		
		for(int i=0; i<10; i++) {
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
