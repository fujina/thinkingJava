//: reusing/Chess.java
package thinkingJava.reusing;

import static net.mindview.util.Print.*;

class Game {
	Game(int i) {
		print("Game constructor: " + i);
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		print("BoardGame constructor: " + i);
	}
}

public class Chess extends BoardGame {
	Chess(int i) {
		super(11);
		print("Chess ocnstructor");
	}

	public static void main(String[] args) {
		Chess x = new Chess(123);
	}
}/*output:
Game constructor: 11
BoardGame constructor: 11
Chess ocnstructor
*/
