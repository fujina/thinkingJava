//: operators/Exponents.java
//  e 是指以10为底的指数

package thinkingJava.operators;

public class Exponents {
	public static void main(String[] args) {
		float expFloat = 1.39e-43f;
		System.out.println(expFloat);
		expFloat = 1.39E-43f;
		System.out.println(expFloat);
		double expDouble = 47e47d;
		double expDouble2 = 47e47;
		System.out.println(expDouble);
		System.out.println(expDouble2);
	}
}/*output:
1.39E-43
1.39E-43
4.7E48
4.7E48
*/
