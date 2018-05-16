//: polymorphism/PrivateOverride.java

package thinkingJava.polymorphism;

import static net.mindview.util.Print.*;

public class PrivateOverride {
	private void f() { // private 和 public决定了f()的输出  
		printf("private f()");		//非private才可以被覆盖
	}

	public static void main(String[] args) {
		PrivateOverride p = new Dervied();
		p.f();
	}
}

class Dervied extends PrivateOverride {
	public void f() {
		printf("public f()");
	}
}/*
	 * output: private f()
	 */
