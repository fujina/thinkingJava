//: typeinfo/GenericClassReferences.java

package thinkingJava.typeinfo;

public class GenericClassReferences {

	public static void main(String[] args) {
		Class intClass = int.class;						//intClass 为 int.class
		Class<Integer> genericIntClass = int.class;		//gerericIntClass 也是int.class
		genericIntClass = Integer.class;				//gerericIntClass 赋值为 int.class类型的intClass
		intClass = double.class;						//intClass 为 double.class
		//gerericIntClass = double.class;					//gerenicIntClass已为intClass不能再改为double.class
	}
}
