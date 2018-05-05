//: reusing/SprinklerSystem.java

package thinkingJava.reusing;

class WaterSource {
	private String s;

	WaterSource() {
		System.out.println("WaterSource()");
		s = "Constructed";
	}

	public String toString() {
		return s;
	}
}

public class SprinklerSystem {
	private String valvel1, valvel2, valvel3, valvel4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;

	public String toString() {
		return
				"valve1 = " + valvel1 + " " +
				"valve2 = " + valvel2 + " " +
				"valve3 = " + valvel3 + " " +
				"valve4 = " + valvel4 + "\n" +
				"i = " + i + " " + "f = " +f + " " + 
				" source = " + source;
	}

	public static void main(String[] args) {
		SprinklerSystem sprinklers = new SprinklerSystem();
		System.out.println(sprinklers);
	}
}/*output:
WaterSource()
valve1 = null valve2 = null valve3 = null valve4 = null
i = 0 f = 0.0  source = Constructed
*/
