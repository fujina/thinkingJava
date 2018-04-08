//: operator/Overflow.java

package thinkingJava.operators;

public class Overflow {

	public static void main(String[] args) {
		int big = 0x7fffffff; // max int value
		System.out.println("big    = " + big);
		int bigger = big * 4;
		System.out.println("bigger = " + bigger);
		
		
		System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

		System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
		System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);

		System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
		System.out.println("Float.MIN_NORMAL = " + Float.MIN_NORMAL);
		System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);

		System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
		System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);

	}

}/*output:
big    = 2147483647
bigger = -4
Integer.MIN_VALUE = -2147483648
Integer.MAX_VALUE = 2147483647
Long.MIN_VALUE = -9223372036854775808
Long.MAX_VALUE = 9223372036854775807
Float.MIN_VALUE = 1.4E-45
Float.MIN_NORMAL = 1.17549435E-38
Float.MAX_VALUE = 3.4028235E38
Double.MAX_VALUE = 1.7976931348623157E308
Double.MIN_VALUE = 4.9E-324
*/
