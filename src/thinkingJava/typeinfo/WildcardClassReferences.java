//: typeinfo/WildcardClassReferences.java
//: 泛型

package thinkingJava.typeinfo;

public class WildcardClassReferences {
	public static void main(String[] args) {
		Class<?> intClass = int.class;
		intClass = double.class;

	}

}
