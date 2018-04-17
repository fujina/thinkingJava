// :initialization/Dog.java

package thinkingJava.initialization;

import static net.mindview.util.Print.*;

public class Dog {
	Dog() {
		print("Hello!");
	}

	Dog(int i) {
		for (int j = 0; j < i; j++) {
			print("Bark!! ");
		}
	}

	Dog(String s) {
		print("My name is : " + s + " I am so angry, Howling!! Howling!! Howling!! ");
	}

	public static void main(String[] args) {
		new Dog();
		new Dog(7);
		new Dog("Tiger");
	}

}
