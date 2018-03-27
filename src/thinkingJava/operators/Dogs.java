package thinkingJava.operators;

class Dog {
	String name;
	String says;
}

public class Dogs {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		d1.name = "spot";
		d1.says = "Ruff!";
		d2.name = "scruffy";
		d2.says = "Wurf!";
		System.out.println(d1.name + " : " + d1.says);
		System.out.println(d2.name + " : " + d2.says);
		Dog d3 = d1;							//引用是一样的
		System.out.println(d1 == d3);
		System.out.println(d1.name == d3.name);
		System.out.println(d1.says == d3.says);

		System.out.println(d1 == d3);
		System.out.println(d1.name == d3.name);
		System.out.println(d1.says == d3.says);

		Dog d4 = new Dog();
		d4.name = d3.name;
		d4.says = d3.says;

		System.out.println(d4 == d3);			//引用不一样，false
		System.out.println(d4.name == d3.name);//true
		System.out.println(d4.says == d3.says);//true

	}

}/*Output:
spot : Ruff!
scruffy : Wurf!
true
true
true
true
true
true
false
true
true
*/
