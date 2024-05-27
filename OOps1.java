//inheritance
//Single level inheritance
class Shape{
	public void area() { 
	System.out.println("This is area");
	}
}
class Triangle extends Shape{
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}
//multilevel inheritance
class EquilateralTriangle{
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}
//heirarcial inheritance 
//in this heritance the sub class or parents class object has been used
//by many other class 
class Circle extends Shape{
	public void area(int r) {
		System.out.println((3.14)*r*r);
	}
}
//hybrid inheritance in which all of the inheritance are working are called
// hybrid inheritance above written classes are also example of hybrid inheritance
//c++ multiple inheritance this not exist in java.

public class OOps1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1=new Triangle();
		System.out.println("hi");
	}

}
