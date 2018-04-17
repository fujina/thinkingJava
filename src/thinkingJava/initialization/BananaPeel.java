// :initialization/BananaPeel.java

package thinkingJava.initialization;

class Banana{void peel(int i) {
	System.out.println(this.toString()+"\t"+i);
}
}
public class BananaPeel {

	public static void main(String[] args) {
		Banana a = new Banana();
		Banana b = new Banana();
		a.peel(1);
		b.peel(2);
	}

}
