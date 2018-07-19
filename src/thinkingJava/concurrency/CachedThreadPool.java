//: concurrency/CachedThreadPool.java

package thinkingJava.concurrency;

import java.util.concurrent.*;

public class CachedThreadPool {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	}
}/*output:
#0(9).
#2(9).
#4(9).
#2(8).
#4(8).
#2(7).
#4(7).
#2(6).
#4(6).
#2(5).
#4(5).
#2(4).
#4(4).
#2(3).
#4(3).
#2(2).
#4(2).
#2(1).
#4(1).
#2(Liftoff!).
#4(Liftoff!).
#0(8).
#0(7).
#0(6).
#0(5).
#0(4).
#0(3).
#0(2).
#0(1).
#0(Liftoff!).
#1(9).
#1(8).
#1(7).
#1(6).
#1(5).
#1(4).
#1(3).
#1(2).
#1(1).
#1(Liftoff!).
#3(9).
#3(8).
#3(7).
#3(6).
#3(5).
#3(4).
#3(3).
#3(2).
#3(1).
#3(Liftoff!).
*/