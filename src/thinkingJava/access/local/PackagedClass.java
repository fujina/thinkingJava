// access/local/PackagedClass.java

package thinkingJava.access.local;

public class PackagedClass {		//如果不是public ,在别的类就无法直接访问
	public PackagedClass() {
		System.out.println("Creating a packaged class");
	}
}
