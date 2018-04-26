//: initialization/VarArgs.java

package thinkingJava.initialization;

class A {
}

public class VarArgs {
	static void printArray(Object[] args) {
		for (Object obj : args)
			System.out.print(obj + " ");
		System.out.println();
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		printArray(new Object[] { new Integer(47), new Float(3.14), new Double(11.11) });
		printArray(new Object[] { "one", "two", "three" });
		printArray(new Object[] { new A(), new A(), new A() });
	}
}/*output:
47 3.14 11.11 
one two three 
thinkingJava.initialization.A@3419866c thinkingJava.initialization.A@63e31ee thinkingJava.initialization.A@68fb2c38 
*/
