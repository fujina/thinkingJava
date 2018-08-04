//: concurrency/DaemonFromFactory.java

package thinkingJava.concurrency;

import java.util.concurrent.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

public class DaemonFromFactory implements Runnable {
	public void run() {
		try {
			while (true) {
				TimeUnit.MILLISECONDS.sleep(100);
				print(Thread.currentThread() + " " + this);
			}
		} catch (InterruptedException e) {
			print("Interrupted");
		}
	}

	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
		for (int i = 0; i < 10; i++)
			exec.execute(new DaemonFromFactory());
		print("All daemons started");
		TimeUnit.MILLISECONDS.sleep(500);
	}
}/*output:
All daemons started
Thread[Thread-9,5,main] thinkingJava.concurrency.DaemonFromFactory@1715830b
Thread[Thread-8,5,main] thinkingJava.concurrency.DaemonFromFactory@458a9633
Thread[Thread-4,5,main] thinkingJava.concurrency.DaemonFromFactory@d0ad444
Thread[Thread-2,5,main] thinkingJava.concurrency.DaemonFromFactory@718d5e33
Thread[Thread-0,5,main] thinkingJava.concurrency.DaemonFromFactory@7ac2b429
Thread[Thread-6,5,main] thinkingJava.concurrency.DaemonFromFactory@5faf54c9
Thread[Thread-1,5,main] thinkingJava.concurrency.DaemonFromFactory@20f4cea6
Thread[Thread-3,5,main] thinkingJava.concurrency.DaemonFromFactory@1fc04beb
Thread[Thread-5,5,main] thinkingJava.concurrency.DaemonFromFactory@2b649177
Thread[Thread-7,5,main] thinkingJava.concurrency.DaemonFromFactory@5b708109
Thread[Thread-9,5,main] thinkingJava.concurrency.DaemonFromFactory@1715830b
Thread[Thread-1,5,main] thinkingJava.concurrency.DaemonFromFactory@20f4cea6
Thread[Thread-3,5,main] thinkingJava.concurrency.DaemonFromFactory@1fc04beb
Thread[Thread-5,5,main] thinkingJava.concurrency.DaemonFromFactory@2b649177
Thread[Thread-7,5,main] thinkingJava.concurrency.DaemonFromFactory@5b708109
Thread[Thread-8,5,main] thinkingJava.concurrency.DaemonFromFactory@458a9633
Thread[Thread-4,5,main] thinkingJava.concurrency.DaemonFromFactory@d0ad444
Thread[Thread-2,5,main] thinkingJava.concurrency.DaemonFromFactory@718d5e33
Thread[Thread-0,5,main] thinkingJava.concurrency.DaemonFromFactory@7ac2b429
Thread[Thread-6,5,main] thinkingJava.concurrency.DaemonFromFactory@5faf54c9
Thread[Thread-9,5,main] thinkingJava.concurrency.DaemonFromFactory@1715830b
Thread[Thread-1,5,main] thinkingJava.concurrency.DaemonFromFactory@20f4cea6
Thread[Thread-3,5,main] thinkingJava.concurrency.DaemonFromFactory@1fc04beb
Thread[Thread-5,5,main] thinkingJava.concurrency.DaemonFromFactory@2b649177
Thread[Thread-7,5,main] thinkingJava.concurrency.DaemonFromFactory@5b708109
Thread[Thread-6,5,main] thinkingJava.concurrency.DaemonFromFactory@5faf54c9
Thread[Thread-0,5,main] thinkingJava.concurrency.DaemonFromFactory@7ac2b429
Thread[Thread-2,5,main] thinkingJava.concurrency.DaemonFromFactory@718d5e33
Thread[Thread-4,5,main] thinkingJava.concurrency.DaemonFromFactory@d0ad444
Thread[Thread-8,5,main] thinkingJava.concurrency.DaemonFromFactory@458a9633
Thread[Thread-9,5,main] thinkingJava.concurrency.DaemonFromFactory@1715830b
Thread[Thread-1,5,main] thinkingJava.concurrency.DaemonFromFactory@20f4cea6
Thread[Thread-3,5,main] thinkingJava.concurrency.DaemonFromFactory@1fc04beb
Thread[Thread-5,5,main] thinkingJava.concurrency.DaemonFromFactory@2b649177
Thread[Thread-7,5,main] thinkingJava.concurrency.DaemonFromFactory@5b708109
Thread[Thread-6,5,main] thinkingJava.concurrency.DaemonFromFactory@5faf54c9
Thread[Thread-0,5,main] thinkingJava.concurrency.DaemonFromFactory@7ac2b429
Thread[Thread-2,5,main] thinkingJava.concurrency.DaemonFromFactory@718d5e33
Thread[Thread-4,5,main] thinkingJava.concurrency.DaemonFromFactory@d0ad444
Thread[Thread-8,5,main] thinkingJava.concurrency.DaemonFromFactory@458a9633
*/
