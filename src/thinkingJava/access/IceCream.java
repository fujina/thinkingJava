//: access/IceCream.java

package thinkingJava.access;

class Sundae{
	private Sundae() {}
	static Sundae makeASundae() {
		return new Sundae();
	}
}

public class IceCream {

	public static void main(String[] args) {
		//Sundae x = new Sundae();		 //这个Sundae因为是private,是无法直接访问的
		Sundae x = Sundae.makeASundae();

	}

}
