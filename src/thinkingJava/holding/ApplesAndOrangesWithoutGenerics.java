//: holding/ApplesAndOrangesWithoutGenerics.java

package thinkingJava.holding;

import java.util.*;

class Apple {
	private static long counter;
	private final long id = counter++;

	public String id() {
		// return id;
		return "Apple " + this.id;
	}
}

class Orange {
}

public class ApplesAndOrangesWithoutGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for (int i = 0; i < 7; i++)
			apples.add(new Apple());
		// thinkingJava.holding.Orange cannot be cast to thinkingJava.holding.
		// Apple at thinkingJava.holding.ApplesAndOrangesWithoutGenerics.main
		// apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++)
			System.out.println(((Apple) apples.get(i)).id());
	}
}/*output:
Apple 0
Apple 1
Apple 2
Apple 3
Apple 4
Apple 5
Apple 6
*/
