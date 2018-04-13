//: initialization/OverloadingOrder.java
package thinkingJava.initialization;

import static net.mindview.util.Print.*;

public class OverloadingOrder {
	static void f(String s, int i) {
		print("String: " + s + ". int: " + i);
	}

	static void f(int i, String s) {
		print("int: " + i + " String: " + s);
	}

	public static void main(String[] args) {
		f("String first", 11);
		System.out.println();
		f(99, "Int first");
	}
}/* output:
String: String first. int: 11

int: 99 String: Int first

*/
