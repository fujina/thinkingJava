//: typeinfo/AnonymousImplementation.java
// 在反射中匿名内部类不能被隐藏

package thinkingJava.typeinfo;
import thinkingJava.typeinfo.interfacea.*;
import static net.mindview.util.Print.*;
import java.lang.reflect.*;

class AnonymousA{
	public static A makeA() {
		return new A() {
			public void f() {print("public C.f()");}
			public void g() {print("public C.g()");}
			void u() {print("package C.u()");}
			protected void v() {print("protected C.v()");}
			private void w() { print("private c.w()");}
		};
	}
}

public class AnonymousImplementation {
	public static void main(String[] args) throws Exception{
		A a = AnonymousA.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		
		HiddenImplementation.callHiddenMethod(a, "g");
		HiddenImplementation.callHiddenMethod(a, "u");
		HiddenImplementation.callHiddenMethod(a, "v");
		HiddenImplementation.callHiddenMethod(a, "w");
	}
}/*output:
public C.f()
thinkingJava.typeinfo.AnonymousA$1
public C.g()
package C.u()
protected C.v()
private c.w()
*/
