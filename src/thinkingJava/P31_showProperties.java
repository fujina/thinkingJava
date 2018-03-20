package thinkingJava;

public class P31_showProperties {

	public P31_showProperties() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.getProperties().list(System.out); 
		//获取一系列信息列表,发送到System.out显示出来
		//System.out可以替换成别的参考，待了解？
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name")); //获取user.name = Administrator
		System.out.println(System.getProperty("java.library.path"));
	}

}
