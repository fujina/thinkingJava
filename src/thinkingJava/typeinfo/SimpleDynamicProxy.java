//: typeinfo/SimpleDynamicProxy.java

package thinkingJava.typeinfo;

import java.lang.reflect.*;

class DynamicProxyHandler implements InvocationHandler {
	private Object proxied;

	public DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);
		if (args != null)
			for (Object arg : args)
				System.out.println("  " + arg);
		return method.invoke(proxied, args);
	}
}

public class SimpleDynamicProxy {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}

	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		Interface proxy = (Interface) Proxy.newProxyInstance(
				Interface.class.getClassLoader(),
				new Class[] { Interface.class }, 
				new DynamicProxyHandler(real));
		consumer(proxy);
	}
}/*output:
doSomething
somethingElse bonobo
**** proxy: class thinkingJava.typeinfo.$Proxy0, method: public abstract void thinkingJava.typeinfo.Interface.doSomething(), args: null
doSomething
**** proxy: class thinkingJava.typeinfo.$Proxy0, method: public abstract void thinkingJava.typeinfo.Interface.somethingElse(java.lang.String), args: [Ljava.lang.Object;@2ef9b8bc
  bonobo
somethingElse bonobo
*/
