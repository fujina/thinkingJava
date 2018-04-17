package thinkingJava.initialization;

class Noboday{}

public class NoConstructor {

	public static void main(String[] args) {
		new Noboday();
		System.out.println(new Noboday().toString());
	}

}
