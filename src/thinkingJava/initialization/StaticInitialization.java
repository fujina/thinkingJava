//: initialization/StaticInitialization.java

package thinkingJava.initialization;

import static net.mindview.util.Print.*;

class Bowl{
	Bowl(int marker){
		print("Bowl(" + marker + ")");
	}
	void f1(int marker) {
		print("f1(" + marker + ")");
	}
}

class Table{
	static Bowl bowl1 = new Bowl(1);
	Table(){
		print("table()");
		bowl2.f1(1);
	}
	void f2(int marker) {
		print("f2(" + marker + ")");
	}
	static Bowl bowl2 = new Bowl(2);
}
class Cupboard{
	Bowl Bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	Cupboard(){
		print("Cupboard()");
		bowl4.f1(2);
	}
	void f3(int marker) {
		print("f3(" + marker + ")");
	}
	static Bowl bowl5 = new Bowl(5); 
}

public class StaticInitialization {

	public static void main(String[] args) {
		print("Creating new Cupboard() in main");
		new Cupboard();
		print("Creating new Cupboard() in marin");
		new Cupboard();
		table.f2(1);
		cupboard.f3(1);

	}
	static Table table = new Table();			//这两句应该放在main()前面,
	static Cupboard cupboard = new Cupboard();	//就算放在main()后面也会先运行的.
}/*output:
	Picked up _JAVA_OPTIONS: -Xmx512M
	Bowl(1)
	Bowl(2)
	table()
	f1(1)
	Bowl(4)
	Bowl(5)
	Bowl(3)
	Cupboard()
	f1(2)
	Creating new Cupboard() in main
	Bowl(3)
	Cupboard()
	f1(2)
	Creating new Cupboard() in marin
	Bowl(3)
	Cupboard()
	f1(2)
	f2(1)
	f3(1)
*/
