interface shape1{
	abstract void area(int h, int b);
}
class S1 implements shape1{
	public void area(int h,int b) {
		int a=(1/2)*b*h;
		System.out.println("the area of traingle is"+a);
	}
	void function() {
		System.out.println("Hello world");
	}
	
	public static void main(String[] args){
		
		System.out.println("hello world");
		S1 s=new S1();
		s.area(4, 5);
	}
}