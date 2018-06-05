
package thinkingJava.holding;

import java.util.*;

public class hashMap {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();  
		map.put("s1", 1);
		map.put("s2", 2);
		map.put("s3", 3);
		map.put("s4", 4);
		map.put("s5", 5);
		map.put(null, 9);
		map.put("s6", 6);
		map.put("s7", 7);
		map.put("s8", 8);
		map.put(null, 11);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println(map);

	}
}/*output:
s3:3
null:11
s4:4
s5:5
s6:6
s7:7
s8:8
s1:1
s2:2
{s3=3, null=11, s4=4, s5=5, s6=6, s7=7, s8=8, s1=1, s2=2}

*/