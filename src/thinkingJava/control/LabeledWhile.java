//: control/LabeledWhile.java
package thinkingJava.control;

import static net.mindview.util.Print.*;

public class LabeledWhile {

	public static void main(String[] args) {
		int i = 0;
		outer: while (true) {
			print("Outer while loop");
			while (true) { // 无限循环
				i++; // i++递增并打印
				print("i = " + i);
				if (i == 1) {
					print("continue"); //
					continue;
				}
				if (i == 3) {
					print("continue outer");
					continue outer;				//结束内循环,跳到外循环起始处
				}
				if (i == 5) {
					print("break");
					break;
				}
				if (i == 7) {
					print("break outer");
					break outer;
				}
			}
		}

	}
}/*output:
Outer while loop
i = 1
continue
i = 2
i = 3
continue outer
Outer while loop
i = 4
i = 5
break
Outer while loop
i = 6
i = 7
break outer
*/