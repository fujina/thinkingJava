//: operators/EqualsMethod2.java
// 如果是你自己创建新的类，equals也只是比较引用
// 必需自己填写equals方法，覆盖原来的引用比较特性

package thinkingJava.operators;

class Value{
	int i;
}

public class EqualsMethod2 {

	public static void main(String[] args) {
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i = 100;
		System.out.println(v1.equals(v2));  //Output: false
	}

}
