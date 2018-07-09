//: typeinfo/packageaccess/HiddenC.java

package thinkingJava.typeinfo.packageaccess;
import thinkingJava.typeinfo.interfacea.*;
import static net.mindview.util.Print.*;

class C implements A{
	public void f() {print("public C.f()");}
	public void g() {print("public C.g()");}
	void u() {print("package c.u()");}
	protected void v() {print("protected C.v()");}
	private void w() {print("private C.w()");}
}

public class HiddenC {
	public static A makeA() {
		return new C();
	}
}
