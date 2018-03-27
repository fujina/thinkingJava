//: operators/Bool.java
// Relational and logical operators.
package thinkingJava.operators;

import java.util.*;

public class Bool {

	public static void main(String[] args) {
		Random rand = new Random(47);
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("i > j is " + (i > j));
		System.out.println("i < j is " + (i < j));
		System.out.println("i >= j is " + (i >= j));
		System.out.println("i <= j is " + (i <= j));
		System.out.println("i == j is " + (i == j));
		System.out.println("i != j is " + (i != j));

		System.out.println("(i < 57) && (j < 57) is " + ((i < 57) && (j < 57))); // and
		System.out.println("(i < 57) || (j < 57) is " + ((i < 57) || (j < 57))); // or
	}

}/*Output:
i = 58
j = 55
i > j is true
i < j is false
i >= j is true
i <= j is false
i == j is false
i != j is true
(i < 57) && (j < 57) is false
(i < 57) || (j < 57) is true
*/
