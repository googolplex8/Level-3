
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextEditor implements KeyListener {
	Stack<String> letters = new Stack<String>();
	String words = "";

	public static void main(String[] args) {
		new TextEditor().createUI();
	}

	JFrame frame = new JFrame("Text Editor");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	public void createUI() {
		frame.setVisible(true);
		frame.setSize(1000, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);
		// frame.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE && words.length() != 0) {
			letters.push("" + words.charAt(words.length() - 1));
			words = words.substring(0, words.length() - 1);
			label.setText(words);
			System.out.println("delete");
		} else if (e.getKeyCode() == KeyEvent.VK_UP && letters.size()!=0) {
			System.out.println(letters.peek());
			words = words + letters.pop();
			label.setText(words);
		} else if(e.getKeyCode() != KeyEvent.VK_UP){
			words = words + e.getKeyChar();
			//letters.push("" + e.getKeyChar());
			label.setText(words);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
