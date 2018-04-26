//: initialization/DynamicArray.java

package thinkingJava.initialization;

public class DynamicArray {

	public static void main(String[] args) {
		Other.main(new String[] {"fiddle","de","dum"});//把String 对象数组传递给Other.main作为命令行参数
	}
}

class Other{
	public static void main(String[] args) {
		for(String s :args)
			System.out.print(s+" ");;
	}
}/*output:
fiddle de dum 
*/
