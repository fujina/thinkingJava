package thinkingJava.ch2;
/*练习10，编写一个程序，打印出从命令行获得的三个参数，
 * 为此需要确定命令行数组中String的下标。
 * Eclipse左边项目文件，右键，Run As， Run Configurations
 * Arguments , Program arguments中输入参数:
 * "I Love Java"只有一个参数
 * I Love Java 有三个参数
 */

public class P37_lesson10 {

	public P37_lesson10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
			System.out.println("Bye");
		else
		{
			System.out.println("There is your arguments");
			for (int i=0; i<args.length;i++) {
				System.out.println("arguments [" + (i+1) + "] : " + args[i]); 
			}
		}

	}

}
