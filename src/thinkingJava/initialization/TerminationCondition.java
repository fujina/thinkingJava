//: initialization/TerminationCondition.java
//Using finalize() to detect an object that hasn't been properly cleaned up.

package thinkingJava.initialization;

class Book{
	boolean checkedOut = false;
	Book(boolean checkOut){
		checkedOut=checkOut;
		System.out.println("check out");
	}
	void checkIn() {
		checkedOut = false;
		System.out.println("check in");
	}
	protected void finalize() {		//finalize()处理 check in 异常
		if(checkedOut)
			System.out.println("Error: checked out");	//如果出错了
		//应该调用上级的 finalize()
		//super.finalize();		//异常交由上级的 base-class处理
	}
}

public class TerminationCondition {

	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIn();	//适当的check in　正常处理
		new Book(true);		//有时候忘记check in 　处理了
		System.gc();		//Garbage Collector　垃圾回收前会先调用　finalize()
							//强制的垃圾回收及终止
	}	
}/*output:
	check out
	check in
	check out
	Error: checked out
*/
