//	:initialization/EnumMoney3.java

package thinkingJava.initialization;

public class EnumPocketMoney {
	EnumMoney pocketMoney;

	public EnumPocketMoney(EnumMoney pocket) {
		this.pocketMoney = pocket;
	}

	public void describe() {
		System.out.print("You can buy ");
		switch (pocketMoney) {
		case ONE:
			System.out.println("a cookies.");
			break;
		case TWO:
			System.out.println("a hot corn.");
			break;
		case FIVE:
			System.out.println("a chocolate");
			break;
		case TEN:
			System.out.println("a big apple");
			break;
		case TWENTY:
			System.out.println("a water gun");
			break;
		case HUNDRED:
			System.out.println("a remote control car");
			break;
		default:
			System.out.println("you can buy a cookies");
		}
	}

	public static void main(String[] args) {
		EnumPocketMoney
			badStudent=new EnumPocketMoney(EnumMoney.ONE),
			normalStudent=new EnumPocketMoney(EnumMoney.TWO),
			goodStudent=new EnumPocketMoney(EnumMoney.FIVE),
			veryGoodStudent=new EnumPocketMoney(EnumMoney.TEN),
			superGoodStudent=new EnumPocketMoney(EnumMoney.HUNDRED);

		badStudent.describe();
		normalStudent.describe();
		goodStudent.describe();
		veryGoodStudent.describe();
		superGoodStudent.describe();
	}
}/*output:
You can buy a cookies.
You can buy a hot corn.
You can buy a chocolate
You can buy a big apple
You can buy a remote control car
*/
