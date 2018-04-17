// : initialization/PassingThis.java

package thinkingJava.initialization;

class Person{
	public void eat(Apple apple) {			//人类吃苹果，eat 的方法
		Apple peeled = apple.getPeeled();	//苹果apple去皮的方法getPeeled()	
		System.out.println("Yummy");
	}
}

class Peeler{
	static Apple peel(Apple apple) {		//剥皮器
		System.out.println("peeling...");									//去皮
		return apple;						//返回剥好皮的苹果
	}
}

class Apple{
	Apple getPeeled() {						//苹果去皮的方法
		System.out.println("Hey Peeler, Please help me peel the apple.");
		return Peeler.peel(this);			//用剥皮器Peeler剥　"this"　的苹果，然后返回 剥好皮的苹果
	}
}

public class PassingThis {

	public static void main(String[] args) {
		System.out.println("I like apple.");
		new Person().eat(new Apple());
	}
}
