//: polymorphism/PolyConstructors.java

package thinkingJava.polymorphism;

import static net.mindview.util.Print.*;
import java.util.*;

class Glyph {
	void draw() {
		print("Glyph.draw()");
	}

	Glyph() {
		{
			print("Glyph() before draw()");
			draw();
			print("Glyph() after draw()");
		}
	}

	class RoundGlyph extends Glyph {
		private int radius = 1;
		RoundGlyph(int r) {
			radius = r;
			print("RoundGlyph.RoundGlyph(), radius = " + radius);
		}
		void draw() {
			print("RoundGlyph.draw(), radius = " + radius);
		}
	}
}

public class PolyConstructors {

	public static void main(String[] args) {
		new Glyph(); 
		//new RoundGlyph(5);		// RoundGlyph cannot be resolved to a type

	}

}
