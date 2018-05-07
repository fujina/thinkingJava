package thinkingJava.reusing;

class Day{
	private String s;
	protected String work;
	Day(){
		System.out.println("Day()");
		System.out.println("Let's play all day.");
		s = "Happy all day.";
	}
	public String toString() {
		return s;
	}
}
class Night{
	private String 	s1 = "drinking...",
					s2 = "dancing...";
	private Day d = new Day();
	Night(){
		System.out.println("Night()");
	}
	public String toString() {
		if(d.work==null)
			d.work="Oops, I must do my work now.\n So easy the work...finished!";
		return 
				" s1 = " + s1 +"\n" +
				" s2 = " + s2 + "\n" + 
				" work = " + d.work + "\n" + 
				" d = " + d + "\n";
	}
}
 
public class Lazy {

	public static void main(String[] args) {
		Night n = new Night();
		System.out.println(n);
	}

}
