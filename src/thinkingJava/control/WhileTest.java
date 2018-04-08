//: control/WhileTest.java

package thinkingJava.control;

public class WhileTest {
	static boolean condition() {
		boolean result = Math.random() < 0.99;
		System.out.print("result < 0.99 = " + result + " \t  ");
		return result;
	}

	public static void main(String[] args) {
		int i = 1;
		while(condition())
			System.out.println(i++ + " : \tInside 'while'");
		System.out.println(i++ + " : \tExited 'while'");
	}
}/*output:
true 	  1 : 	Inside 'while'
true 	  2 : 	Inside 'while'
true 	  3 : 	Inside 'while'
true 	  4 : 	Inside 'while'
true 	  5 : 	Inside 'while'
true 	  6 : 	Inside 'while'
true 	  7 : 	Inside 'while'
true 	  8 : 	Inside 'while'
true 	  9 : 	Inside 'while'
true 	  10 : 	Inside 'while'
true 	  11 : 	Inside 'while'
true 	  12 : 	Inside 'while'
true 	  13 : 	Inside 'while'
true 	  14 : 	Inside 'while'
true 	  15 : 	Inside 'while'
true 	  16 : 	Inside 'while'
true 	  17 : 	Inside 'while'
true 	  18 : 	Inside 'while'
true 	  19 : 	Inside 'while'
true 	  20 : 	Inside 'while'
true 	  21 : 	Inside 'while'
true 	  22 : 	Inside 'while'
true 	  23 : 	Inside 'while'
true 	  24 : 	Inside 'while'
true 	  25 : 	Inside 'while'
true 	  26 : 	Inside 'while'
true 	  27 : 	Inside 'while'
true 	  28 : 	Inside 'while'
true 	  29 : 	Inside 'while'
false 	  30 : 	Exited 'while'
*/
