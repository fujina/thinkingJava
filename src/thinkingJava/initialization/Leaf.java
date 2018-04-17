//: initialization/Leaf.java
// Simple use of the "this"	 keyword.

package thinkingJava.initialization;

public class Leaf {
	int i = 0;
	Leaf increament() {
		i++;
		return this;			//因为有了 return this
	}
	void print() {
		System.out.println("i = " + i);
	}

	public static void main(String[] args) {
		Leaf x = new Leaf();
		x.increament().increament().increament().print();	//所以才能不断的".increment()"
		Leaf y = x.increament().increament();
		y.print();
	}
}
