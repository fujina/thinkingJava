//: operators/ShortCircuit.java
// “短路”现象，多个表达式，从左到右计算，一旦能够确定整个表达式的值，就不再计算表达式余下部分了
// 逻辑表达式靠后部分有可能不会被运算

package thinkingJava.operators;

public class ShortCircuit {
	static boolean test1(int val) {
		System.out.println("------------------");
		System.out.println("test1(" + val + ")");
		System.out.println("result: " + (val < 1));
		System.out.println("------------------");
		return val < 1;
	}

	static boolean test2(int val) {
		System.out.println("test2(" + val + ")");
		System.out.println("result: " + (val < 2));
		System.out.println("------------------");
		return val < 2;
	}

	static boolean test3(int val) {
		System.out.println("test3(" + val + ")");
		System.out.println("result: " + (val < 3));
		System.out.println("------------------");
		return val < 3;
	}

	public static void main(String[] args) {
		boolean b = test1(0) && test2(2) && test3(2);
		System.out.println("expression is " + b);
		System.out.println("------------------");
	}
}
/*output:
------------------
test1(0)
result: true
------------------
test2(2)
result: false
------------------
expression is false
------------------
*/
