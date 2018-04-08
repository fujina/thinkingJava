// : operator/BreakAndContinue.java

package thinkingJava.operators;

public class BreakAndContinue {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {   //找出74以内的9的倍数
			if (i == 74) // 如果i = 74就跳出for循环
				break;
			if (i % 9 != 0) // 如果不是 9 的倍数就转到下一个循环
				continue;
			System.out.println(i); // 否则（是9的倍数）就把这个数打印出来
		}
		System.out.println("---------------------");
		int i = 0;
		while (true) {
			i++;
			int j = i * 27;
			if (j == 1269)  		// 47 * 27 = 1269, i=47时会触发这个break
				break;
			if (i % 10 != 0)		//如果i 不是10的倍数就转到下一个循环
				continue;
			System.out.println(i);	//如果是10的 倍数，，就打印出i
		}
	}
}