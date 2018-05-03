package thinkingJava.access;

import thinkingJava.access.hi.*;

public class Say extends Hello {
	public Say() {
		System.out.println("Let's make new friends!");
	}

	public static void main(String[] args) {
		Say sh = new Say();
		sh.hi();
		sh.hi_public();
	}
}/*output:
Let's make new friends!
Hi!
*/
