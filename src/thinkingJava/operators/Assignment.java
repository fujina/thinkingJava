package thinkingJava.operators;

//: operators/Assignment.java

class Tank{
	int level;
}

public class Assignment {
	public static void main(String[] args) {
		Tank t1= new Tank();
		Tank t2= new Tank();
		t1.level=9;
		t2.level=47;
		System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1=t2;  //两者都指向同一个引用了,如何想让t1 和 t2 独立 可改用：
				//t1.level = t2.level;
		System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1.level=27; //两者都指向同一个引用了
		System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
	}

}/*Output:
1: t1.level: 9, t2.level: 47
1: t1.level: 47, t2.level: 47
1: t1.level: 27, t2.level: 27
*/
