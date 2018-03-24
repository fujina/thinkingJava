package thinkingJava.ch2;

public class P37_Incrementable {

	static class StaticTest { // 书上是没有static，会出错The field i cannot be declared static in a non-static inner
								// type, unless initialized with a constant expression
		static int i = 47;
	}

	static class Incrementable {	//书上是 class Incre...出错：The method increment cannot be declared static; static methods can only be declared in a static or top level type
									//改成static class Increm....就正常了。
		static void increment() {
			StaticTest.i++;
		}
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Incrementable sf = new Incrementable(); //new 再调用
		sf.increment();
		System.out.println(StaticTest.i);
		
		Incrementable.increment();              //对于static静态方法，也可以直接调用。
		System.out.println(StaticTest.i);
	}

}
