//: initialization/InitialValues2.java

package thinkingJava.initialization;

import static net.mindview.util.Print.*;

public class InitialValues2 {
	boolean t=true;
	char c='x';
	byte b=47;
	short s=0xff;
	int i=999;
	long l=1;
	float f=3.14f;
	double d=3.14159;
	InitialValues reference;
	void printInitialValues2() {
		print("Date type		Initial value");
		print("boolean			" + t);
		print("char			"+c);
		print("int			" + i);
		print("long			" + l);
		print("float			" + f);
		print("double			" + d);
		print("reference		" + reference);
	}

	public static void main(String[] args) {
		InitialValues2 iv = new InitialValues2();
		iv.printInitialValues2();
	}
}/*output:
Date type		Initial value
boolean			true
char			x
int				999
long			1
float			3.14
double			3.14159
reference		null			
*/
