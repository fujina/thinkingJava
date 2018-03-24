//: object/p30_Date.java
package thinkingJava.ch2;

/*The first Thinking in Java example program.
 * Displays sa string and today's date.
 * @author Jiangnan
 * @author www.doeryoung.com
 * @version 4.0
 */
import java.util.Date;

public class P30_Date {
	/*Entry point to class & application.
	 * @param args array of string arguments
	 * @throws exceptions No exceptions thrown
	 */
	public P30_Date() {
	}

	@SuppressWarnings("deprecation") 
	public static void main(String[] args) {
		Date myDate = new Date();
		System.out.println(myDate);
		System.out.println("Year: "+ (myDate.getYear() + 1900)); //从1900算起，所以要加上1900
		System.out.println("Month: " + (myDate.getMonth()+1));//0是1月，所以要加1
		System.out.println("Day: " + myDate.getDate());
		System.out.println("Hours: " + myDate.getHours());
		System.out.println("Minutes: " + myDate.getMinutes());
	}
	

}
/*Output: (55% match)
 * Hello. it's:
 * 2018-3-20
 */

