import java.util.*;

class Pen{
	String color;
	String type;
	public void Write() {
		
	System.out.println("writing something");	
	}
	public void print() {
		System.out.println(this.color);
		System.out.println(this.type);
	}
}



class Student{
	String name;
	int no;
	Scanner sc=new Scanner(System.in);
	/*public void getinfo() {
		System.out.println("Enter the Name Of Student and Roll no:-");
		name=sc.next();
		no=sc.nextInt();
	}*/
	public void print() {
		System.out.println(this.name);
		System.out.println(this.no);
	}//if we dont create constructor the default consructor intialisez by java
	/*Student(){//non- parameterised constructor
		System.out.println("Constructor Called");
	}*/
	/*Student(String name, int no){//parameterised consructor
		this.name=name;
		this.no=no;
	}*/
	//copy constructor
	
	Student(Student s2){
		this.name=s2.name;
		this.no=s2.no;
	}
	Student (){
		
	}
	
}
public class OOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shoaib s1=new Shoaib();
		s1.name="shoaib";
		s1.age=45;		
		s1.printInfo(s1.name, s1.age);
		
		
	}

}
//PolyMophism
//function overloading compile time morphism 
//function overriding run time morphism
// function overloading creating fuction with same name for specific task.
//this is also polymorphism
class Shoaib{
	 String name;
	 int age;
	 public void printInfo(String name) {
		 System.out.println(name);
	 }
	 public void printInfo(int age) {
		 System.out.println(age);
	 }
	 public void printInfo(String name, int age) {
		 System.out.println(name+""+age);
	 }
 }
//function overriding
