//: strings/Immutable.java

package thinkingJava.strings;

public class Immutable {
	
	public static void print(String s){
		System.out.println(s);
	}
	
	
	public static String upcase(String s) {
		return s.toUpperCase();
	}
	
	public static void main(String[] args) {
		String q = "howdy";
		print(q);
		String qq = upcase(q);  //  q.toUpperCase();
		print(qq);
		print(q);
	}
}

