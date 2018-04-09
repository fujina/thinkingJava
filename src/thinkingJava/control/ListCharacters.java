//: control/ListCharacters.java

package thinkingJava.control;

public class ListCharacters {

	public static void main(String[] args) {
		for(char c = 0; c<200; c++)
			if(Character.isLowerCase(c))  	//如果是小写字母,除了abc...xyz26个小写英文字母
											//ªµ º等ASCII也属于小写字母
				System.out.println("value: " + (int)c + " character: "+ c);
		
		
		System.out.println("===================================");
		
		
		for(char c = 0; c<200; c++)				//for里面的char c是局部变量，每次都要重新定义
			if(Character.isUpperCase(c))		//如果是大写字母,除了ABC...XYZ26个大写英文字母
											//Å  Æ  Ç 等ASCII也属于大写字母
				System.out.println("value: " + (int)c + " character: "+ c);
		
		
	}

}/*output:
value: 97 character: a
value: 98 character: b
value: 99 character: c
value: 100 character: d
value: 101 character: e
value: 102 character: f
value: 103 character: g
value: 104 character: h
value: 105 character: i
value: 106 character: j
value: 107 character: k
value: 108 character: l
value: 109 character: m
value: 110 character: n
value: 111 character: o
value: 112 character: p
value: 113 character: q
value: 114 character: r
value: 115 character: s
value: 116 character: t
value: 117 character: u
value: 118 character: v
value: 119 character: w
value: 120 character: x
value: 121 character: y
value: 122 character: z
value: 170 character: ª
value: 181 character: µ
value: 186 character: º
===================================
value: 65 character: A
value: 66 character: B
value: 67 character: C
value: 68 character: D
value: 69 character: E
value: 70 character: F
value: 71 character: G
value: 72 character: H
value: 73 character: I
value: 74 character: J
value: 75 character: K
value: 76 character: L
value: 77 character: M
value: 78 character: N
value: 79 character: O
value: 80 character: P
value: 81 character: Q
value: 82 character: R
value: 83 character: S
value: 84 character: T
value: 85 character: U
value: 86 character: V
value: 87 character: W
value: 88 character: X
value: 89 character: Y
value: 90 character: Z
value: 192 character: À
value: 193 character: Á
value: 194 character: Â
value: 195 character: Ã
value: 196 character: Ä
value: 197 character: Å
value: 198 character: Æ
value: 199 character: Ç
	*/

