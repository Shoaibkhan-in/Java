import java.util.*;
public class HelloWorld {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello world");
		String name="shoaib";
		int a=name.length();
		System.out.println(name.length());
		System.out.println(a);
		String name1="Shoaib";
		String name2="Khan";
		String name3= name1 +" And "+ name2;
		System.out.println(name3);
		System.out.println(name3.charAt(0));
		System.out.println(name3.replace("Shoaib", "Soyab"));
		String S="This Is String";
		System.out.println(S.substring(0,4));
		int[] array=new int[3];
		array[0]=7;
		array[1]=1;
		array[2]=4;
		System.out.println(array.length);
		System.out.println(array[0]);
		Arrays.sort(array);
		System.out.println(array[0]);
		System.out.println("normal Array");
		int[] marks= {2,3,4,5,6,7};
		System.out.println("2 dimentional Array");
		int[][] one= {{3,4,2,5},{3,4,2,5}};
		System.out.println(one[0][0]);
		//typecasting
		double d=1234.693;
		int i=18;
		int finalPrice=(int)d+i;
		System.out.println(finalPrice);
		// for making constant element 
		final float PI=3.14F;
		//Arithmetic operators 
		int c=5;
		int b=10;
		int sum=a+b;
		int mul=a*b;
		int sub=a-b;
		float div=(float)a/(float)b;
		System.out.println("The add"+sum+"the multiplication"+mul+"The sub"+sub+"the div"+div);
		int num=1;
		num++;
		System.out.println(num);
		//math class inbuild methods
		System.out.println(Math.max(3, 4));
		System.out.println(Math.min(3, 4));
		System.out.println((int)(Math.random()*100));
		//input in java 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the int float and string data:- ");
		int num1=sc.nextInt();
		float num2=sc.nextFloat();
		String name5=sc.next();
		String line=sc.nextLine();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(name5);
		System.out.println(line);
		//for the line as an input 
		boolean IsSunUp=true;
		if(IsSunUp==true) {
			System.out.println("day");
		}
		else {
			System.out.println("night");
		}
		
		if(!IsSunUp)
			System.out.println("night");
		else
			System.out.println("day");
		}
		}


