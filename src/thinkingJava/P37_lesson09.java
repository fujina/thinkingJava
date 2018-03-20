package thinkingJava;

public class P37_lesson09 {

	public P37_lesson09() {
		
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Boolean bh = new Boolean("False");
		boolean b = !bh;
		System.out.println(b);
		
		Character ch = new Character('x'); //单个字符要用单引号，不能用双引号
		char c = ch;
		System.out.println(c);
		
		byte bt = 127;
		Byte bth = bt;
		System.out.println(bth++ + " : " + bth);	//127+1就会变成 -128	为什么不会报错？
		
		Short sh = new Short("32767");				//如果数值不用双引号，会出错The constructor Short(int) is undefined
		short s = sh;								//short s = sh + 1 会报错cannot convert from int to short
		System.out.println(s);
		
		Integer myInt = new Integer(2147483647);		//可用双引号，也可不用双引号
		int myint = myInt + 1;
		System.out.println(myInt + " + 1 = " + myint); //2147483647 + 1 = -2147483648
		
		Long lh = new Long("9223372036854775807");
		long l = lh+1;
		System.out.println(lh + " + 1 = " + l);			//9223372036854775807 + 1 = -9223372036854775808
		
		//float double 代码待添加
	}

}
