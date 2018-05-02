//: access/ChocolateChip.java
// protected 不可以在另的包中引用

package thinkingJava.access;

import thinkingJava.access.dessert.*;

public class ChocolateChip extends Cookie {
	public ChocolateChip() {
		System.out.println("ChocllateChip constructor");
	}

	public void chomp() {
		//bite(); //Can't access bite
	}

	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
	}
}
