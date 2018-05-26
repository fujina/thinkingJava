//: interfaces/interfaceprocessor1/Apply.java

package thinkingJava.interfaces.classprocessor1;
import static net.mindview.util.Print.*;

public class Apply {
	public static void process(Processor p, Object s) {
		print("Using Processor " + p.name());
		print(p.process(s));
	}
}
