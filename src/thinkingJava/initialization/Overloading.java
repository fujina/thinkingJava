//: initialization/Overloading.java

package thinkingJava.initialization;
import static net.mindview.util.Print.*;

class Tree{
	int height;
	Tree(){
		print("Planting a seedling");	//种树，默认高度是0
		height = 0;
	}
	Tree(int initialHeight){			//种树，并设定树的高度
		height = initialHeight;
		print("Creating new Tree that is " + height + " feet tall");
	}
	void info() {
		print("Tree is " + height + " feet tall");	//返回树的高度
	}
	void info(String s) {
		print(s + ": Tree is " + height + " feet tail");	//
	}
}
public class Overloading {

	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("overloaded method");
		}
	}
}
