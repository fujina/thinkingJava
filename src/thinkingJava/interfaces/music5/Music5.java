//: interfaces/music5/Music5.java

package thinkingJava.interfaces.music5;

import thinkingJava.polymorphism.music.Note;
import static net.mindview.util.Print.*;

interface Instrument {
	int VALUE = 5;

	void play(Note n);

	void adjust();
}

class Wind implements Instrument {
	public void play(Note n) {
		print("Wind.play() " + n);
	}

	public String what() {
		return "Wind";
	}

	public void adjust() {
	} // 但是继承的子类必需实现adjust()
}

class Percussion implements Instrument {
	public void play(Note n) {
		print("Percussion.play() " + n);
	}

	public String what() {
		return "Percussion";
	}

	public void adjust() {
	}
}

class Stringed implements Instrument {
	public void play(Note n) {
		print("Stringed.play() " + n);
	}

	public String what() {
		return "Stringed";
	}

	public void adjust() {
	}
}

class Brass extends Wind {
	public void play(Note n) {
		print("Brass play() " + n);
	}

	public void adjust() {
		print("Brass.adjust()");
	}
}

class Woodwind extends Wind {
	public void play(Note n) {
		print("Woodwind.play() " + n);
	}

	public String what() {
		return "Woodwind";
	}
}

public class Music5 {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument[] e) {
		for (Instrument i : e)
			tune(i);
	}

	public static void main(String[] args) {
		Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}
}/*output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass play() MIDDLE_C
Woodwind.play() MIDDLE_C
*/