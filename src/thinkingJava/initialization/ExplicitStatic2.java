//: initialization/ExplicitStatic2.java

package thinkingJava.initialization;

import static net.mindview.util.Print.*;

class Cup2 {
	Cup2(int marker) {
		print("Cup2(" + marker + ")");
	}

	void f(int marker) {
		print("f(" + marker + ")");
	}
}

class Cups2 {
	static Cup2 cup1;
	static Cup2 cup2;
	static {
		cup1 = new Cup2(1);
		cup2 = new Cup2(2);
	}

	Cups2() {
		print("Cups2()");
	}
}

public class ExplicitStatic2 {
//相当于static 放在这里,先运行这个再运行main();
	
	public static void main(String[] args) {
		print("Inside main()");
	//	Cups2.cup1.f(99);
	}
static Cups2 cups1 = new Cups2();
static Cups2 cups2 = new Cups2();

}/*output:
Inside main()
Cup(1)
Cup(2)
f(99)
*/
