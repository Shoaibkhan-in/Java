interface Animal{
	void walk();//we cannot create non-abstract method in interfaces
	//we cannot initialize constructor in it
	/*
	 * the properties that are defined in interfaces are 
	 * static and final and public
	 * methods are abstract
	 */
}
interface Herbivore{
	//i can implement multiple interfaces in classes
	//multiple inheritance
}
class Horses implements Animal, Herbivore{
	public void walk() {
		System.out.println("Horse walks on 4 legs");
	}
}
public class Interfaces1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horses h1=new Horses();
		h1.walk();
	}

}
