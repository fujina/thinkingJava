//: control/Students.java
//练习1 创建一个类，它包含一个未初始化的String引用，验证该引被Java初始化成numm
//练习2 创建一个类，它包含一个在定义时就被初始化了的　String域，以及另一个通过构造器初始化的String

package thinkingJava.control;

class Girls {
	String name;

	Girls() {
	}

	Girls(String n) {
		name = n;
	}
}

public class Students {

	public static void main(String[] args) {
		Girls g = new Girls();
		System.out.println(g.name);
		Girls g2 = new Girls("Nancy");
		System.out.println(g2.name);
		Girls g3 = new Girls();
		g3.name = "Popy";
		System.out.println(g3.name);
	}
}/*output:
null
Nancy
Popy
*/
