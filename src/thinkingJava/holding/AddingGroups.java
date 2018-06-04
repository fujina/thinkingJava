//: holding/AddingGroups.java

package thinkingJava.holding;

import java.util.*;

public class AddingGroups {

	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Integer[] moreInts = { 6, 7, 8, 6, 10 };
		collection.addAll(Arrays.asList(moreInts)); 	//把moreInts数组变为Collection
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		Collections.addAll(collection, moreInts);
		System.out.println(collection.toString());
		
		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
		System.out.println(list.toString());
		list.set(1, 99); //把索引1(0,1,2,3,4,5第2个元素改成99)
		System.out.println(list.toString());
	}
}
