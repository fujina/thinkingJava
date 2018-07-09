//: typeinfo/ModifyingPrivateFields.java

package thinkingJava.typeinfo;

import java.lang.reflect.*;

class WithPrivateFinalField {
	private int i = 1;
	private final String s = "I'm totally safe";
	private String s2 = "Am I safe?";
	public String toString() {
		return "i =  " + i + ", " + s + ", " + s2;
	}
}
public class ModifyingPrivateFields {
	public static void main(String[] args) throws Exception {
		WithPrivateFinalField pf = new WithPrivateFinalField(); //定义类包含 最终final的私有变量
		System.out.println(pf);
		Field f = pf.getClass().getDeclaredField("i");	//定义一个和目标类相似的类,并获取private变量i
		f.setAccessible(true);							//可写属性
		System.out.println("f.getInt(pf): " + f.getInt(pf));
		f.setInt(pf, 47);								//set什么东西进去哪个变量,由.getDeclaredField("变量")决定
		System.out.println(pf);
		f = pf.getClass().getDeclaredField("s");	//final private的变量s不能被改变
		f.setAccessible(true);
		System.out.println("f.get(pf): " + f.get(pf));
		f.set(pf, "No, you're not!11");
		System.out.println(pf);
		f = pf.getClass().getDeclaredField("s2");		//s2是private不是final,可以被改变
		f.setAccessible(true);
		System.out.println("f.get(pf): " + f.get(pf));
		f.set(pf, "No, you're not!");
		System.out.println(pf);
	}
}
