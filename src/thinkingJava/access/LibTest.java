package thinkingJava.access;

import thinkingJava.simple.*;		//import这两个包都包含了Vector类,
import java.util.*;					//如果不使用冲突的Vector()代码,是不会提示出错的.

public class LibTest {

	public static void main(String[] args) {
		System.out.println("There two Vector class! ");
		//Vector v = new Vector();		//thinkingJava.simple.* 和java.util.* 的类冲突
	}

}/*error:
Multiple markers at this line
	- The type Vector is ambiguous
	- The type Vector is ambiguous
*/
