//:	access/PrintTest.java

package thinkingJava.access;

import static thinkingJava.simple.Print.*;

public class PrintTest {

	public static void main(String[] args) {
		print("Available from now on!");
		print(100);
		print(100L);
		print(3.14159);
	}
}/*output:
Available from now on!
100
100
3.14159
*/
