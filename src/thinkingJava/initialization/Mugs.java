//: initialization/Mugs.java

package thinkingJava.initialization;
import static net.mindview.util.Print.*;

class Mug{
	Mug(int marker){
		print("Mug(" + marker + ")");
	}
	void f(int marker) {
		print("f("+ marker + ")");
	}
	public class Mugs{
		Mug mug1;
		Mug mug2;
		{
			mug1 = new Mug(1);
			mug2 = new Mug(2);
			print("mug1 & mug2 initializaed");
		}
		Mugs(){
			print("Mugs()");
		}
		Mugs(int i){
			print("Mugs(int)");
		}
		Mugs(String s){
			print("Mugs(string");
		}
	}
}
public class Mugs {

	public static void main(String[] args) {
		print("Inside main()");
		new Mugs();
		print("new Mugs() completed");
		new Mug(47);
		print("new Mug() completed");
		
		//以下new 出错
		//new Mugs(1);						//出错: The constructor Mugs(int) is undefined
		//print("new Mugs(1) completed");
		//new Mugs("String");				//出错:The constructor Mugs(String) is undefined
		//print("new Mugs('String') completed");
	}
}/*output:
Inside main()
new Mugs() completed
Mug(47)
new Mug() completed
*/
