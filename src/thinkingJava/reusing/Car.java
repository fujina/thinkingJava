//: reusing/Car.java

package thinkingJava.reusing;

class Engine {
	public void start() {		//启动
	}

	public void rev() {			//倒退
	}

	public void stop() {		//熄火
	}
	
	public void service() {
		System.out.println("service for Engine.");
	}
}

class Wheel {
	public void inflate(int psi) {	//给轮胎打气,PSI气压设定
	}
}

class Window {
	public void rollup() {		//窗户上升
	}

	public void rolldown() {	//窗户下降
	}
}

class Door {
	public Window window = new Window();
	public void open() {		//开门
	}

	public void clase() {		//关门
	}
}

public class Car {
	public Engine engine = new Engine();	//新引擎
	public Wheel[] wheel = new Wheel[4];	//4个轮子
	public Door left = new Door(), right = new Door();	//左边一个门,右边一个门

	public Car() {
		for (int i = 0; i < 4; i++)
			wheel[i] = new Wheel();			//装上4个轮子
	}

	public static void main(String[] args) {
		Car car = new Car();				//来一台新车
		car.left.window.rollup();			//左边窗户上升
		car.wheel[0].inflate(72);			//给轮胎0打气72PSI
		car.engine.service();
	}
}
