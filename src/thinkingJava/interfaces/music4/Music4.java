//: interfaces/music4/Music4.java

package thinkingJava.interfaces.music4;

import thinkingJava.polymorphism.music.Note;
import static net.mindview.util.Print.*;

abstract class Instrument {
	private int i;

	public abstract void play(Note n);

	public String what() {
		return "Instrument";
	}

	public abstract void adjust(); // 根类定义abstract抽象 的 adjust()不用实现
}

class Wind extends Instrument {
	public void play(Note n) {
		print("Wind.play() " + n);
	}

	public String what() {
		return "Wind";
	}

	public void adjust() {
	} // 但是继承的子类必需实现adjust()
}

class Percussion extends Instrument {
	public void play(Note n) {
		print("Percussion.play() " + n);
	}

	public String what() {
		return "Percussion";
	}

	public void adjust() {
	}
}

class Stringed extends Instrument {
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

public class Music4 {
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
