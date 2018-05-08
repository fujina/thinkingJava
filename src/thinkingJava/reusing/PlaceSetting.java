//: reusing/PlaceSetting.java

package thinkingJava.reusing;

import static net.mindview.util.Print.*;

class Plate {
	Plate(int i) {
		print("Plate constructor");
	}
}

class DinnerPlate extends Plate {
	DinnerPlate(int i) {
		super(i);
		print("DinnerPlate constructor");
	}
}

class Utensil {
	Utensil(int i) {
		print("Utensil constructor");
	}
}

class Spoon extends Utensil {
	Spoon(int i) {
		super(i);
		print("Spoon constructor");
	}
}

class Fork extends Utensil {
	Fork(int i) {
		super(i);
		print("Fork constructor");
	}
}

class Knife extends Utensil {
	Knife(int i) {
		super(i);
		print("Knife constructor");
	}
}

class Custom {
	Custom(int i) {
		print("Custom constructor");
	}
}

public class PlaceSetting extends Custom {	//必需先初始化Custom
	//super(i+1);							//这里不能初始化, 只能定义成员及变量
	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;

	public PlaceSetting(int i) {//super(i+1),如果super不运行初始化会出错:
		super(i +1);			//Implicit super constructor Custom() is undefined. 
								//Must explicitly invoke another constructor
		sp = new Spoon(i+2);
		frk = new Fork(i +3);
		kn = new Knife(i +4);
		pl = new DinnerPlate(i + 5);
		print("PlaceSetting constructor");
	}

	public static void main(String[] args) {
		PlaceSetting x = new PlaceSetting(9);
	}
}/*output:
Custom constructor
Utensil constructor
Spoon constructor
Utensil constructor
Fork constructor
Utensil constructor
Knife constructor
Plate constructor
DinnerPlate constructor
PlaceSetting constructor
*/
