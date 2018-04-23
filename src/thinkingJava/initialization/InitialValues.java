//: initialization/InitialValues.java
//  显示各种变量的默认初始值
// 　直接使用的变量必需初始化，否则会提示出错
//	但是类的变量则有对应的初始值

package thinkingJava.initialization;

import static net.mindview.util.Print.*;

public class InitialValues {
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	InitialValues reference;
	void printInitialValues() {
		print("Date type		Initial value");
		print("boolean			" + t);
		print("char				"+c);
		print("int			" + i);
		print("long			" + l);
		print("float			" + f);
		print("double			" + d);
		print("reference		" + reference);
	}

	public static void main(String[] args) {
		InitialValues iv = new InitialValues();
		iv.printInitialValues();
	}
}/*output:
Date type		Initial value
boolean			false
char				
int				0
long			0
float			0.0
double			0.0
reference		null				
*/
