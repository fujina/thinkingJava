//: initialization/OverloadingVarargs2.java

package thinkingJava.initialization;

public class OverloadingVarargs3 {
	static void f(float i, Character... args) {
		System.out.println("first");
	}

	static void f(char c, Character... args) {
		System.out.println("second");
	}

	public static void main(String[] args) {
		f(1, '1');
		f('a', 'b');
	}
}/*output:
first
second
*/
