//: concurrency/SimpleDaemons.java

package thinkingJava.concurrency;

import java.util.concurrent.*;
import static net.mindview.util.Print.*;

public class SimpleDaemons implements Runnable {
	public void run() {
		try {
			while (true) {
				TimeUnit.MILLISECONDS.sleep(100);
				print(Thread.currentThread() + " " + this);
			}
		} catch (InterruptedException e) {
			print("sleep() interrupted");
		}
	}

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 10; i++) {
			Thread daemon = new Thread(new SimpleDaemons());
			daemon.setDaemon(true);
			daemon.start();
		}
		print("All daemons started");
		TimeUnit.MILLISECONDS.sleep(175);
	}
}/*output:
All daemons started
Thread[Thread-0,5,main] thinkingJava.concurrency.SimpleDaemons@733480ec
Thread[Thread-2,5,main] thinkingJava.concurrency.SimpleDaemons@1ac76eeb
Thread[Thread-4,5,main] thinkingJava.concurrency.SimpleDaemons@67609231
Thread[Thread-6,5,main] thinkingJava.concurrency.SimpleDaemons@e8562a1
Thread[Thread-8,5,main] thinkingJava.concurrency.SimpleDaemons@1bcbcd2a
Thread[Thread-5,5,main] thinkingJava.concurrency.SimpleDaemons@63093c8e
Thread[Thread-3,5,main] thinkingJava.concurrency.SimpleDaemons@383a7f32
Thread[Thread-7,5,main] thinkingJava.concurrency.SimpleDaemons@1ba1b163
Thread[Thread-9,5,main] thinkingJava.concurrency.SimpleDaemons@51f1f629
Thread[Thread-1,5,main] thinkingJava.concurrency.SimpleDaemons@1c8b6e5a
*/
