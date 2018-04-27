//: initialization/OverloadingVarargs2.java

package thinkingJava.initialization;

public class OverloadingVarargs2 {
	static void f(float i, Character... args) {
		System.out.println("first");
	}

	static void f(Character... args) {		//因为找不到匹配参数的方法
		System.out.println("second");
	}

	public static void main(String[] args) {
		f(1, '1','2');
		f();
		f(1);
		// f('a', 'b');		//这行出错
	}
}/*output:
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method f(float, Character[]) is ambiguous for the type OverloadingVarargs2

	at thinkingJava.initialization.OverloadingVarargs2.main(OverloadingVarargs2.java:16)
*/
