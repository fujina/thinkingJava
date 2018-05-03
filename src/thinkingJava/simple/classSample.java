package thinkingJava.simple;

import thinkingJava.access.Widget;

public class classSample {

	public static void main(String[] args) {
		Widget wg = new Widget("Nancy");
		if (wg.name != null)
			System.out.println(wg.name + " Nice to meet you! ");
		else
			System.out.println("Let's have a good talk for new friends.");
	}

}
