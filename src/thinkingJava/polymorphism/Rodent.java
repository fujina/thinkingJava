//: polymorphism/Rodent.java

package thinkingJava.polymorphism;

import static net.mindview.util.Print.*;

class Animals {
	void eat() {
	}
}

class Rodent extends Animals {
	void eat() {
	}

	public static void main(String[] args) {
		Mouse m = new Mouse();
		Gerbil g = new Gerbil();
		Hamster h = new Hamster();
		m.eat();
		g.eat();
		h.eat();
		m.eat("Rice");
		m.eat("Banana");
	}

}

class Mouse extends Rodent {
	void eat() {
		print("Mouse eating...");
	}
	void eat(String s) {
		if (s.equals("Rice")||s.equals("rice"))
			printf("I like Rice. \n");
		else
			printf("I don't like " + s + "\n");
			
	}
}

class Gerbil extends Rodent {
	void eat() {
		print("Gerbil eating...");
	}
}

class Hamster extends Rodent {
	void eat() {
		print("Hamster eating...");
	}
}
