//: initialization/Constructor1.java

package thinkingJava.initialization;

import static net.mindview.util.Print.*;
import java.util.Scanner;

class Happy {
	Happy() {
		print("I am very happy.");
	}

	Happy(String s) {
		print("I will goto " + s);
	}
}

public class Constructor1 {

	public static void main(String[] args) {
		new Happy();
		Scanner str = new Scanner(System.in);
		String s;
		System.out.println("What do you like? ");
		s = str.next();
		new Happy(s);
		str.close();
	}
}
