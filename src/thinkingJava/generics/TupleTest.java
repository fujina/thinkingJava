//: generics/TupleTest.java

package thinkingJava.generics;

import net.mindview.util.*;

class Amphibian {
}

class Vehicle {
}

public class TupleTest {
	static TwoTuple<String, Integer> f() {
		return new TwoTuple<String, Integer>("hi", 47);
	}

	static ThreeTuple<Amphibian, String, Integer> g() {
		return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(), "hi", 47);
	}

	static FourTuple<Vehicle, Amphibian, String, Integer> h() {
		return new FourTuple<Vehicle, Amphibian, String, Integer>(new Vehicle(), new Amphibian(), "hi", 47);
	}

	static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
		return new FiveTuple<Vehicle, Amphibian, String, Integer, Double>(new Vehicle(), new Amphibian(), "hi", 47,
				11.1);
	}

	public static void main(String[] args) {
		TwoTuple<String, Integer> ttsi = f();
		System.out.println(ttsi);
		System.out.println(g());
		System.out.println(h());
		System.out.println(k());
	}
}/*output:
(hi, 47)
(thinkingJava.generics.Amphibian@2a3046da. hi, 47)
(thinkingJava.generics.Vehicle@12f40c25, thinkingJava.generics.Amphibian@3ada9e37, hi, 47)
(thinkingJava.generics.Vehicle@3419866c, thinkingJava.generics.Amphibian@63e31ee, hi, 47, 11.1)
*/
