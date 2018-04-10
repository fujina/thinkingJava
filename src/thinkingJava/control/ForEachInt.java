//: control/ForEachInt.java

package thinkingJava.control;

import static net.mindview.util.Range.*;

public class ForEachInt {

	public static void main(String[] args) {
		for (int i : range(10))			//生成0,1,2 ... 9的数组
			System.out.print(i + " ");
		System.out.println();
		for (int i : range(5, 10))		//生成5,6,7,8,9的数组
			System.out.print(i + " ");
		System.out.println();
		for (int i : range(5, 20, 3))	//生成从5开始的数组，步长为3，直到20
			System.out.print(i + " ");
		System.out.println();

	}

}/*output:
0 1 2 3 4 5 6 7 8 9 
5 6 7 8 9 
5 8 11 14 17 
*/
