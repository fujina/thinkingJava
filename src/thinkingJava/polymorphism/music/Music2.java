//: polymorphism/music/Music2.java

package thinkingJava.polymorphism.music;

import static net.mindview.util.Print.*;

import thinkingJava.polymorphism.music.Note;

class Stringed extends Instrument {
	public void play(Note n) {
		print("Stringed.play() " + n);
	}
}

class Brass extends Instrument {
	public void play(Note n) {
		printf("Brass.play() " + n);
	}
}

public class Music2 {
	public static void tune(Wind i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tune(Stringed i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tune(Brass i) {
		i.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		Wind flute = new Wind();
		Stringed violin = new Stringed();
		Brass frenchHorn = new Brass();
		tune(flute);
		tune(violin);
		tune(frenchHorn);
	}

}/*
	 * output: Wind.play()MIDDLE_C Stringed.play() MIDDLE_C Brass.play() MIDDLE_C
	 */
