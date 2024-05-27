abstract class Animals{
	abstract void walk();
	void eat() {
		System.out.println("all animals eat");
	}//we can use non-abstract methods in abstract class
	Animals(){//you can even create constructor in abstract class
		System.out.println("Youre creating new animal");
	}
}
/*
 * some time we need blue print of creating something 
 * to create its specimen 
 * but there's something in common it holds 
 * as it shape we don't know about it the perticular shape 
 * but we know that shape contains some attribute
 * similar thats why we create abstract class we has no specific priority 
 * but it holds as base to the creation
 */
class Horse extends Animals{
	Horse(){
		System.out.println("Youre creating new horse");
	}
	void walk() {
		System.out.println("Horse walks on 4 legs");
	}
}
class Chicken extends Animals{
	void walk() {
		System.out.println("Chicken walks on 2 legs");
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse horse=new Horse();
		horse.walk();
		horse.eat();
	}

}
