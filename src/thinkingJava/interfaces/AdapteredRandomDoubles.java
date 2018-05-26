//: interfaces/AdapteredRandomDoubles.java

package thinkingJava.interfaces;

import java.nio.*;
import java.util.*;

public class AdapteredRandomDoubles extends RandomDouble implements Readable {
	private int count;

	public AdapteredRandomDoubles(int count) {
		this.count = count;
	}

	public int read(CharBuffer cb) {
		if (count-- == 0)
			return -1;
		String result = Double.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(new AdapteredRandomDoubles(7)); // Resource leak: 's' is never closed
		while (s.hasNextDouble())
			System.out.println(s.nextDouble() + " ");
	}
}
