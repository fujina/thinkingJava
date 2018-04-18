// :initialization/Flower.java
// Calling constructors with "this"

package thinkingJava.initialization;

import static net.mindview.util.Print.*;

public class Flower {
	int petalCount = 0;
	String s ="initial value";
	Flower(int petals){
		petalCount = petals;
		print("Constructor w/ int arg only, petalCount= " + petalCount);
		System.out.println("--------------------------------------");
	}
	Flower (String ss){
		print("Constructor w/ String arg only. s = " + ss);
		s = ss;
		System.out.println("--------------------------------------");
	}
	Flower(String s , int petals){
		this(petals);
		this.s=s;
		print("String & int args");
		System.out.println("--------------------------------------");
	}
	
	Flower(){
		this("hi", 47);
		print("default constructor (no args)");
		System.out.println("--------------------------------------");
	}
	void printPetalCount() {
		print("petalCount = " + petalCount + " s = " + s);
		System.out.println("--------------------------------------");
	}

	public static void main(String[] args) {
	Flower x = new Flower();
	x.printPetalCount();
	}
}
