//: reusing/FinalOverridingIllusion.java

package thinkingJava.reusing;

import static net.mindview.util.Print.*;

class WithFinals {
	private final void f() {
		print("WithFinals f()");
	}

	private void g() {
		print("WithFinals g()");
	}

	protected void h() {
		print("protected h()");
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		print("OverridingPrivate.f()");
	}

	private void g() {
		print("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		print("OverridingPrivate2.f()");
	}

	public void g() {
		print("OverridingPrivate2.g()");
	}
}

public class FinalOverridingIllusion {

	public static void main(String[] args) {

		OverridingPrivate op = new OverridingPrivate();
		op.h(); // 没有g(),和f()
		// op.g(); //The method g() from the type OverridingPrivate is not visible
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		op2.h();
		WithFinals wf = op2;
		// wf.g(); //The method g() from the type WithFinals is not visible
		wf.h();
		// 没有wf.g(),
		// 没有wf.h();
	}
}/*
	 * output: protected h() protected h() OverridingPrivate2.f()
	 * OverridingPrivate2.g() protected h()
	 */
