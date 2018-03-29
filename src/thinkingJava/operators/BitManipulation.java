// : operators/BitManipulation.java
package thinkingJava.operators;

import java.util.*;
//import static net.mindview.util.Print.*;

public class BitManipulation {
	public static void main(String[] args) {
		Random rand = new Random(47);
		int i = rand.nextInt();
		int j = rand.nextInt();
		//printBinaryInt("-1", -1);
		System.out.println("-1 : " + Integer.toBinaryString(-1));
		System.out.println("+1 : " + Integer.toBinaryString(+1));
		int maxpos = 2147483647;
		System.out.println("maxpos : " +  maxpos);
		System.out.println("maxpos : " + Integer.toBinaryString(maxpos));
		int maxeng = -2147483648;
		System.out.println("maxeng : " + maxeng);
		System.out.println("maxeng : " + Integer.toBinaryString(maxeng));
		System.out.println("i  : " + i + " : " + Integer.toBinaryString(i));
		System.out.println("~i : " + ~i + "  : " + Integer.toBinaryString(~i));
		System.out.println("-i : " + -i + "  : " + Integer.toBinaryString(-i));
		System.out.println("j  : " + j + "  : " + Integer.toBinaryString(j));
		System.out.println("i & j : " + (i & j) + " : " + Integer.toBinaryString(i & j));
		System.out.println("i | j : " + (i | j) + " : " + Integer.toBinaryString(i | j));
		System.out.println("i ^ j : " + (i ^ j) + " : " + Integer.toBinaryString(i ^ j));
		System.out.println("i << 5 : " + (i << 5) + " : " + Integer.toBinaryString(i << 5));
		System.out.println("i >> 5 : " + (i >> 5) + " : " + Integer.toBinaryString(i >> 5));
		System.out.println("(~i) >> 5 : " + ((~i)>>5) + " : " + Integer.toBinaryString((~i)>>5));
		System.out.println("i >>> 5 : " + (i >>> 5) + " : " + Integer.toBinaryString(i >>> 5));
		System.out.println("(~i) >>> 5 : " + ((~i)>>>5) + " : " + Integer.toBinaryString((~i)>>>5));
		
		long l = rand.nextLong();
		long m = rand.nextLong();
		System.out.println("-1L : " + -1L + " : " + Long.toBinaryString(-1L));
		System.out.println("+1L : " + +1L + " : " + Long.toBinaryString(+1L));
		long ll = 9223372036854775807L;
		System.out.println("maxpos : " + ll + " : " + Long.toBinaryString(ll));
		long lln = -9223372036854775808L;
		System.out.println("maxneg : " + lln + " : " + Long.toBinaryString(lln));
		System.out.println("l : " + l + " : " + Long.toBinaryString(l));
		System.out.println("~l : " + ~l + " : " + Long.toBinaryString(~l));
		System.out.println("-l : " + -l + " : " + Long.toBinaryString(-l));
		System.out.println("m : " + m + " : " + Long.toBinaryString(m));
		System.out.println("l & m : " + (l & m) + " : " + Long.toBinaryString((l & m)));
		System.out.println("l | m : " + (l | m) + " : " + Long.toBinaryString((l | m)));
		System.out.println("l ^ m : " + (l ^ m) + " : " + Long.toBinaryString((l ^ m)));
		System.out.println("l << 5 : " + (l << 5) + " : " + Long.toBinaryString((l << 5)));
		System.out.println("l >> 5 : " + (l >> 5) + " : " + Long.toBinaryString((l >> 5)));
		System.out.println("-l >> 5 : " + (-l >> 5) + " : " + Long.toBinaryString((-l >> 5)));
		System.out.println("l >>> 5 : " + (l >>> 5) + " : " + Long.toBinaryString((l >>> 5)));
		System.out.println("-l >>> 5 : " + (-l >>> 5) + " : " + Long.toBinaryString((-l >>> 5)));
		
	}

}
