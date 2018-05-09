//: reusing/Lisa.java

package thinkingJava.reusing;

import static net.mindview.util.Print.*;

class Creature {
	void Say() {
		print("zi...zi...zi...");
	}
}

class Monkey extends Creature {
	void Say() {
		print("banana...banana...banana...");
	}
}

class People extends Monkey {
	void Say() {
		print("Hello, Nice to meet you.");
	}
}

public class Lisa {

	public static void main(String[] args) {
		Creature c = new Creature();
		c.Say();
		Monkey m = new Monkey();
		m.Say();
		People p = new People();
		p.Say();
	}
}/*output:
zi...zi...zi...
banana...banana...banana...
Hello, Nice to meet you.
*/
