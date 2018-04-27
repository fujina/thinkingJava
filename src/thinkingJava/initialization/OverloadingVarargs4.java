// :initialization/OverloadingVarargs4.java
//	练习19:写一个类,它接受一个可变参考的String数组,验证你可以向该方法传送一个用逗号分隔的String列表 , 或者是一个String[]
//	可变参数不可以混淆,必需考虑...参数个数为0时的情形

package thinkingJava.initialization;

public class OverloadingVarargs4 {
	static void f(String... s) {
		System.out.print(s.length + "\t");
		for (String ss : s)
			System.out.print(ss + "\t" );
		System.out.println();
	}

	public static void main(String[] args) {
		f("Hello,Java");
		f("I", "like", "it", "!");
	}
}/*output:
1	Hello,Java	
4	I	like	it	!
*/
