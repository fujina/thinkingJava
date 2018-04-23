//: initialization/DefaultConstructor.java

package thinkingJava.initialization;

class Bird {
	void fly(){
		System.out.println("I like the sky.");
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		Bird b = new Bird();
		b.fly();
	}

}
