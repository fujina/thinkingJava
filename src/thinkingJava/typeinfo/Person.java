//: typeinfo/Person.java

package thinkingJava.typeinfo;
import net.mindview.util.*;
import net.mindview.util.Print.*;

public class Person {
	public final String first;
	public final String last;
	public final String address;

	public Person(String first, String last, String address) {
		this.first = first;
		this.last = last;
		this.address = address;
	}

	public String toString() {
		return "Person: " + first + " " + last + " " + address;
	}

	public static class NullPerson extends Person implements Null {
		private NullPerson() {
			super("None", "None", "None");
		}

		public String toString() {
			return "NullPerson";
		}

		public static final Person NULL = new NullPerson();
	}

	public static void main(String[] args) {
		Person p = new Person("ABC", "xyz", "china");
		System.out.println(p);
	}

}
