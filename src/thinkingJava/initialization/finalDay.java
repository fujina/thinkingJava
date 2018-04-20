//: initialization/finalSleep.java

package thinkingJava.initialization;

public class finalDay {
	boolean checkedSleep=false;
	finalDay(boolean checkSleep){
		checkedSleep=checkSleep;
	}
	void gotoWork() {
		checkedSleep=false;
		System.out.println("I am earning Money.");
	}
	void gotoPlay() {
		checkedSleep=false;
		System.out.println("Hey, Let's go to swimming!");
	}
	void gotoBed() {
		System.out.println("I am tired, good night.");
		checkedSleep=true;
	}
	protected void finalize() {
		if(checkedSleep)
			System.out.println("Warning! you must sleep everyday.");
	}
	
	public static void main(String[] args) {
		finalDay d1 = new finalDay(true);
		d1.gotoWork();
		d1.gotoPlay();
		d1.gotoBed();
		/*finalDay d2 = new finalDay(true); 
		d2.gotoWork();
		d2.gotoPlay();					//为什么这样不能触发System.gc()异常?
		*/
		new finalDay(true);
		System.gc();

	}

}
