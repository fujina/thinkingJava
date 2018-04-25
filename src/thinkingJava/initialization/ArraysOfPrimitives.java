//:	initialization/ArraysOfPrimitives.java

package thinkingJava.initialization;

import static net.mindview.util.Print.*;

public class ArraysOfPrimitives {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2;
		a2 = a1;
		for (int i = 0; i < a2.length; i++)
			a2[i] = a2[i] + 1;
		for (int i = 0; i < a1.length; i++)
			print("a1[" + i + "] = " + a1[i]);
		print("==================================");	//要复制数组数据而不是引用
		int[] a3 = new int[a1.length];					//要用System.arraycopy
		System.arraycopy(a1, 0, a3, 0, a1.length);		//(源数组,开始,目标数组,开始,复制个数)
		for(int i = 0; i<a3.length;i++)
			a3[i]=a3[i]*2;
		print("a1\t\ta3");
		for(int i = 0; i<a1.length;i++)
			print(a1[i] + "\t\t"	+a3[i]);
	}
}/*output:
a1[0] = 2
a1[1] = 3
a1[2] = 4
a1[3] = 5
a1[4] = 6
==================================
a1		a3
2		4
3		6
4		8
5		10
6		12
*/
