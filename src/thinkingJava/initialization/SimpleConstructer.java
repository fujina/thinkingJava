//: initialization/SimpleConstructer.java

package thinkingJava.initialization;

class Rock {
	Rock() {
		System.out.print("Rock ");
	}
}

public class SimpleConstructer {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Rock();
		}

	}

}/*output:
Rock Rock Rock Rock Rock Rock Rock Rock Rock Rock 
*/
