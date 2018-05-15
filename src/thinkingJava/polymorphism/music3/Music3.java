//: polymorphism/music3/Music3.java
// 多态

package thinkingJava.polymorphism.music3;

import thinkingJava.polymorphism.music.Note;
import static net.mindview.util.Print.*;

class Instrument {
	void play(Note n) {
		print("Instrumentt.play() " + n);
	}

	String what() {
		return "Instrument";
	}

	void adjust() {
		printf("Adjusting Instrument");
	}
}

class Wind extends Instrument {
	void play(Note n) {
		print("Wind.play() " + n);
	}

	String what() {
		return "Wind";
	}

	void adjust() {
		print("Adjusting Wind");
	}
}

class Percussion extends Instrument {
	void play(Note n) {
		print("Percussion()play " + n);
	}

	String what() {
		return "Percussion";
	}

	void adjust() {
		print("Adjusting Percussion");
	}
}

class Stringed extends Instrument {
	void play(Note n) {
		print("Stringed.play() " + n);
	}

	String what() {
		return "Stringed";
	}

	void adjust() {
		print("Adjusting Stringed");
	}
}

class Brass extends Wind {
	void play(Note n) {
		print("Brass.play() " + n);
	}

	void adjust() {
		print("adjusting Brass");
	}
}

class Woodwind extends Wind {
	void play(Note n) {
		print("Woodwind.play() " + n);
	}

	String what() {
		return "Woodwind";
	}
}

public class Music3 {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument[] e) {
		for (Instrument i : e)					//简化版的foreach
			tune(i);
	}

	public static void main(String[] args) {
		Instrument[] orchestra = { 	new Wind(), 
									new Percussion(), 
									new Stringed(), 
									new Brass(), 
									new Woodwind() };
		tuneAll(orchestra);
	}
}
/*output:
Wind.play() MIDDLE_C
Percussion()play MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*/
