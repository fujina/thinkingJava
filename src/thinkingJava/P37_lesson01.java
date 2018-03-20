/**
 * 
 */
package thinkingJava;

public class P37_lesson01 {

	static class MyClass {
		// 创建一个类，它包含一个 int域和一个char域，它们都没有初始化，
		//将它们的值打印出来，以验证Java执行了默认的初始化
		//运行结果：	myInt: 0
		//			MyChar: 
		static int myInt;
		static char myChar;
	}

	public P37_lesson01() {

	}

	public static void main(String[] args) {

		// 如何创建一个简单的类？
		MyClass mc1 = new MyClass();

		System.out.println("myInt: " + mc1.myInt);
		System.out.println("MyChar: " + mc1.myChar);

	}

}
