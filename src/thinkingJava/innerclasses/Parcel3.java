// interclasses/Parcel3.java

package thinkingJava.innerclasses;

import java.util.*;
import net.mindview.util.Print.*;

public class Parcel3 {
	class Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}

	class Destination {
		private String label;

		Destination(String whereTo) {
			label = whereTo;
			System.out.println(label);
		}

		String readLabel() {
			return label;
		}
	}

	public static void main(String[] args) {
		Parcel3 p = new Parcel3();
		Parcel3.Contents c = p.new Contents();
		Parcel3.Destination d = p.new Destination("Tasmania");
	}

}
