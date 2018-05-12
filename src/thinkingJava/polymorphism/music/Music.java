//: polymorphism.music.Music.java

package thinkingJava.polymorphism.music;

public class Music {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute);
	}
}/*output:
Wind.play()MIDDLE_C
*/
