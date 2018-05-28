//: interfaces/Factories.java

package thinkingJava.interfaces;

import static net.mindview.util.Print.*;

interface Service {			//提供服务方法的 接口			
	void method1();
	void method2();
}

interface ServiceFactory {	//服务工厂
	Service getService();
}

class Implementation1 implements Service {	//服务履行1
	Implementation1() {
	}

	public void method1() {
		print("Implementation1 method1");
	}

	public void method2() {
		print("Implementation1 method2");
	}
}

class Implementation1Factory implements ServiceFactory { //服务履行1的工厂
	public Service getService() {
		return new Implementation1();
	}
}

class Implementation2 implements Service {
	Implementation2() {
	}

	public void method1() {
		print("Implementation2 method1");
	}

	public void method2() {
		print("Implementation2 method2");
	}
}

class Implementation2Factory implements ServiceFactory {
	public Service getService() {
		return new Implementation2();
	}
}

public class Factories {
	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		serviceConsumer(new Implementation1Factory());
		serviceConsumer(new Implementation2Factory());
	}
}/*output:
Implementation1 method1
Implementation1 method2
Implementation2 method1
Implementation2 method2
*/
