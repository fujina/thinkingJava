package thinkingJava.operators;

public class Precedence {

	public Precedence() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int x=1, y=2, z=3;
		int a = x + y -2/2 + z;   //a=1+2-1+3 = 5
		int b = x + (y - 2)/(2+z);		//b=1+0=1
		System.out.println("a= " + a + " b  = " +b);  //a和b都成功的转换为字符串String，并和别的字符串通过+在一起了

	}

}
