//: holding/PrintingContainers.java

package thinkingJava.holding;

import java.util.*;
import static net.mindview.util.Print.*;

public class PrintingContainers {
	static Collection fill(Collection<String> collection) {
		collection.add("兔子");
		collection.add("猫");
		collection.add("狗");
		collection.add("狗");
		return collection;
	}

	static Map fill(Map<String, String> map) {
		map.put("兔子", "胡萝卜");
		map.put("猫", "鱼");
		map.put("狗", "肉");
		map.put("狗", "骨头");
		return map;
	}

	public static void main(String[] args) {
		print(fill(new ArrayList<String>()));
		print(fill(new LinkedList<String>()));
		print(fill(new HashSet<String>()));   //不重复的值
		print(fill(new TreeSet<String>()));		//不重复的值,排序?
		print(fill(new LinkedHashSet<String>()));
		print(fill(new HashMap<String, String>()));
		print(fill(new TreeMap<String, String>()));
		print(fill(new LinkedHashMap<String, String>()));
		
	}
}/*output:
[兔子, 猫, 狗, 狗]
[兔子, 猫, 狗, 狗]
[兔子, 狗, 猫]
[兔子, 狗, 猫]
[兔子, 猫, 狗]
{兔子=胡萝卜, 狗=骨头, 猫=鱼}
{兔子=胡萝卜, 狗=骨头, 猫=鱼}
{兔子=胡萝卜, 猫=鱼, 狗=骨头}
*/
