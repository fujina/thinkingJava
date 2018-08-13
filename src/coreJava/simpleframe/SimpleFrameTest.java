//: coreJava/simpleframe/SimpleFrameTest.java

package coreJava.simpleframe;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class SimpleFrameTest {

	public static void main(String[] args) {
		EventQueve.invokeLater(() -> {
			SimpleFrame frame = new SimpleFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}

class SimpleFrame extends JFrame {
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;

	public SimpleFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
