//: holding/AsListInference.java

package thinkingJava.holding;

import java.util.*;

class Snow {
}

class Powder extends Snow {
	public String toString() {
		return "Powder.Snow";
	}
}

class Light extends Powder {
	public String toString() {
		return "Light.Powder";
	}
}

class Heavy extends Powder {
	public String toString() {
		return "Heavy.Powder";
	}
}

class Crusty extends Snow {
	public String toString() {
		return "Crusty.Snow";
	}
}

class Slush extends Snow {
	public String toString() {
		return "Slush.Snow";
	}
}

public class AsListInference {
	public static void main(String[] args) {
		List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
		
		List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
		
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
		System.out.println(snow1.toString());
		System.out.println(snow2.toString());
		System.out.println(snow3.toString());
		System.out.println(snow4.toString());
	}
}/*output:
[Crusty.Snow, Slush.Snow, Powder.Snow]
[Light.Powder, Heavy.Powder]
[Light.Powder, Heavy.Powder]
[Light.Powder, Heavy.Powder]
*/
