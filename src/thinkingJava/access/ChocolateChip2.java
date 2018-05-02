//: access/ChocolateChip2.java

package thinkingJava.access;

import thinkingJava.access.cookie2.*;

public class ChocolateChip2 extends Cookie {		//继承了Cookie的方法
	public ChocolateChip2() {
		System.out.println("ChocolateChip2 constructor");
	}

	public void chomp() {							//通过chomp方法 执行继承的protected的bite()
		bite();										//bite()是属于ChocolateChip2的,而不是Cookie的
	}

	public static void main(String[] args) {
		ChocolateChip2 x = new ChocolateChip2();
		x.chomp();
	}

}
