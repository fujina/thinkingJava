//: access/Lunch.java

package thinkingJava.access;

class Soup1 {
	private Soup1() {			//这个不能直接调用
	}

	public static Soup1 makeSoup() {	//但是可以用这个静态的方法返回一个 new Soup1()
		return new Soup1();
	}
}

class Soup2 {
	private Soup2() {
	}

	private static Soup2 ps1 = new Soup2();	//一开始就定义一个Soup2的静态对象 ps1

	public static Soup2 access() {			//这个静态的access()方法返回刚建立的ps1
		return ps1;
	}

	public void f() {
	}
}

public class Lunch {
	void testPrivate() {
		// 私有private不能构建
		// ! Soup1 soup = new Soup1();
	}

	void testStatic() {
		Soup1 soup = Soup1.makeSoup();
	}

	void testSingleton() {
		Soup2.access().f();			//相当于ps1.f();
	}
}
