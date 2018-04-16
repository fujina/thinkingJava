//: operator/CastingNumbers.java

package thinkingJava.operators;

public class CastingNumbers {

	public static void main(String[] args) {
		double above = 0.7, below = 0.4;
		System.out.println("above: " + above);
		System.out.println("below: " + below);
		System.out.println("(int)above: " + (int)above);
		System.out.println("(int)below: " + (int)below);
		System.out.println("(char)('a' + above): " + (char)('a' + above));
		System.out.println("(char)('a' + below): " + (char)('a' + below));
	}
}/*output:
above: 0.7
below: 0.4
(int)above: 0
(int)below: 0
(char)('a' + above): a
(char)('a' + below): a
*/