//: control/Vampire.java
// 练习10:找出4位数的所有吸血鬼数字,1260 = 21 * 60; 1827 = 21 * 87 ; 2187 = 27 * 81
//　后面的数字可以不按顺序排列.　数字不能以00结尾
/*
package thinkingJava.control;

class CheckVampire {
	CheckVampire(int[] argv) {
		int a = argv[0];
		int b = argv[1];
		int c = argv[2];
		int d = argv[3];
		int i = argv[4];
		if (i == (a * 10 + b) * (c * 10 + d)) {
			System.out.println(a + b + " * " + c + d + " = " + i);
		}
	}

	public class Vampire2 {

		public void main(String[] args) {
			int a, b, c, d;
			for (int i = 1001; i < 10000; i++) {
				a = i / 1000;
				b = (i - a * 1000) / 100;
				c = (i - a * 1000 - b * 100) / 10;
				d = (i - a * 1000 - b * 100 - c * 10);
				if ((c == 0) && (d == 0))
					continue;
				// System.out.println(a + " " + b + " " + c + " " + d + " : " + i);
				// 以下遍历代码太繁琐，有改进空间,需复习排列组合知识
				// 一共有24种排列方法
				// abcd abdc acbd acdb adbc adcb a开头 bcd有6种排法？
				// bacd badc bcad bcda bdac bdca
				// cbad cbda cabd cadb cdba cdab
				// dbca dbac dcba dcab dabc dacb

				if (i == (a * 10 + b) * (c * 10 + d)) {
					System.out.println("abcd:\t" + a + b + " * " + c + d + " = " + i);

					continue;
				}
				if (i == (a * 10 + b) * (d * 10 + c)) {
					System.out.println("abdc:\t" + a + b + " * " + d + c + " = " + i);
					continue;
				}
				if (i == (a * 10 + c) * (d * 10 + b)) {
					System.out.println("acdb:\t" + a + c + " * " + d + b + " = " + i);
					continue;
				}
				if (i == (a * 10 + c) * (b * 10 + d)) {
					System.out.println("acbd:\t" + a + c + " * " + b + d + " = " + i);
					continue;
				}
				if (i == (a * 10 + d) * (b * 10 + c)) {
					System.out.println("adbc:\t" + a + d + " * " + b + c + " = " + i);
					continue;
				}
				if (i == (a * 10 + d) * (c * 10 + b)) {
					System.out.println("adcb:\t" + a + d + " * " + c + b + " = " + i);
					continue;
				}
				// ============================================================================
				if (i == (b * 10 + a) * (d * 10 + c)) {
					System.out.println("badc:\t" + b + a + " * " + d + c + " = " + i);
					continue;
				}
				if (i == (b * 10 + a) * (c * 10 + d)) {
					System.out.println("bacd:\t" + b + a + " * " + c + d + " = " + i);
					continue;
				}
				if (i == (b * 10 + c) * (a * 10 + d)) {
					System.out.println("bcad:\t" + b + c + " * " + a + d + " = " + i);
					continue;
				}
				if (i == (b * 10 + c) * (d * 10 + a)) {
					System.out.println("bcda:\t" + b + c + " * " + d + a + " = " + i);
					continue;
				}
				if (i == (b * 10 + d) * (a * 10 + c)) {
					System.out.println("bdac:\t" + b + d + " * " + a + c + " = " + i);

					continue;
				}
				if (i == (b * 10 + d) * (c * 10 + a)) {
					System.out.println("bdca:\t" + b + d + " * " + c + a + " = " + i);
					continue;
				}
				// ============================================================================
				if (i == (c * 10 + b) * (a * 10 + d)) {
					System.out.println("cbad:\t" + c + b + " * " + a + d + " = " + i);
					continue;
				}
				if (i == (c * 10 + b) * (d * 10 + a)) {
					System.out.println("cbda:\t" + c + b + " * " + d + a + " = " + i);
					continue;
				}
				if (i == (c * 10 + a) * (d * 10 + b)) {
					System.out.println("cadb:\t" + c + a + " * " + d + b + " = " + i);
					continue;
				}
				if (i == (c * 10 + a) * (b * 10 + d)) {
					System.out.println("cabd:\t" + c + a + " * " + b + d + " = " + i);
					continue;
				}
				if (i == (c * 10 + d) * (b * 10 + a)) {
					System.out.println("cdba:\t" + c + d + " * " + b + a + " = " + i);
					continue;
				}
				if (i == (c * 10 + d) * (a * 10 + b)) {
					System.out.println("cdab:\t" + c + d + " * " + a + b + " = " + i);
					continue;
				}
				// ============================================================================
				if (i == (d * 10 + b) * (c * 10 + a)) {
					System.out.println("dbca:\t" + d + b + " * " + c + a + " = " + i);
					continue;
				}
				if (i == (d * 10 + b) * (a * 10 + c)) {
					System.out.println("dbac:\t" + d + b + " * " + a + c + " = " + i);
					continue;
				}
				if (i == (d * 10 + c) * (b * 10 + a)) {
					System.out.println("dcba:\t" + d + c + " * " + b + a + " = " + i);
					continue;
				}
				if (i == (d * 10 + c) * (a * 10 + b)) {
					System.out.println("dcab:\t" + d + c + " * " + a + b + " = " + i);
					continue;
				}
				if (i == (d * 10 + a) * (b * 10 + c)) {
					System.out.println("dabc:\t" + d + a + " * " + b + c + " = " + i);
					continue;
				}
				if (i == (d * 10 + a) * (c * 10 + b)) {
					System.out.println("dacb:\t" + d + a + " * " + c + b + " = " + i);
					continue;
				}
				// ============================================================================
			}
		}
	}
}*/