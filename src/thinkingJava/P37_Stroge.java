package thinkingJava;

public class P37_Stroge {

	static int storage(String s) { // static静态的方法是不需要new，直接就可以使用的。\
									// int是指返回值为int类型
		return s.length() * 2; // 返回字符串长度的2倍
	}

	public static void main(String[] args) { // void 是指无需返回值
		// TODO Auto-generated method stub
		String s = "Hello World!"; // 这个字符串有12个字节
		System.out.println(storage(s));

	}

}
