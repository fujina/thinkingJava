//:	initialization/StringClass.java
//练习17,创建一个类,它有一个接受一个String参数的构造器
package thinkingJava.initialization;

public class StringClass {
	StringClass(String s) {
		String name = s;
		System.out.println("StringClass " + name  + " has been created.");
	}

	StringClass() {
		System.out.println("StringClass has been created.");
	}

	void f1() {
		System.out.println( "function 1 is running." + super.toString());
	}

	public static void main(String[] args) {
		StringClass sc1 = new StringClass("Holiday");
		StringClass sc2 = new StringClass();
		StringClass sc3 = new StringClass();
		StringClass[] sc = {
				sc1,
				sc2,
				sc3,
		};
		for(StringClass s:sc)
		s.f1();
		System.out.println(sc.toString());
		new StringClass();
	}
}/*output:
StringClass Holiday has been created.
StringClass has been created.
StringClass has been created.
function 1 is running.thinkingJava.initialization.StringClass@3c679bde
function 1 is running.thinkingJava.initialization.StringClass@16b4a017
function 1 is running.thinkingJava.initialization.StringClass@8807e25
[LthinkingJava.initialization.StringClass;@2a3046da
StringClass has been created.
*/
