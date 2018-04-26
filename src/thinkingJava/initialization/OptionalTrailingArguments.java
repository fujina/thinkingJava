//: initialization/OptionalTrailingArguments.java

package thinkingJava.initialization;

public class OptionalTrailingArguments {
	static void f(int required, String... trailing) {
		System.out.print("required: " + required + " ");	//参数个数
		for (String s : trailing)
			System.out.print(s + " ");						//具体参数名称
		System.out.println();
	}

	public static void main(String[] args) {
		f(1, "one");
		f(2, "two", "three");
		f(0);
	}
}/*output:
required: 1 one 
required: 2 two three 
required: 0 
*/