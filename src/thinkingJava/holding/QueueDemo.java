//: holding/QueueDemo.java

package thinkingJava.holding;

import java.util.*;

public class QueueDemo {
	public static void printQ(Queue queue) {
		while (queue.peek() != null)
			System.out.print(queue.remove() + " ");
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++)
			queue.offer(rand.nextInt(+10));
		printQ(queue);
		Queue<Character> qc = new LinkedList<Character>();
		for (char c : "Brontosaurus".toCharArray())
			qc.offer(c);
		printQ(qc);
	}
}/*output:
8 5 3 1 1 9 8 0 2 7 B r o n t o s a u r u s 
*/
