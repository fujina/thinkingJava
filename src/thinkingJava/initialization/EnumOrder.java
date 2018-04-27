//:	initialization/EnumOrder.java
//	enum的values()可返回列表数组
//	enum的.ordinal()可返回该枚举的排行序号从0~n-1

package thinkingJava.initialization;

public class EnumOrder {

	public static void main(String[] args) {
		for (Spiciness s : Spiciness.values())
			System.out.println(s + " , ordinal " + s.ordinal());
	}
}/*output:
NOT , ordinal 0
MILD , ordinal 1
MEDIUM , ordinal 2
HOT , ordinal 3
FLAMING , ordinal 4
*/
