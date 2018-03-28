package thinkingJava.operators;
//: operators/Literals.java

public class Literals {
	public static void main(String[] args) {
		int i1 = 0x2f;
		System.out.println("i1: " + Integer.toBinaryString(i1));
		int i2 = 0X2F;
		System.out.println("i2: " + Integer.toBinaryString(i2));
		int i3 = 0117;
		System.out.println("i3: " + Integer.toBinaryString(i3));
		char c = 0xfff;
		System.out.println("c: " + Integer.toBinaryString(c));
		byte b = 0x7f;
		System.out.println("b: " + Integer.toBinaryString(b));
		short s = 0x7fff;
		System.out.println("s: " + Integer.toBinaryString(s));
		long n1 = 200l;
		long n2 = 200l;
		long n3 = 200;
		float f1 = 1;
		float f2 = 1F;
		float f3 = 1f;
		double d1 = 1d;
		double d2 = 1D;
	}
}
/*output
i1: 101111
i2: 101111
i3: 1001111
c: 111111111111
b: 1111111
s: 111111111111111
*/
