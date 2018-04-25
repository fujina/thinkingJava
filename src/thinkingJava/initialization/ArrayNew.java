//: initialization/ArrayNew.java

package thinkingJava.initialization;
import java.util.*;
import static net.mindview.util.Print.*;

public class ArrayNew {

	public static void main(String[] args) {
		int[] a;
		Random rand = new Random(47);		//随机种子,确定下面产生数字18
		a = new int[rand.nextInt(20)];		//产生一个20以内的随机数,以确定数组a的长度
		print("length of a = " + a.length);
		print(Arrays.toString(a));			//把a数组的所有项目输出成字符串
	}
}/*output:
length of a = 18
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
*/
