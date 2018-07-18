//: concurrency/MoreBasicThreads.java

package thinkingJava.concurrency;

public class MoreBasicThreads {

	public static void main(String[] args) {
		System.out.println("Now, the Lift will begin...");
		for(int i = 0; i < 5 ; i++)
			new Thread(new LiftOff()).start();
		System.out.println("Waiting for LiftOff");
	}
}/*output:
Now, the Lift will begin...
#0(9).
Waiting for LiftOff
#1(9).
#0(8).
#1(8).
#0(7).
#1(7).
#0(6).
#1(6).
#0(5).
#1(5).
#0(4).
#1(4).
#0(3).
#1(3).
#0(2).
#1(2).
#0(1).
#1(1).
#0(Liftoff!).
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
#2(9).
#4(9).
#2(8).
#4(8).
#2(7).
#4(7).
#2(6).
#4(6).
#2(5).
#2(4).
#2(3).
#4(5).
#2(2).
#4(4).
#2(1).
#4(3).
#2(Liftoff!).
#4(2).
#4(1).
#4(Liftoff!).
*/
