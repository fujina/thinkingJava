//: typeinfo/ClassInitialization.java

package thinkingJava.typeinfo;

import java.util.*;

class Initable {
	static final int staticFinal = 47;
	static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
	static {
		System.out.println("Initializaing Initable");
	}
}

class Initable2 {
	static int staticNonFinal = 147;
	static {
		System.out.println("Initiazlizaing Initable2");
	}
}

class Initable3 {
	static int staticNonFinal = 74;
	static {
		System.out.println("Initializaing Initable3");
	}
}

public class ClassInitialization {
	public static Random rand = new Random(47);

	public static void main(String[] args) throws Exception {
		Class initable = Initable.class;
		System.out.println("After creating Initable ref");
		System.out.println(Initable.staticFinal);
		System.out.println(Initable.staticFinal2);
		System.out.println(Initable2.staticNonFinal);
		Class initable3 = Class.forName("Initable3");
		System.out.println("After creating Initable3 ref");
		System.out.println(Initable3.staticNonFinal);
	}
}/*output:
After creating Initable ref
47
Initializaing Initable
258
Initiazlizaing Initable2
147
Exception in thread "main" java.lang.ClassNotFoundException: Initable3
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:582)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:185)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:496)
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:292)
	at thinkingJava.typeinfo.ClassInitialization.main(ClassInitialization.java:38)
*/
