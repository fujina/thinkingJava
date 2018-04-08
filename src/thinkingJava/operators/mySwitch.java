//: operator/mySwitch.java

package thinkingJava.operators;

public class mySwitch {

	public static void main(String[] args) {
		int c;
		for (int j = 0; j < 8; j++) {
			c = (int) (Math.random() * 7) + 1;
			System.out.println(c);
			switch (c) {
			case 1:
				System.out.println("Today is Monday. ");
				break;
			case 2:
				System.out.println("Today is Tuesday. ");
				break;
			case 3:
				System.out.println("Today is Wednesday. ");
				break;
			case 4:
				System.out.println("Today is Thursday. ");
				break;
			case 5:
				System.out.println("Today is Friday. ");
				break;
			case 6:
				System.out.println("Today is Saturday. ");
				break;
			case 7:
				System.out.println("Today is Sunday. ");
				break;
			default:
				System.out.println("Sorry, I don't know.");
			}
		}

	}

}/*
	 * output: 
4
Today is Thursday. 
4
Today is Thursday. 
4
Today is Thursday. 
1
Thday is Monday. 
3
Today is Wednesday. 
5
Today is Friday. 
4
Today is Thursday. 
1
Thday is Monday. 

	 */
