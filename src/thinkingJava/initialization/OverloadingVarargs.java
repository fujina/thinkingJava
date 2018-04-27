//: initialization/OverloadingVarargs.java
//	可变参数：最后一项参数类型确定,但个数不确定，java把可变参数当做数组处理
//	static void f(float i , Character...args){} 一个整数,后面可以跟0~n个字符串参数,

package thinkingJava.initialization;

public class OverloadingVarargs {
	static void f(Character... args) {
		System.out.println("first");
		for(Character c : args)
			System.out.print(" " + c);
		System.out.println();
	}
	
	//static void f(int i , Character...args){}	//这行去掉注释会出错,见下面error:
	
	
	static void f(Integer... args) {			//编译会和这个方法搞混? 无法区分而出错?
		System.out.print("second");;
		for(Integer i : args)
			System.out.print(" " + i);
		System.out.println();
	}
	static void f(Long... args) {
		System.out.println("third");
	}

	public static void main(String[] args) {
		f('a', 'b','c');
		f(1);
		f(2,1);
		f(0);
		f(0L);
	}
}/*output:
first
 a b c
second 1
second 2 1
second 0
third
*/
/*error:
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
The method f(Character[]) is ambiguous for the type OverloadingVarargs
The method f(int, Character[]) is ambiguous for the type OverloadingVarargs
The method f(int, Character[]) is ambiguous for the type OverloadingVarargs
*/