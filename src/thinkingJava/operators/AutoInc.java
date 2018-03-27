//: operators/AutoInc.java
// Demonstrates the ++ and -- operators.

package thinkingJava.operators;

public class AutoInc {

	public static void main(String[] args) {
		int i = 1;
		System.out.println("i : " + i);
		System.out.println("++i : " + ++i);
		System.out.println("i++ : " + i++);
		System.out.println("i : " + i);
		System.out.println("--i : " + --i);
		System.out.println("i-- : " + i--);
		System.out.println("i : " + i);
		i= i*-i;							//这个机器能看懂，但人看了会糊涂？应该改成 i = i * (-i) 代码会更好阅读
		System.out.println("i * - i : " + i);

	}

}/*output:
i : 1
++i : 2
i++ : 2
i : 3
--i : 2
i-- : 2
i : 1
*/
