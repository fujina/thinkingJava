//: access/hi/Hello.java

package thinkingJava.access.hi;

public class Hello {

	protected void hi() {
		System.out.println("Hi!");
	}

	public void hi_public() {
		System.out.println("Hi! public ");
	}

	private static void hi_private() { // 要有static,才可以在main()里面引用
		System.out.println("Hi! private ");
	}

	public static void main(String[] args) {
		hi_private();
	}

}
