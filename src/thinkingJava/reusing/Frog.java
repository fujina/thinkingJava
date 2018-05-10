package thinkingJava.reusing;

class Amphibian {
	protected void Say() {
		System.out.println("Amphibian.");
	}
}

final class Frog extends Amphibian {
	protected void Say() {
		System.out.println("Flog.");
	}

	public static void main(String[] args) {
		Amphibian a = new Amphibian();
		a.Say();
		Frog f = new Frog();
		f.Say();
		Amphibian f2a = f;
		f2a.Say();
	}
}/*output:
Amphibian.
Flog.
Flog.  //为什么不是Amphibian?
*/
