package thinkingJava.operators;

public class BitOffset {

	public static void main(String[] args) {
		long l = 9223372036854775807L;
		long ll;
		System.out.println("0 : " + Long.toBinaryString(l));
		for(int i = 1; i< 64 ; i++)
		{
			ll = l << i;
			System.out.println(i + " : " + Long.toBinaryString(ll));
			ll = l >>> i;
			System.out.println(i + " : " + Long.toBinaryString(ll));
		}

	}

}
