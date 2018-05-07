//: reusing/Detergent.java

package thinkingJava.reusing;

import static net.mindview.util.Print.*;

class Cleanser {
	private String s = "Cleanser";

	public void append(String a) {		//定义append方法,往字符串增加内容
		s += a;
	}

	public void dilute() {
		append("dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append("scrub()");
	}

	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		print(x);
	}
}

public class Detergent extends Cleanser {
	public void scrub() {
		append("Detergent.scrub()");
		super.scrub();
	}

	public void foam() {
		append("foam()");
	}

	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class: ");
		Cleanser.main(args);
	}
}/*output:
Cleanserdilute() apply()Detergent.scrub()scrub()foam()
Testing base class: 
Cleanserdilute() apply()
*/
