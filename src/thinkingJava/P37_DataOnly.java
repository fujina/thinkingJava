package thinkingJava;

public class P37_DataOnly {
	/*
	 * 
	 */

	public static void main(String[] args) {
		DataOnly data1 = new DataOnly();
		DataOnly data2 = new DataOnly();
		data1.i = 111;
		data2.i = 222;
		data1.d = 1.11;
		data2.d = 2.22;
		data1.b = true;
		data2.b = false;
		System.out.println(data1.i + " " + data1.d + " " + data1.b);
		System.out.println(data2.i + " " + data2.d + " " + data2.b);
		//如何是static变量，则new多少个data7,data8,data9,所有成员的数值都是一致的。
	}

}

class DataOnly {	
	/*三个变量为static,运行结果为：
	 * 222 2.22 false
	 * 222 2.22 false.
	 * 如何没有static,运行结果为：
	 * 111 1.11 true
	 * 222 2.22 false
	 */
	
	int i;
	double d;
	boolean b;
}