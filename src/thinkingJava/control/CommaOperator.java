//: operator/CommaOperator.java

package thinkingJava.control;

public class CommaOperator {

	public static void main(String[] args) {
		for(int i = 1, j = 1 + 10; i< 5; i++,j=i*2) {
			System.out.println("i= " + i + " j = " +j);
		}

	}

}/*output:
i= 1 j = 11
i= 2 j = 4
i= 3 j = 6
i= 4 j = 8
*/
