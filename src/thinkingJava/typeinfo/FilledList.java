//: typeinfo/FilledList.java
/*Java泛型中的标记符含义： 
 E - Element (在集合中使用，因为集合中存放的是元素)
 T - Type（Java 类）
 K - Key（键）
 V - Value（值）
 N - Number（数值类型）
？ -  表示不确定的java类型
 S、U、V  - 2nd、3rd、4th types			 */

package thinkingJava.typeinfo;

import java.util.*;

class CountedInteger {
	private static long counter;
	private final long id = counter++;

	public String toString() {
		System.out.println("id   =  " + id);
		return Long.toString(id);
	}
}

public class FilledList<T> {
	private Class<T> type;

	public FilledList(Class<T> type) {
		this.type = type;
	}

	public List<T> create(int nElements) {
		List<T> result = new ArrayList<T>();
		try {
			for (int i = 0; i < nElements; i++)
				result.add(type.newInstance());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return result;
	}

	public static void main(String[] args) {
		FilledList<CountedInteger> f1 = new FilledList<CountedInteger>(CountedInteger.class);
		System.out.println(f1.create(15));
	}
}
