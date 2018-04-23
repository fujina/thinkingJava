//: initialization/OrderOfInitialization.java

package thinkingJava.initialization;

import static net.mindview.util.Print.*;

class Window {
	Window(int marker) {
		print("Windows(" + marker + ")");
	}
}

class House {
	Window w1 = new Window(1);		//	1

	House() {
		print("House()");			//	4	要运行所有的House{}变量定义语句后,才运行House(){}
		w3 = new Window(33);		//	5	w3=3,直到这里才改变成33
	}

	Window w2 = new Window(2);		//	2

	void f() {
		print("f()");				//	6	这个是最后的
	}

	Window w3 = new Window(3);		//	3
}

public class OrderOfInitialization {
	public static void main(String[] args) {
		House h = new House();
		h.f();
	}
}/*output:
Windows(1)
Windows(2)
Windows(3)
House()
Windows(33)
f()
*/
	
