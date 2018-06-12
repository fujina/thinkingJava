//: strings/InfiniteRecursion.java

package thinkingJava.strings;

import java.util.*;

public class InfiniteRecursion {
	public String toString() {
		//return " InfiniteRecursion address: " + this + "\n";   	//会出错: 无限递归调用 InfiniteRecursion address:
		return " InfiniteRecursion address: " + super.toString() + "\n"; 
	}

	public static void main(String[] args) {
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		for (int i = 0; i < 10; i++)
			v.add(new InfiniteRecursion());
		System.out.println(v);
	}
}/*output:
[ InfiniteRecursion address: thinkingJava.strings.InfiniteRecursion@424c0bc4
,  InfiniteRecursion address: thinkingJava.strings.InfiniteRecursion@3c679bde
,  InfiniteRecursion address: thinkingJava.strings.InfiniteRecursion@16b4a017
,  InfiniteRecursion address: thinkingJava.strings.InfiniteRecursion@8807e25
,  InfiniteRecursion address: thinkingJava.strings.InfiniteRecursion@2a3046da
,  InfiniteRecursion address: thinkingJava.strings.InfiniteRecursion@2a098129
,  InfiniteRecursion address: thinkingJava.strings.InfiniteRecursion@198e2867
,  InfiniteRecursion address: thinkingJava.strings.InfiniteRecursion@12f40c25
,  InfiniteRecursion address: thinkingJava.strings.InfiniteRecursion@3ada9e37
,  InfiniteRecursion address: thinkingJava.strings.InfiniteRecursion@5cbc508c
]
*/
