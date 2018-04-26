//: initialization/StringArrays.java
//练习16:(1)创建一个对象数据,并为每一个元素都赋值一个String,用for循环来打印该数组

package thinkingJava.initialization;

public class StringArrays {

	public static void main(String[] args) {
		String[] str = new String[]{
			"Happy",
			"Labors",
			"Day",
		};
		for(String s : str)
			System.out.print(s + " ");
	}

}/*output:
Happy Labors Day
*/
