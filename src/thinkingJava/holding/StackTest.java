//: holding/StackTest.java

package thinkingJava.holding;

import net.mindview.util.*;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for (String s : "My dog has fleas".split(" "))
			stack.push(s);
		while (!stack.empty())
			System.out.println(stack.pop() + " ");
	}
}
