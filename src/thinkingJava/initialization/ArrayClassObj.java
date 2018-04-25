//: initialization/ArrayClassObj.java
package thinkingJava.initialization;

import java.util.*;
import static net.mindview.util.Print.*;

public class ArrayClassObj {

	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer[] a = new Integer[rand.nextInt(20)];
		print("length of a  = " + a.length);
		for (int i = 0; i < a.length; i++)
			a[i] = rand.nextInt(500);
		print(Arrays.toString(a));
	}
}/*output:
length of a  = 18
[55, 193, 361, 461, 429, 368, 200, 22, 207, 288, 128, 51, 89, 309, 278, 498, 361, 20]
*/
