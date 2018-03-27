//: operators/Equivlence.java
// 思考：什么是基本类型？

package thinkingJava.operators;

public class Equivalence {

	public static void main(String[] args) {
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		Integer n3 = n1;
		System.out.println(n1 == n2);  //明明是相等的，为何是false? 因为== !=比较的是引用，是地址，是指针
		System.out.println(n1 != n2);
		System.out.println(n1 == n3);  //n1和n3的引用是相同的，可以是true
		System.out.println(n1 != n3);
	}									//基本类型可以用== !=, 
										//其它类型应该要用equals()
}
/*output
 false 
 true
 true
 false
	 */
