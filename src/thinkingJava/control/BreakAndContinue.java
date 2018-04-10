//: control/BreakAndContinue.java

package thinkingJava.control;

import static net.mindview.util.Range.*;

public class BreakAndContinue {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i == 74)
				break;
			if (i % 9 != 0)		//如果不是9的倍数,则下一个循环
				continue;
			System.out.print(i + " ");	//如果是9的倍数,则打印这个数
		}
		System.out.println();

		// Using foreach:
		for (int i : range(100)) {
			if (i == 74)
				break;
			if (i % 9 != 0)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();

		// An "infinite loop":  无限循环代码
		int i = 0;
		while (true) {
			i++;
			int j = i * 27;
			if (j == 1269)	//如果i=47时就中断代码运行
				break;
			if (i % 10 != 0)
				continue;
			System.out.print(i + " ");	//如果是10的整数倍,就打印这个数
		}

	}

}/*output:
0 9 18 27 36 45 54 63 72 
0 9 18 27 36 45 54 63 72 
10 20 30 40 
*/
