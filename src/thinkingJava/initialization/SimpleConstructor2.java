//: initialization/SimpleConstructor2.java

package thinkingJava.initialization;

class Rock2 {
	Rock2(int i) {
		System.out.print("Rock " + i + " ");
	}
}

public class SimpleConstructor2 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			new Rock2(i);
	}
}/*output:
Rock 0 Rock 1 Rock 2 Rock 3 Rock 4 Rock 5 Rock 6 Rock 7 Rock 8 Rock 9
*/
