//: operator/LabeledFor.java

package thinkingJava.operators;

public class LabeledFor {

	public static void main(String[] args) {
		int i = 0;
		outer: 
			for(; true ;) {
			inner:   //The label inner is never explicitly referenced
				for (; i < 10; i++) {
				prt("i = " + i);
				if (i == 2) {
					prt("continue");
					continue;
				}
				if (i == 3) {
					prt("break");
					i++;
					break;
				}
				if (i == 7) {
					prt("continue outer");
					i++;
					continue outer;
				}
				if (i == 8)
					prt("break outer");
				break outer;
			}
			for (int k = 0; k < 5; k++) {
				if (k == 3) {
					prt("continue inner");
					//continue inner;  //The label inner is missing
				}
				
			}
			
		}

	}

	static void prt(String s) {
		System.out.println(s);
	}
}
