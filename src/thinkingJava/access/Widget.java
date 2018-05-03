package thinkingJava.access;

public class Widget {
	public String name;

	public Widget(String name) {
		this.name=name;
		System.out.println("Hello, " + this.name);
	}
	public Widget() {
		System.out.println("Hello, What's your name?");
	}
}
