//: typeinfo/FamilyVsExactType.java

package thinkingJava.typeinfo;

import static net.mindview.util.Print.*;

class Base {
}

class Derived extends Base {
}

public class FamilyVsExactType {
	static void test(Object x) {
		print("Testing x of type " + x.getClass());
		print("x instance of Base " + (x instanceof Base));
		print("x instance of Derived " + (x instanceof Derived));
		print("Base. isInstance(x) " + Base.class.isInstance(x));
		print("Derived.isInstance(x)" + Derived.class.isInstance(x));
		print("x.getClass() == Base.class " + (x.getClass() == Base.class));
		print("x.getClass().equals(Base.class)) " + (x.getClass().equals(Base.class)));
		print("x.getClass().equals(Derived.class)) " + (x.getClass().equals(Derived.class)));
	}

	public static void main(String[] args) {
		test(new Base());
		System.out.println("-----------------------------------------");
		test(new Derived());
	}
}/*output:
Testing x of type class thinkingJava.typeinfo.Base
x instance of Base true
x instance of Derived false
Base. isInstance(x) true
Derived.isInstance(x)false
x.getClass() == Base.class true
x.getClass().equals(Base.class)) true
x.getClass().equals(Derived.class)) false
-----------------------------------------
Testing x of type class thinkingJava.typeinfo.Derived
x instance of Base true
x instance of Derived true
Base. isInstance(x) true
Derived.isInstance(x)true
x.getClass() == Base.class false
x.getClass().equals(Base.class)) false
x.getClass().equals(Derived.class)) true
*/
