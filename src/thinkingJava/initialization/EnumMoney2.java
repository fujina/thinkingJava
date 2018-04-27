//	:initialization/EnumMoney2.java

package thinkingJava.initialization;

public class EnumMoney2 {
	public static void main(String[] args) {
		for (EnumMoney em : EnumMoney.values())
			System.out.println(em + "  YUAN");
	}
}
