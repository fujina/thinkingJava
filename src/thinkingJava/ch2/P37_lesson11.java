package thinkingJava.ch2;

class AllTheColorsOfTheRainbow {
	int anIntegerRepresentingColors;
	String anStringRepresentingColorsName;

	void changeTheHueOfTheColor(int newHue) {

	}

	public static void main(String[] args) {
		AllTheColorsOfTheRainbow ar = new AllTheColorsOfTheRainbow();
		ar.anIntegerRepresentingColors = 0;
		ar.anStringRepresentingColorsName = "Red";
		System.out.println(ar.anIntegerRepresentingColors + " : " + ar.anStringRepresentingColorsName);
	}
}
