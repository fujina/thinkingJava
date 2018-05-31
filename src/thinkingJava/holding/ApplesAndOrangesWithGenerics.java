//: holding/ApplesAndOrangesWithGenerics.java

package thinkingJava.holding;

import java.util.*;

public class ApplesAndOrangesWithGenerics {

	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for (int i = 0; i < 3; i++)
			apples.add(new Apple());
		//编译器可以阻止把new Orange()放进apple里面
		//apples.add(new Orange());
		//The method add(Apple) in the type ArrayList<Apple> is not applicable for the arguments (Orange)
		for (int i = 0; i < apples.size(); i++)
			System.out.println(apples.get(i).id());
		for (Apple c : apples)
			System.out.println(c.id());
	}
}/*output:
Apple 0
Apple 1
Apple 2
Apple 0
Apple 1
Apple 2
*/
