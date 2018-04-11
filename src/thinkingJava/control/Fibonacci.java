//: control/Fibonacci.java
// 练习9: 编写斐波那数列,前两位都是1,第三位开始都是前面2位数之和
// 1  1  2  3  5  8  13  

package thinkingJava.control;

public class Fibonacci {

	public static void main(String[] args) {
		int max = Integer.parseInt(args[0]); // 将字符串转换成整数
		int PassNumber = 1, NowNumber = PassNumber + 1, temp;
		System.out.print(1 + " " + PassNumber + " ");
		while ((NowNumber + PassNumber) <= max) {
			System.out.print(NowNumber + " ");		//代码太复杂,能否简化?
			temp = NowNumber;
			NowNumber = PassNumber + NowNumber;
			PassNumber = temp;
		}
	}
}/*output: args = 10000
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 
*/
