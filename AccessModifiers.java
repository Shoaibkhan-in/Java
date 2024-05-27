class C3{
	public String name;//The Public Which Is Accessible to everyone
	String name1;//default in this package only accessible to everyone
	protected String name2;//accessible to this package and only its subclasses
	private String password;//Accessible to only its define class
	//getters and setters is the method to access the private 
	
	void setPassword(String pass) {
		this.password=pass;
		System.out.println(pass);
	}
}
public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C3 stud=new C3();
		stud.name="Shoaib";
		stud.name1="Khan";
		stud.name2="pathan";
		stud.setPassword("Shoaib");
	}

}
