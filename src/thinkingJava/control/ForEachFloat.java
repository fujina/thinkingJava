//: control/ForEachFloat.java

package thinkingJava.control;

import java.util.*;

public class ForEachFloat {

	public static void main(String[] args) {
		Random rand = new Random(47);	//47为随机种子，产生的随机是一样的。
		float f[] = new float[10];      //新建 浮点数组[10]
		for(int i = 0; i < 10; i++)
			f[i] = rand.nextFloat();	//从１到１０，依次给数组赋值随机数
		
		for(float x : f)				//分别把f[0],f[1],f[2]等依次赋值给x
			System.out.println(x);		//并打印出来
	}
}/*output:
0.72711575
0.39982635
0.5309454
0.0534122
0.16020656
0.57799757
0.18847865
0.4170137
0.51660204
0.73734957
*/
