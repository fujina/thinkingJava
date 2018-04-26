//: initialization/NewVarArgs.java

package thinkingJava.initialization;

public class NewVarArgs {
	static void printArray(Object... args) { // ...是什么含义?
		for (Object obj : args)
			System.out.print((obj + " "));
		System.out.println();
	}

	public static void main(String[] args) {
		printArray(new Integer(47), new Float(3.14), new Double(11.11));
		printArray(47, 3.14F, 11.11);
		printArray("one", "two", "three");
		printArray(new A(), new A(), new A());
		printArray((Object[]) new Integer[] { 1, 2, 3, 4 });
		printArray();
	}
}/*output:
47 3.14 11.11 
47 3.14 11.11 
one two three 
thinkingJava.initialization.A@3419866c thinkingJava.initialization.A@63e31ee thinkingJava.initialization.A@68fb2c38 
1 2 3 4 
*/
