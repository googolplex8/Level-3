import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WordHouser implements ActionListener {
public static void main(String[] args) {
	new WordHouser().CreateUI();
}
ArrayList <String> messages = new ArrayList<>();
String remove = "";
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton add = new JButton("Add");
JButton view = new JButton("View");
JButton delete = new JButton("Delete");
public void CreateUI(){
	frame.add(panel);
	frame.setVisible(true);
	frame.setSize(500, 200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.add(add);
	panel.add(view);
	panel.add(delete);
	add.addActionListener(this);
	view.addActionListener(this);
	delete.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed == add) {
		messages.add(JOptionPane.showInputDialog("Enter Text Here"));
	}
	if(buttonPressed == view){
		JOptionPane.showMessageDialog(null, messages);
	}
	if(buttonPressed == delete){
		remove = JOptionPane.showInputDialog("Enter word or phrase you would like to delete");
		for(String x : messages){
			if(x.equals(remove)){
			messages.remove(x);
			break;
			}
			else{
				JOptionPane.showMessageDialog(null, "Your word or phrase has not been found");
			}
		}
	}
}
}
