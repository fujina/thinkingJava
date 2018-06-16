//: typeinfo/SweetShop.java

package thinkingJava.typeinfo;

import static net.mindview.util.Print.*;

class Candy {
	static {
		print("Loading Candy");
	}
}

class Gun {
	static {
		print("Loading Gum");
	}
}

class Cookie {
	static {
		print("Loading Cookie");
	}
}

public class SweetShop {

	public static void main(String[] args) {
		print("inside main");
		new Candy();
		print("After creating Candy");
		try {
			Class.forName("Gun");
		} catch (ClassNotFoundException e) {
			print("Could't find Gun");
		}
		print("After Class.forName(\"Gum\")");
		new Cookie();
		print("After creating Cookie");
	}
}/*output:
inside main
Loading Candy
After creating Candy
Could't find Gun
After Class.forName("Gum")
Loading Cookie
After creating Cookie
*/
