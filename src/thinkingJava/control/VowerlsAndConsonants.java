//: control/VowerlsAndConsonants.java

package thinkingJava.control;

public class VowerlsAndConsonants {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			char c = (char) (Math.random() * 26 + 'a');  //随机产生a~z的字母
			System.out.print(c + " : " + i + "  ");
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("vowel");
				break;
			case 'y':
			case 'w':
				System.out.println("Sometimes a vowel");
				break;
			default:
				System.out.println("consonant");
			}
		}
	}

}/*output:
s : 0  consonant
l : 1  consonant
i : 2  vowel
x : 3  consonant
i : 4  vowel
u : 5  vowel
w : 6  Sometimes a vowel
v : 7  consonant
y : 8  Sometimes a vowel
b : 9  consonant
r : 10  consonant
b : 11  consonant
x : 12  consonant
v : 13  consonant
u : 14  vowel
j : 15  consonant
t : 16  consonant
o : 17  vowel
y : 18  Sometimes a vowel
m : 19  consonant
s : 20  consonant
f : 21  consonant
d : 22  consonant
u : 23  vowel
m : 24  consonant
y : 25  Sometimes a vowel
c : 26  consonant
c : 27  consonant
o : 28  vowel
i : 29  vowel
j : 30  consonant
h : 31  consonant
c : 32  consonant
r : 33  consonant
l : 34  consonant
p : 35  consonant
u : 36  vowel
w : 37  Sometimes a vowel
x : 38  consonant
r : 39  consonant
d : 40  consonant
f : 41  consonant
q : 42  consonant
h : 43  consonant
l : 44  consonant
y : 45  Sometimes a vowel
f : 46  consonant
z : 47  consonant
m : 48  consonant
v : 49  consonant
h : 50  consonant
c : 51  consonant
v : 52  consonant
i : 53  vowel
l : 54  consonant
h : 55  consonant
i : 56  vowel
e : 57  vowel
h : 58  consonant
n : 59  consonant
h : 60  consonant
e : 61  vowel
i : 62  vowel
b : 63  consonant
w : 64  Sometimes a vowel
m : 65  consonant
w : 66  Sometimes a vowel
e : 67  vowel
o : 68  vowel
k : 69  consonant
i : 70  vowel
r : 71  consonant
x : 72  consonant
h : 73  consonant
b : 74  consonant
t : 75  consonant
b : 76  consonant
y : 77  Sometimes a vowel
b : 78  consonant
l : 79  consonant
o : 80  vowel
h : 81  consonant
w : 82  Sometimes a vowel
l : 83  consonant
g : 84  consonant
a : 85  vowel
v : 86  consonant
x : 87  consonant
x : 88  consonant
m : 89  consonant
b : 90  consonant
y : 91  Sometimes a vowel
u : 92  vowel
n : 93  consonant
v : 94  consonant
p : 95  consonant
b : 96  consonant
y : 97  Sometimes a vowel
j : 98  consonant
y : 99  Sometimes a vowel
*/
